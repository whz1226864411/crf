package com.creat.secret.po;

import com.creat.secret.validgroup.HospitalInforSaveGroup;
import com.creat.secret.validgroup.HospitalInforUpdateGroup;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class HospitalInfor {

    @NotNull(message = "{hospitalInfor.hospitalInforId.notNull}",
            groups = {HospitalInforUpdateGroup.class})
    private Integer hospitalInforId;
    @NotBlank(message = "{hospitalInfor.clinicTime.notEmpty}",
            groups = {HospitalInforSaveGroup.class, HospitalInforUpdateGroup.class})
    private String clinicTime;
    @NotNull(message = "{hospitalInfor.hospitalId.notNull}",
            groups = {HospitalInforSaveGroup.class, HospitalInforUpdateGroup.class})
    private Integer hospitalId;
    @NotNull(message = "{hospitalInfor.officeId.notNull}",
            groups = {HospitalInforSaveGroup.class, HospitalInforUpdateGroup.class})
    private Integer officeId;
    @NotNull(message = "{hospitalInfor.doctorId.notNull}",
            groups = {HospitalInforSaveGroup.class, HospitalInforUpdateGroup.class})
    private Integer doctorId;
    @NotBlank(message = "{hospitalInfor.medicalRecord.notEmpty}",
            groups = {HospitalInforSaveGroup.class, HospitalInforUpdateGroup.class})
    private String medicalRecord;
    @NotNull(message = "{hospitalInfor.patientInforId.notNull}",groups = {HospitalInforUpdateGroup.class})
    private Integer patientInforId;

    public Integer getHospitalInforId() {
        return hospitalInforId;
    }

    public void setHospitalInforId(Integer hospitalInforId) {
        this.hospitalInforId = hospitalInforId;
    }

    public String getClinicTime() {
        return clinicTime;
    }

    public void setClinicTime(String clinicTime) {
        this.clinicTime = clinicTime == null ? null : clinicTime.trim();
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

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(String medicalRecord) {
        this.medicalRecord = medicalRecord == null ? null : medicalRecord.trim();
    }

    public Integer getPatientInforId() {
        return patientInforId;
    }

    public void setPatientInforId(Integer patientInforId) {
        this.patientInforId = patientInforId;
    }
}