package com.creat.secret.controller;

import com.creat.secret.po.*;
import com.creat.secret.service.CrfService;
import com.creat.secret.service.LoginException;
import com.creat.secret.service.PatientService;
import com.creat.secret.utils.BindingResultConverter;
import com.creat.secret.utils.DateUtil;
import com.creat.secret.utils.UUIDUtil;
import com.creat.secret.validgroup.PatientLoginAndRegister;
import com.creat.secret.validgroup.PatientValid;
import net.sf.json.JSONObject;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotNull;
import javax.xml.transform.Result;
import java.security.NoSuchAlgorithmException;
import java.util.*;

/**
 * Created by whz on 2017/8/24.
 */
@Controller
@RequestMapping("/patient")
public class PatientController{

    @Autowired
    private PatientService patientService;
    @Autowired
    private CrfService crfService;

    //发送注册验证码
    @RequestMapping(value="/sendRegisterMessage",method = RequestMethod.POST)
    public @ResponseBody Message sendRegisterMessage(
            @Validated(value = {PatientValid.class}) PatientAccount patientAccount,
            BindingResult result, HttpServletRequest request){
        if(result.hasErrors()){
            return BindingResultConverter.wrapErrors(result);
        }
        VailCode vailCodeInSession = (VailCode) request.getSession().getAttribute("registerValiCode");
        Message message = null;
        if(vailCodeInSession != null && vailCodeInSession.getCreateTime().getTime()+60*1000 > new Date().getTime()){
            message = new Message();
            message.setSuccess(false);
            message.setMessage("60秒内无法发送");
        }else {
            StringBuilder valicode = new StringBuilder();
            Random random = new Random();
            for(int i = 0; i < 4; i++){
                valicode.append(String.valueOf(random.nextInt(9)));
            }
            VailCode vailCode = new VailCode();
            vailCode.setValue(valicode.toString());
            vailCode.setValidTime(5);
            message = patientService.sendMessage(patientAccount.getPatientTel(),valicode.toString());
            if(message.isSuccess() == true){
                vailCode.setCreateTime(new Date());
                request.getSession().setAttribute("registerValiCode",vailCode);
            }
        }
        return message;
    }
    //校验验证码
    @RequestMapping(value = "/verifyCode",method = RequestMethod.POST)
    public @ResponseBody Message verifyCode(String valicode,
            @Validated(value = {PatientValid.class}) PatientAccount patientAccount,
            BindingResult result, HttpServletRequest request){
        if(result.hasErrors() || valicode == null){
            Message message = BindingResultConverter.wrapErrors(result);
            if(valicode == null){
                message.setMessage(message.getMessage()+"验证码不能为空！");
            }
            return message;
        }
        Message message = new Message();
        VailCode vailCode = (VailCode) request.getSession().getAttribute("registerValiCode");
        if(vailCode != null && vailCode.getValue().equals(valicode)
                && vailCode.getCreateTime().getTime()+vailCode.getValidTime()*60*1000 > new Date().getTime()){
            request.getSession().removeAttribute("registerValiCode");
            request.getSession().setAttribute("codeIsRight",new Boolean(true));
            request.getSession().setAttribute("patientTel",patientAccount.getPatientTel());
            message.setSuccess(true);
        }else {
            message.setSuccess(false);
        }
        return message;
    }
    //注册
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public @ResponseBody Message register(
            @Validated(value = {PatientLoginAndRegister.class}) PatientAccount patientAccount,
            BindingResult result, HttpServletRequest request){
        if(result.hasErrors()){
            return BindingResultConverter.wrapErrors(result);
        }
        LoginMessage message = new LoginMessage();
        String patientTel = (String) request.getSession().getAttribute("patientTel");
        Boolean codeIsRight = (Boolean) request.getSession().getAttribute("codeIsRight");
        if(codeIsRight != null & patientTel != null
                && patientAccount.getPatientTel().equals(patientTel)
                && codeIsRight.booleanValue() == true){
            request.getSession().removeAttribute("codeIsRight");
            request.getSession().removeAttribute("patientTel");
            try {
                patientService.register(patientAccount);
                Boolean hasCrf = crfService.contactCrfByPatientTel(patientAccount);
                message.setSuccess(true);
                request.getSession().setAttribute("patientAccount",patientAccount);
                message.setMessage("注册成功，已经自动登录！");
                message.setHasCrf(hasCrf);
            } catch (NoSuchAlgorithmException e) {
                message.setSuccess(false);
                message.setMessage("未知错误！");
                e.printStackTrace();
            }
        }else {
            message.setSuccess(false);
            message.setMessage("验证码错误!");
        }
        return message;
    }

