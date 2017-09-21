package com.creat.secret.po;

public class CrfInfor {
    private Integer crfId;

    private String createDate;

    private Boolean submited;

    private Integer patientInforId;

    private Integer finished;

    private Boolean locked;

    public Integer getCrfId() {
        return crfId;
    }

    public void setCrfId(Integer crfId) {
        this.crfId = crfId;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }

    public Boolean getSubmited() {
        return submited;
    }

    public void setSubmited(Boolean submited) {
        this.submited = submited;
    }

    public Integer getPatientInforId() {
        return patientInforId;
    }

    public void setPatientInforId(Integer patientInforId) {
        this.patientInforId = patientInforId;
    }

    public Integer getFinished() {
        return finished;
    }

    public void setFinished(Integer finished) {
        this.finished = finished;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }
}