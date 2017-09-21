package com.creat.secret.controller;

import com.creat.secret.po.CrfInforCustom;
import com.creat.secret.po.Message;
import com.creat.secret.po.ZlqkCustom;
import com.creat.secret.service.CrfService;
import com.creat.secret.service.ZlqkService;
import com.creat.secret.utils.BindingResultConverter;
import com.creat.secret.validgroup.ZlqkSaveGroup;
import com.creat.secret.validgroup.ZlqkUpdateGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


/**
 * Created by Administrator on 2017/8/25.
 */
@Controller
@RequestMapping("/zyqk")
public class ZyqkController {
    @Autowired
    private CrfService crfService;
    @Autowired
    private ZlqkService zlqkService;

    @RequestMapping(value="/saveZlqk",method = RequestMethod.POST)
    public @ResponseBody
    Message saveZlqk(@Validated(value = {ZlqkSaveGroup.class}) ZlqkCustom zyqkCustom,
                     BindingResult result, HttpServletRequest request){
        if(result.hasErrors()){
            return BindingResultConverter.wrapErrors(result);
        }
        HttpSession session = request.getSession();
        Message message = new Message();
        CrfInforCustom crfInforCustom = (CrfInforCustom) session.getAttribute("crfInforCustom");
        if(crfInforCustom == null) {
            crfInforCustom = crfService.creatCrfInforCustom();
            crfInforCustom.setZlqkCustom(zyqkCustom);
            session.setAttribute("crfInforCustom",crfInforCustom);
            message.setSuccess(true);
            message.setMessage("保存成功!");
        }else {
            crfInforCustom.setZlqkCustom(zyqkCustom);
            message.setSuccess(true);
            message.setMessage("保存成功!");
        }
        return message;
    }

    @RequestMapping(value = "/updateZlqk",method = RequestMethod.POST)
    public @ResponseBody Message updateZlqk(
            @Validated(value = {ZlqkUpdateGroup.class}) ZlqkCustom zyqkCustom,
            BindingResult result){
        if(result.hasErrors()){
            return BindingResultConverter.wrapErrors(result);
        }
        Message message = new Message();
        boolean needUpdateFinished = zyqkCustom.getZlqkId() == null ? true : false;
        zlqkService.updateZlqk(zyqkCustom);
        if(needUpdateFinished){
            crfService.updateFinished(zyqkCustom.getPatientInforId());
        }
        message.setSuccess(true);
        message.setMessage("修改成功");
        return message;
    }
}
