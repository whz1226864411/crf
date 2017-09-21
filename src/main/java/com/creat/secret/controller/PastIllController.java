package com.creat.secret.controller;

import com.creat.secret.po.CrfInforCustom;
import com.creat.secret.po.HospitalInfor;
import com.creat.secret.po.Message;
import com.creat.secret.po.PastIll;
import com.creat.secret.service.CrfService;
import com.creat.secret.service.PastIllService;
import com.creat.secret.utils.BindingResultConverter;
import com.creat.secret.utils.UUIDUtil;
import com.creat.secret.validgroup.PastIllSaveGroup;
import com.creat.secret.validgroup.PastIllUpdateGroup;
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
 * Created by Administrator on 2017/8/25.
 */
@Controller
@RequestMapping("/pastIll")
public class PastIllController {

    @Autowired
    private CrfService crfService;
    @Autowired
    private PastIllService pastIllService;

    @RequestMapping(value = "/savePastIll",method = RequestMethod.POST)
    public @ResponseBody
    Message savePastIll(@Validated(value = {PastIllSaveGroup.class}) PastIll pastIll,
                        BindingResult result, HttpServletRequest request){
        if(result.hasErrors()){
            return BindingResultConverter.wrapErrors(result);
        }
        HttpSession session = request.getSession();
        Message message = new Message();
        CrfInforCustom crfInforCustom = (CrfInforCustom) session.getAttribute("crfInforCustom");
        if(crfInforCustom == null) {
            crfInforCustom = crfService.creatCrfInforCustom();
            crfInforCustom.setPastIll(pastIll);
            session.setAttribute("crfInforCustom",crfInforCustom);
            message.setSuccess(true);
            message.setMessage("保存成功!");
        }else {
            crfInforCustom.setPastIll(pastIll);
            message.setSuccess(true);
            message.setMessage("保存成功!");
        }
        return message;
    }

    @RequestMapping(value = "/updatePastIll",method = RequestMethod.POST)
    public @ResponseBody
    Message updatePastIll(@Validated(value = {PastIllUpdateGroup.class}) PastIll pastIll,
                          BindingResult result, HttpServletRequest request){
        if(result.hasErrors()){
            return BindingResultConverter.wrapErrors(result);
        }
        Message message = new Message();
        boolean needUpdateFinished = pastIll.getPastId() == null ? true : false;
        pastIllService.updatePastIll(pastIll);
        if(needUpdateFinished){
            crfService.updateFinished(pastIll.getPatientInforId());
        }
        message.setSuccess(true);
        message.setMessage("修改成功！");
        return message;
    }
}
