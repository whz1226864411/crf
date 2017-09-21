package com.creat.secret.controller;

import com.creat.secret.po.CrfInforCustom;
import com.creat.secret.po.Message;
import com.creat.secret.po.PatientInfor;
import com.creat.secret.service.CrfService;
import com.creat.secret.service.PatientInforService;
import com.creat.secret.utils.BindingResultConverter;
import com.creat.secret.utils.UUIDUtil;
import com.creat.secret.validgroup.PatientInforSaveGroup;
import com.creat.secret.validgroup.PatientInforUpdateGroup;
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
@RequestMapping("/patientInfor")
public class PatientInforController {

    @Autowired
    private CrfService crfService;
    @Autowired
    private PatientInforService patientInforService;

    @RequestMapping(value="/savePatientInfor",method = RequestMethod.POST)
    public @ResponseBody
    Message savePatientInfor(
            @Validated(value = {PatientInforSaveGroup.class}) PatientInfor patientInfor,
            BindingResult result, HttpServletRequest request){
        if(result.hasErrors()){
            return BindingResultConverter.wrapErrors(result);
        }else {
            HttpSession session = request.getSession();
            Message message = new Message();
            CrfInforCustom crfInforCustom = (CrfInforCustom) session.getAttribute("crfInforCustom");
            if(crfInforCustom == null) {
                crfInforCustom = crfService.creatCrfInforCustom();
                crfInforCustom.setPatientInfor(patientInfor);
                session.setAttribute("crfInforCustom",crfInforCustom);
                message.setSuccess(true);
                message.setMessage("保存成功!");
            }else {
                crfInforCustom.setPatientInfor(patientInfor);
                message.setSuccess(true);
                message.setMessage("保存成功!");
            }
            return message;
        }
    }

    @RequestMapping(value = "/updatePatientInfor",method = RequestMethod.POST)
    public @ResponseBody Message updatePatientInfor(
            @Validated(value = {PatientInforUpdateGroup.class}) PatientInfor patientInfor,
            BindingResult result){
        if(result.hasErrors()){
            return BindingResultConverter.wrapErrors(result);
        }else {
            Message message = new Message();
            patientInforService.updatePatientInfor(patientInfor);
            message.setSuccess(true);
            message.setMessage("修改成功！");
            return message;
        }
    }
}
