package com.creat.secret.service.impl;

import com.creat.secret.mapper.PatientInforMapper;
import com.creat.secret.po.PatientInfor;
import com.creat.secret.service.PatientInforService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/8/28.
 */
public class PatientInforServiceImpl implements PatientInforService{
    @Autowired
    private PatientInforMapper patientInforMapper;
    public void updatePatientInfor(PatientInfor patientInfor) {
        patientInforMapper.updateByPrimaryKey(patientInfor);
    }
}
