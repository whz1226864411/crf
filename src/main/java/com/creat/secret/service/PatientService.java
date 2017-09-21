package com.creat.secret.service;

import com.creat.secret.po.Message;
import com.creat.secret.po.PatientAccount;

import java.security.NoSuchAlgorithmException;

/**
 * Created by whz on 2017/8/24.
 */
public interface PatientService {

    //发送验证码
    Message sendMessage(String telNum, String valicode);
    //注册
    void register(PatientAccount patientAccount) throws NoSuchAlgorithmException;
    //登录
    PatientAccount login(PatientAccount patientAccount) throws LoginException;
}
