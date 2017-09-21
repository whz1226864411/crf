package com.creat.secret.service;

import com.creat.secret.po.CrfInforCustom;
import com.creat.secret.po.CrfRecord;
import com.creat.secret.po.Message;
import com.creat.secret.po.PatientAccount;

import java.util.List;

/**
 * Created by Administrator on 2017/8/25.
 */
public interface CrfService {
    CrfInforCustom creatCrfInforCustom();
    Message saveCrfInforCustom(CrfInforCustom crfInforCustom);
    CrfInforCustom getCrfInforCustom(int crfId);
    int getCrfIdByPatientAccountId(int patientAccountId);
    List<CrfRecord> getCrfRecordByDoctorId(int doctorId);
    void updateSubmitted(List<Integer> crfIds);
    boolean hasCrfByPatientAccountId(Integer patientAccountId);
    boolean contactCrfByPatientTel(PatientAccount patientAccount);
    void updateFinished(Integer patientInforId);
}
