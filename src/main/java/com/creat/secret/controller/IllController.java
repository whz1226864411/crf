package com.creat.secret.controller;

import com.creat.secret.po.CrfInforCustom;
import com.creat.secret.po.HospitalInfor;
import com.creat.secret.po.Ill;
import com.creat.secret.po.Message;
import com.creat.secret.service.CrfService;
import com.creat.secret.service.IllService;
import com.creat.secret.utils.BindingResultConverter;
import com.creat.secret.utils.UUIDUtil;
import com.creat.secret.validgroup.IllSaveGroup;
import com.creat.secret.validgroup.IllUpdateGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by whz on 2017/8/25.
 */
@Controller
@RequestMapping("/ill")
public class IllController {

    @Autowired
    private CrfService crfService;

    @Autowired
    private IllService illService;

    @RequestMapping(value = "/saveIll",method = RequestMethod.POST)
    public @ResponseBody
    Message saveIll(@Validated(value = {IllSaveGroup.class}) Ill ill,
                    BindingResult result, HttpServletRequest request){
        if(result.hasErrors()){
            return BindingResultConverter.wrapErrors(result);
        }else {
            HttpSession session = request.getSession();
            Message message = new Message();
            CrfInforCustom crfInforCustom = (CrfInforCustom) session.getAttribute("crfInforCustom");
            if(crfInforCustom == null) {
                crfInforCustom = crfService.creatCrfInforCustom();
                crfInforCustom.setIll(ill);
                session.setAttribute("crfInforCustom",crfInforCustom);
                message.setSuccess(true);
                message.setMessage("保存成功!");
            }else {
                crfInforCustom.setIll(ill);
                message.setSuccess(true);
                message.setMessage("保存成功!");
            }
            return message;
        }
    }

    @RequestMapping(value = "/updateIll",method = RequestMethod.POST)
    public @ResponseBody Message updateIll(@Validated(value = {IllUpdateGroup.class}) Ill ill,
                                           BindingResult result){
        if(result.hasErrors()){
            return BindingResultConverter.wrapErrors(result);
        }else{
            Message message = new Message();
            boolean needUpdateFinished = ill.getIllId() == null ? true : false;
            illService.updateIll(ill);
            if(needUpdateFinished){
                crfService.updateFinished(ill.getPatientInforId());
            }
            message.setSuccess(true);
            message.setMessage("修改成功");
            return message;
        }
    }
}
