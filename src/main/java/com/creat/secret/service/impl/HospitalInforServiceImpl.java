package com.creat.secret.service.impl;

import com.creat.secret.mapper.HospitalInforMapper;
import com.creat.secret.po.HospitalInfor;
import com.creat.secret.service.HospitalInforService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/8/28.
 */
public class HospitalInforServiceImpl implements HospitalInforService{
    @Autowired
    private HospitalInforMapper hospitalInforMapper;
    public void updateHospitalInfor(HospitalInfor hospitalInfor) {
        hospitalInforMapper.updateByPrimaryKey(hospitalInfor);
    }

}
