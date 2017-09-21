package com.creat.secret.service;

import com.creat.secret.po.Doctor;

/**
 * Created by whz on 2017/8/30.
 */
public interface DoctorService {
    Doctor login(Doctor doctor) throws LoginException;
    void updatePassword(Doctor doctor);
}
