package com.creat.secret.po;

import com.creat.secret.validgroup.BlfySaveGroup;
import com.creat.secret.validgroup.BlfyUpdateGroup;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

public class Blfy {
    private Integer blfyId;
    @NotNull(message = "{blfy.body.notNUll}",
            groups = {BlfySaveGroup.class, BlfyUpdateGroup.class})
    private String body;
    @NotNull(message = "{blfy.zssjxt.notNUll}",
            groups = {BlfySaveGroup.class, BlfyUpdateGroup.class})
    private String zssjxt;
    @NotNull(message = "{blfy.pf.notNUll}",
            groups = {BlfySaveGroup.class, BlfyUpdateGroup.class})
    private String pf;
    @NotNull(message = "{blfy.gsqg.notNUll}",
            groups = {BlfySaveGroup.class, BlfyUpdateGroup.class})
    private String gsqg;
    @NotNull(message = "{blfy.xnxgxt.notNUll}",
            groups = {BlfySaveGroup.class, BlfyUpdateGroup.class})
    private String xnxgxt;
    @NotNull(message = "{blfy.wcd.notNUll}",
            groups = {BlfySaveGroup.class, BlfyUpdateGroup.class})
    private String wcd;
    @NotNull(message = "{blfy.xyxt.notNUll}",
            groups = {BlfySaveGroup.class, BlfyUpdateGroup.class})
    private String xyxt;
    @NotNull(message = "{blfy.gz.notNUll}",
            groups = {BlfySaveGroup.class, BlfyUpdateGroup.class})
    private String gz;
    @NotNull(message = "{blfy.dxhyyza.notNUll}",
            groups = {BlfySaveGroup.class, BlfyUpdateGroup.class})
    private String dxhyyza;
    @NotNull(message = "{blfy.patientInforId.notNUll}",groups = { BlfyUpdateGroup.class})
    private Integer patientInforId;

    public Integer getBlfyId() {
        return blfyId;
    }

    public void setBlfyId(Integer blfyId) {
        this.blfyId = blfyId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
    }

    public String getZssjxt() {
        return zssjxt;
    }

    public void setZssjxt(String zssjxt) {
        this.zssjxt = zssjxt == null ? null : zssjxt.trim();
    }

    public String getPf() {
        return pf;
    }

    public void setPf(String pf) {
        this.pf = pf == null ? null : pf.trim();
    }

    public String getGsqg() {
        return gsqg;
    }

    public void setGsqg(String gsqg) {
        this.gsqg = gsqg == null ? null : gsqg.trim();
    }

    public String getXnxgxt() {
        return xnxgxt;
    }

    public void setXnxgxt(String xnxgxt) {
        this.xnxgxt = xnxgxt == null ? null : xnxgxt.trim();
    }

    public String getWcd() {
        return wcd;
    }

    public void setWcd(String wcd) {
        this.wcd = wcd == null ? null : wcd.trim();
    }

    public String getXyxt() {
        return xyxt;
    }

    public void setXyxt(String xyxt) {
        this.xyxt = xyxt == null ? null : xyxt.trim();
    }

    public String getGz() {
        return gz;
    }

    public void setGz(String gz) {
        this.gz = gz == null ? null : gz.trim();
    }

    public String getDxhyyza() {
        return dxhyyza;
    }

    public void setDxhyyza(String dxhyyza) {
        this.dxhyyza = dxhyyza == null ? null : dxhyyza.trim();
    }

    public Integer getPatientInforId() {
        return patientInforId;
    }

    public void setPatientInforId(Integer patientInforId) {
        this.patientInforId = patientInforId;
    }
}