package com.creat.secret.po;

import com.creat.secret.validgroup.IllSaveGroup;
import com.creat.secret.validgroup.IllUpdateGroup;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

public class Ill {
    private Integer illId;
    @NotBlank(message = "{ill.dxType.notBlank}",
                groups = {IllSaveGroup.class, IllUpdateGroup.class})
    private String dxType;

    private String onePl;

    private String oneDw;

    private String twoPl;

    private String twoDw;

    private String threePl;

    private String threeDw;
    @NotNull(message = "{ill.patientInforId.notNull}",groups = {IllUpdateGroup.class})
    private Integer patientInforId;

    public Integer getIllId() {
        return illId;
    }

    public void setIllId(Integer illId) {
        this.illId = illId;
    }

    public String getDxType() {
        return dxType;
    }

    public void setDxType(String dxType) {
        this.dxType = dxType == null ? null : dxType.trim();
    }

    public String getOnePl() {
        return onePl;
    }

    public void setOnePl(String onePl) {
        this.onePl = onePl == null ? null : onePl.trim();
    }

    public String getOneDw() {
        return oneDw;
    }

    public void setOneDw(String oneDw) {
        this.oneDw = oneDw == null ? null : oneDw.trim();
    }

    public String getTwoPl() {
        return twoPl;
    }

    public void setTwoPl(String twoPl) {
        this.twoPl = twoPl == null ? null : twoPl.trim();
    }

    public String getTwoDw() {
        return twoDw;
    }

    public void setTwoDw(String twoDw) {
        this.twoDw = twoDw == null ? null : twoDw.trim();
    }

    public String getThreePl() {
        return threePl;
    }

    public void setThreePl(String threePl) {
        this.threePl = threePl == null ? null : threePl.trim();
    }

    public String getThreeDw() {
        return threeDw;
    }

    public void setThreeDw(String threeDw) {
        this.threeDw = threeDw == null ? null : threeDw.trim();
    }

    public Integer getPatientInforId() {
        return patientInforId;
    }

    public void setPatientInforId(Integer patientInforId) {
        this.patientInforId = patientInforId;
    }
}