package com.creat.secret.controller;

import com.creat.secret.po.*;
import com.creat.secret.service.CrfService;
import com.creat.secret.service.PicTooManyException;
import com.creat.secret.service.TjxmService;
import com.creat.secret.utils.BindingResultConverter;
import com.creat.secret.utils.FileUpLoadUtil;
import com.creat.secret.utils.UUIDUtil;
import com.creat.secret.validgroup.TjxmSaveGroup;
import com.creat.secret.validgroup.TjxmUpdateGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/8/25.
 */
@Controller
@RequestMapping("/tjxm")
public class TjxmController {

    @Autowired
    private CrfService crfService;
    @Autowired
    private TjxmService tjxmService;

    @RequestMapping(value = "/saveTjxm",method = RequestMethod.POST)
    public @ResponseBody
    Message saveTjxm(@Validated(value = {TjxmSaveGroup.class}) TjxmCustom tjxmCustom,
                     BindingResult result,PictureFiles pictureFiles, HttpServletRequest request){
        if(result.hasErrors()){
            return BindingResultConverter.wrapErrors(result);
        }
        HttpSession session = request.getSession();
        Message message = new Message();
        List<List<String>> multipartFiles = null;
        if(pictureFiles != null){
            multipartFiles = pictureFiles.getMultipartFiles();
        }
        for(int i = 0; i < tjxmCustom.getNdtCustomList().size(); i++){
            NdtCustom ndtCustom = tjxmCustom.getNdtCustomList().get(i);
            if(multipartFiles != null && multipartFiles.size() > i){
                List<String> pics = multipartFiles.get(0);
                if(pics != null && pics.size() > 0){
                    List<Pic> picList = new ArrayList<Pic>();
                    if(pics.size() > 3){
                        message.setSuccess(false);
                        message.setMessage("照片上传每次不能多于3张！");
                        return message;
                    }
                    for(int n = 0; n < pics.size(); n++){
                        //Pic pic = tjxmService.uploadPics(pics[i]);
                        Pic pic =new Pic();
                        pic.setPicUrl(pics.get(n));
                        picList.add(pic);
                    }
                    ndtCustom.setPicList(picList);
                }
            }
        }
        CrfInforCustom crfInforCustom = (CrfInforCustom) session.getAttribute("crfInforCustom");
        if(crfInforCustom == null) {
            crfInforCustom = crfService.creatCrfInforCustom();
            crfInforCustom.setTjxmCustom(tjxmCustom);
            session.setAttribute("crfInforCustom",crfInforCustom);
            message.setSuccess(true);
            message.setMessage("保存成功!");
        }else {
            crfInforCustom.setTjxmCustom(tjxmCustom);
            message.setSuccess(true);
            message.setMessage("保存成功!");
        }
        return message;
    }

    @RequestMapping(value = "/updateTjxm", method = RequestMethod.POST)
    public @ResponseBody Message updateTjxm(
            @Validated(value = {TjxmUpdateGroup.class}) TjxmCustom tjxmCustom,
            BindingResult result,PictureFiles pictureFiles){
        if(result.hasErrors()){
            return BindingResultConverter.wrapErrors(result);
        }
        Message message = new Message();
        boolean needUpdateFinished = tjxmCustom.getTjxmId() == null ? true : false;
        try {
            tjxmService.updateTjxm(tjxmCustom, pictureFiles);
            if(needUpdateFinished){
                crfService.updateFinished(tjxmCustom.getPatientInforId());
            }
            message.setSuccess(true);
            message.setMessage("修改成功！");
        } catch (PicTooManyException e) {
            message.setSuccess(false);
            message.setMessage(e.getMessage());
        }
        return message;
    }
}
