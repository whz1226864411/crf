package com.creat.secret.po;

import org.hibernate.validator.constraints.NotBlank;

public class Doctor {
    private Integer doctorId;

    private String doctorName;
    @NotBlank(message = "{doctor.doctorAccount.notBlank}")
    private String doctorAccount;
    @NotBlank(message = "{doctor.doctorPassword.notBlank}")
    private String doctorPassword;

    private String doctorTel;

    private Integer roleId;

    private Integer hospitalId;

    private Integer officeId;

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName == null ? null : doctorName.trim();
    }

    public String getDoctorAccount() {
        return doctorAccount;
    }

    public void setDoctorAccount(String doctorAccount) {
        this.doctorAccount = doctorAccount == null ? null : doctorAccount.trim();
    }

    public String getDoctorPassword() {
        return doctorPassword;
    }

    public void setDoctorPassword(String doctorPassword) {
        this.doctorPassword = doctorPassword == null ? null : doctorPassword.trim();
    }

    public String getDoctorTel() {
        return doctorTel;
    }

    public void setDoctorTel(String doctorTel) {
        this.doctorTel = doctorTel == null ? null : doctorTel.trim();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    public Integer getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Integer officeId) {
        this.officeId = officeId;
    }
}