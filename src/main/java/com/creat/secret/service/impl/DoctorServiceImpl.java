package com.creat.secret.service.impl;

import com.creat.secret.mapper.DoctorMapper;
import com.creat.secret.po.Doctor;
import com.creat.secret.po.DoctorExample;
import com.creat.secret.service.DoctorService;
import com.creat.secret.service.LoginException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2017/8/30.
 */
public class DoctorServiceImpl implements DoctorService{
    @Autowired
    private DoctorMapper doctorMapper;
    public Doctor login(Doctor doctor) throws LoginException {
        DoctorExample doctorExample = new DoctorExample();
        DoctorExample.Criteria criteria = doctorExample.createCriteria();
        criteria.andDoctorAccountEqualTo(doctor.getDoctorAccount());
        List<Doctor> doctorList = doctorMapper.selectByExample(doctorExample);
        if(doctorList.size() > 0){
            Doctor doctorInDao = doctorList.get(0);
            if(doctorInDao.getDoctorPassword().equals(doctor.getDoctorPassword())){
                return doctorInDao;
            }else {
                throw new LoginException("密码错误！");
            }
        }else {
            throw new LoginException("用户不存在！");
        }
    }

    public void updatePassword(Doctor doctor) {
        doctorMapper.updateByPrimaryKey(doctor);
    }
}
