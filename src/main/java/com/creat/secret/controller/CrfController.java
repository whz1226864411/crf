package com.creat.secret.controller;

import com.creat.secret.po.*;
import com.creat.secret.service.CrfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2017/8/26.
 */
@Controller
@RequestMapping("/crfInfor")
public class CrfController {

    @Autowired
    private CrfService crfService;

    @RequestMapping(value = "/saveCrf",method = RequestMethod.POST)
    public @ResponseBody
    Message saveCrf(HttpServletRequest request){
        Message message = new Message();
        CrfInforCustom crfInforCustom = (CrfInforCustom) request.getSession().getAttribute("crfInforCustom");
        if(crfInforCustom != null){
            if(crfInforCustom.getPatientInfor() == null || crfInforCustom.getHospitalInfor() == null){
                message.setSuccess(false);
                message.setMessage("请先保存医院信息和个人信息！");
            }else{
                PatientAccount patientAccount = (PatientAccount) request.getSession().getAttribute("patientAccount");
                if(patientAccount != null){
                    PatientInfor patientInfor = crfInforCustom.getPatientInfor();
                    if(patientInfor != null){
                        patientInfor.setPatientAccountId(patientAccount.getPatientAccountId());
                    }
                }
                message = crfService.saveCrfInforCustom(crfInforCustom);
                request.getSession().removeAttribute("crfInforCustom");
            }
        }else {
            message.setSuccess(false);
            message.setMessage("您还未保存任何信息！");
        }
        return message;
    }

    @RequestMapping(value = "/getCrfGeneral")
    public @ResponseBody CrfInforCustom getCrfGeneral(Integer crfId){
        return crfService.getCrfInforCustom(crfId);
    }

    @RequestMapping(value = "/getCrfRecordsByDoctorId")
    public @ResponseBody
    CrfRecordVO getCrfRecordsByDoctorId(Integer doctorId,HttpServletRequest request){
        CrfRecordVO crfRecordVO = new CrfRecordVO();
        if(doctorId == null){
            crfRecordVO.setSuccess(false);
            crfRecordVO.setMessage("医生id不能为空！");
            return crfRecordVO;
        }
        List<CrfRecord> crfRecordList = crfService.getCrfRecordByDoctorId(doctorId);
        crfRecordVO.setSuccess(true);
        crfRecordVO.setCrfRecordList(crfRecordList);
        return crfRecordVO;
    }
}