    //密码登录
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public @ResponseBody Message login(
            @Validated(value = {PatientLoginAndRegister.class}) PatientAccount patientAccount,
            BindingResult result, HttpServletRequest request){
        if(result.hasErrors()){
            return BindingResultConverter.wrapErrors(result);
        }
        LoginMessage message = new LoginMessage();
        try {
            PatientAccount patientAccountInMy = patientService.login(patientAccount);
            boolean hasCrf = crfService.hasCrfByPatientAccountId(patientAccountInMy.getPatientAccountId());
            request.getSession().setAttribute("patientAccount",patientAccountInMy);
            message.setSuccess(true);
            message.setMessage("登录成功！");
            message.setId(patientAccountInMy.getPatientAccountId());
            message.setIdentity("patient");
            message.setHasCrf(hasCrf);
        } catch (LoginException e) {
            message.setSuccess(false);
            message.setMessage(e.getMessage());
        }
        return message;
    }
    //退出
    @RequestMapping(value = "/quit",method = RequestMethod.POST)
    public @ResponseBody Message quit(HttpServletRequest request){
        Message message = new Message();
        if(request.getSession().getAttribute("patientAccount") != null){
            request.getSession().invalidate();
            message.setSuccess(true);
            message.setMessage("退出成功！");
        }else {
            message.setSuccess(false);
            message.setMessage("您还未登录！");
        }
        return message;
    }
    @RequestMapping(value = "/getCrf",method = RequestMethod.POST)
    public @ResponseBody CrfInforCustomVo getCrf(HttpServletRequest request){
        PatientAccount patientAccount = (PatientAccount) request.getSession().getAttribute("patientAccount");
        CrfInforCustomVo crfInforCustomVo = new CrfInforCustomVo();
        if(patientAccount != null){
            int crfId = crfService.getCrfIdByPatientAccountId(patientAccount.getPatientAccountId());
            if (crfId != -1){
                CrfInforCustom crfInforCustom = crfService.getCrfInforCustom(crfId);
                if(crfInforCustom != null){
                    crfInforCustomVo.setBlfy(crfInforCustom.getBlfy());
                    crfInforCustomVo.setCreateDate(crfInforCustom.getCreateDate());
                    crfInforCustomVo.setCrfId(crfInforCustom.getCrfId());
                    crfInforCustomVo.setFinished(crfInforCustom.getFinished());
                    crfInforCustomVo.setHospitalInfor(crfInforCustom.getHospitalInfor());
                    crfInforCustomVo.setIll(crfInforCustom.getIll());
                    crfInforCustomVo.setPatientInforId(crfInforCustom.getPatientInforId());
                    crfInforCustomVo.setPastIll(crfInforCustom.getPastIll());
                    crfInforCustomVo.setPatientInfor(crfInforCustom.getPatientInfor());
                    crfInforCustomVo.setSubmited(crfInforCustom.getSubmited());
                    crfInforCustomVo.setTjxmCustom(crfInforCustom.getTjxmCustom());
                    crfInforCustomVo.setZlqkCustom(crfInforCustom.getZlqkCustom());
                    crfInforCustomVo.setSuccess(true);
                }else {
                    crfInforCustomVo.setSuccess(false);
                }
            }else {
                crfInforCustomVo.setBlfy(new Blfy());
                crfInforCustomVo.setCreateDate(DateUtil.date2String(new Date()));
                crfInforCustomVo.setCrfId(11);
                crfInforCustomVo.setFinished(10);
                crfInforCustomVo.setHospitalInfor(new HospitalInfor());
                crfInforCustomVo.setIll(new Ill());
                crfInforCustomVo.setPatientInforId(1);
                crfInforCustomVo.setPastIll(new PastIll());
                crfInforCustomVo.setPatientInfor(new PatientInfor());
                crfInforCustomVo.setSubmited(true);
                crfInforCustomVo.setTjxmCustom(new TjxmCustom());
                crfInforCustomVo.setZlqkCustom(new ZlqkCustom());
                crfInforCustomVo.setSuccess(false);
            }
        }else {
            crfInforCustomVo.setSuccess(false);
        }
        return crfInforCustomVo;
    }


}
