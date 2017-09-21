package com.creat.secret.po;

/**
 * Created by Administrator on 2017/9/3.
 */
public class HospitalInforCustom extends HospitalInfor{
    private Hospital hospital;
    private Office office;
    private Doctor doctor;

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
