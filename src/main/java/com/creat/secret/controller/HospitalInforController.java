package com.creat.secret.controller;

import com.creat.secret.po.CrfInforCustom;
import com.creat.secret.po.HospitalInfor;
import com.creat.secret.po.Message;
import com.creat.secret.service.CrfService;
import com.creat.secret.service.HospitalInforService;
import com.creat.secret.utils.BindingResultConverter;
import com.creat.secret.utils.UUIDUtil;
import com.creat.secret.validgroup.HospitalInforSaveGroup;
import com.creat.secret.validgroup.HospitalInforUpdateGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * Created by Administrator on 2017/8/25.
 */
@Controller
@RequestMapping("/hospitalInfor")
public class HospitalInforController {

    @Autowired
    private CrfService crfService;
    @Autowired
    private HospitalInforService hospitalInforService;

    @RequestMapping(value = "/saveHospitalInofr",method = RequestMethod.POST)
    public @ResponseBody Message saveHospitalInofr(
            @Validated(value = {HospitalInforSaveGroup.class}) HospitalInfor hospitalInfor,
            BindingResult result, HttpServletRequest request){
        if(result.hasErrors()){
            return BindingResultConverter.wrapErrors(result);
        }else {
            HttpSession session = request.getSession();
            Message message = new Message();
            CrfInforCustom crfInforCustom = (CrfInforCustom) session.getAttribute("crfInforCustom");
            if(crfInforCustom == null) {
                crfInforCustom = crfService.creatCrfInforCustom();
                crfInforCustom.setHospitalInfor(hospitalInfor);
                session.setAttribute("crfInforCustom",crfInforCustom);
                message.setSuccess(true);
                message.setMessage("保存成功!");
            }else {
                crfInforCustom.setHospitalInfor(hospitalInfor);
                message.setSuccess(true);
                message.setMessage("保存成功!");
            }
            return message;
        }
    }

    @RequestMapping(value = "/updateHospitalInfor",method = RequestMethod.POST)
    public @ResponseBody Message updateHospitalInfor(
            @Validated(value = {HospitalInforUpdateGroup.class}) HospitalInfor hospitalInfor,
            BindingResult result){
        if(result.hasErrors()){
            return BindingResultConverter.wrapErrors(result);
        }else {
            Message message = new Message();
            hospitalInforService.updateHospitalInfor(hospitalInfor);
            message.setSuccess(true);
            message.setMessage("修改成功！");
            return message;
        }
    }

}
