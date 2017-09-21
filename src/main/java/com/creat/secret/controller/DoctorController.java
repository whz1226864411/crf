package com.creat.secret.controller;

import com.creat.secret.po.*;
import com.creat.secret.service.CrfService;
import com.creat.secret.service.DoctorService;
import com.creat.secret.service.LoginException;
import com.creat.secret.utils.BindingResultConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by whz on 2017/8/29.
 */
@Controller
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;
    @Autowired
    private CrfService crfService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public @ResponseBody
    Message login(@Validated Doctor doctor, BindingResult result, HttpServletRequest request){
        if(result.hasErrors()){
            return BindingResultConverter.wrapErrors(result);
        }else {
            LoginMessage message = new LoginMessage();
            try {
                Doctor doctorInDao = doctorService.login(doctor);
                request.getSession().setAttribute("doctor",doctorInDao);
                message.setSuccess(true);
                message.setMessage("登录成功！");
                message.setId(doctorInDao.getDoctorId());
                message.setIdentity("doctor");
            } catch (LoginException e) {
                message.setSuccess(false);
                message.setMessage(e.getMessage());
            }
            return message;
        }
    }
    @RequestMapping(value = "/quit",method = RequestMethod.POST)
    public @ResponseBody Message quit(HttpServletRequest request){
        Message message = new Message();
        if(request.getSession().getAttribute("doctor") != null){
            request.getSession().invalidate();
            message.setSuccess(true);
            message.setMessage("退出成功！");
        }else {
            message.setSuccess(false);
            message.setMessage("您还未登录！");
        }
        return message;
    }

    @RequestMapping(value = "/modifyPassword",method = RequestMethod.POST)
    public @ResponseBody Message modifyPassword(String oldPassWord,String newPassWord,HttpServletRequest request){
        Message message = new Message();
        if(oldPassWord == null || oldPassWord.trim().length() == 0 ){
            message.setSuccess(false);
            message.setMessage("旧密码不能为空！");
            return message;
        }
        if(newPassWord == null || newPassWord.trim().length() == 0 ){
            message.setSuccess(false);
            message.setMessage("新密码不能为空！");
            return message;
        }
        Doctor doctor = (Doctor)request.getSession().getAttribute("doctor");
        if(doctor != null){
            if(doctor.getDoctorPassword().equals(oldPassWord)){
                doctor.setDoctorPassword(newPassWord);
                doctorService.updatePassword(doctor);
                message.setSuccess(true);
                message.setMessage("修改成功！");
            }else {
                message.setSuccess(false);
                message.setMessage("密码错误！");
            }
        }else {
            message.setSuccess(false);
            message.setMessage("您还未登录！");
        }
        return message;
    }

    @RequestMapping(value = "/getCrfRecords")
    public @ResponseBody
    CrfRecordVO getCrfRecords(HttpServletRequest request){
        CrfRecordVO crfRecordVO = new CrfRecordVO();
        Doctor doctor = (Doctor)request.getSession().getAttribute("doctor");
        if(doctor != null){
            List<CrfRecord> crfRecordList = crfService.getCrfRecordByDoctorId(doctor.getDoctorId());
            crfRecordVO.setSuccess(true);
            crfRecordVO.setCrfRecordList(crfRecordList);
        }else {
            crfRecordVO.setSuccess(false);
            crfRecordVO.setMessage("您还未登录！");
        }
        return crfRecordVO;
    }

    @RequestMapping(value = "/batchSubmit",method = RequestMethod.POST)
    public @ResponseBody Message batchSubmit(CrfIdsVO crfIds){
        Message message = new Message();
        crfService.updateSubmitted(crfIds.getCrfIds());
        message.setSuccess(true);
        message.setMessage("提交成功！");
        return message;
    }
}
