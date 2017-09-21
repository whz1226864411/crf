package com.creat.secret.controller;

import com.creat.secret.po.*;
import com.creat.secret.service.BlfyService;
import com.creat.secret.service.CrfService;
import com.creat.secret.utils.BindingResultConverter;
import com.creat.secret.utils.UUIDUtil;
import com.creat.secret.validgroup.BlfySaveGroup;
import com.creat.secret.validgroup.BlfyUpdateGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.util.resources.it.CalendarData_it;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/8/25.
 */
@Controller
@RequestMapping("/blfy")
public class BlfyController {

    @Autowired
    private CrfService crfService;
    @Autowired
    private BlfyService blfyService;

    @RequestMapping(value = "/saveBlfy",method = RequestMethod.POST)
    public @ResponseBody Message saveBlfy(@Validated(value = {BlfySaveGroup.class}) Blfy blfy,
                                          BindingResult result, HttpServletRequest request){
        if(result.hasErrors()){
            return BindingResultConverter.wrapErrors(result);
        }else {
            HttpSession session = request.getSession();
            Message message = new Message();
            CrfInforCustom crfInforCustom = (CrfInforCustom) session.getAttribute("crfInforCustom");
            if(crfInforCustom == null) {
                crfInforCustom = crfService.creatCrfInforCustom();
                crfInforCustom.setBlfy(blfy);
                session.setAttribute("crfInforCustom",crfInforCustom);
                message.setSuccess(true);
                message.setMessage("保存成功!");
            }else {
                crfInforCustom.setBlfy(blfy);
                message.setSuccess(true);
                message.setMessage("保存成功!");
            }
            return message;
        }
    }

    @RequestMapping(value = "/updateBlfy",method = RequestMethod.POST)
    public @ResponseBody Message updateBlfy(
            @Validated(value = {BlfyUpdateGroup.class}) Blfy blfy, BindingResult result){
        if(result.hasErrors()){
            return BindingResultConverter.wrapErrors(result);
        }else {
            Message message = new Message();
            boolean needUpdateFinished = blfy.getBlfyId() == null ? true : false;
            blfyService.updateBlfy(blfy);
            if(needUpdateFinished){
                crfService.updateFinished(blfy.getPatientInforId());
            }
            message.setSuccess(true);
            message.setMessage("修改成功！");
            return message;
        }
    }
}
