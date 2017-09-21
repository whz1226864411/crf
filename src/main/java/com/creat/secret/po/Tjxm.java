package com.creat.secret.po;

import com.creat.secret.validgroup.TjxmSaveGroup;
import com.creat.secret.validgroup.TjxmUpdateGroup;
import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Tjxm {

    private Integer tjxmId;
    @NotBlank(message = "{tjxm.ggnAlt.notBlank}",
                groups = {TjxmSaveGroup.class, TjxmUpdateGroup.class})
    private String ggnAlt;
    @NotBlank(message = "{tjxm.ggnAst.notBlank}",
            groups = {TjxmSaveGroup.class, TjxmUpdateGroup.class})
    private String ggnAst;
    @NotBlank(message = "{tjxm.sgnJg.notBlank}",
            groups = {TjxmSaveGroup.class, TjxmUpdateGroup.class})
    private String sgnJg;
    @NotBlank(message = "{tjxm.sgnNsd.notBlank}",
            groups = {TjxmSaveGroup.class, TjxmUpdateGroup.class})
    private String sgnNsd;
    @NotBlank(message = "{tjxm.hcgz.notBlank}",
            groups = {TjxmSaveGroup.class, TjxmUpdateGroup.class})
    private String hcgz;
    @NotBlank(message = "{tjxm.xqn.notBlank}",
            groups = {TjxmSaveGroup.class, TjxmUpdateGroup.class})
    private String xqn;
    @NotBlank(message = "{tjxm.hasYwgm.notBlank}",
            groups = {TjxmSaveGroup.class, TjxmUpdateGroup.class})
    private String hasYwgm;

    private String ywgm;
    @NotBlank(message = "{tjxm.steven.notBlank}",
            groups = {TjxmSaveGroup.class, TjxmUpdateGroup.class})
    private String steven;
    @NotNull(message = "{tjxm.patientInforId.notNull}",
            groups = {TjxmUpdateGroup.class})
    private Integer patientInforId;

    public Integer getTjxmId() {
        return tjxmId;
    }

    public void setTjxmId(Integer tjxmId) {
        this.tjxmId = tjxmId;
    }

    public String getGgnAlt() {
        return ggnAlt;
    }

    public void setGgnAlt(String ggnAlt) {
        this.ggnAlt = ggnAlt == null ? null : ggnAlt.trim();
    }

    public String getGgnAst() {
        return ggnAst;
    }

    public void setGgnAst(String ggnAst) {
        this.ggnAst = ggnAst == null ? null : ggnAst.trim();
    }

    public String getSgnJg() {
        return sgnJg;
    }

    public void setSgnJg(String sgnJg) {
        this.sgnJg = sgnJg == null ? null : sgnJg.trim();
    }

    public String getSgnNsd() {
        return sgnNsd;
    }

    public void setSgnNsd(String sgnNsd) {
        this.sgnNsd = sgnNsd == null ? null : sgnNsd.trim();
    }

    public String getHcgz() {
        return hcgz;
    }

    public void setHcgz(String hcgz) {
        this.hcgz = hcgz == null ? null : hcgz.trim();
    }

    public String getXqn() {
        return xqn;
    }

    public void setXqn(String xqn) {
        this.xqn = xqn == null ? null : xqn.trim();
    }

    public String getHasYwgm() {
        return hasYwgm;
    }

    public void setHasYwgm(String hasYwgm) {
        this.hasYwgm = hasYwgm == null ? null : hasYwgm.trim();
    }

    public String getYwgm() {
        return ywgm;
    }

    public void setYwgm(String ywgm) {
        this.ywgm = ywgm == null ? null : ywgm.trim();
    }

    public String getSteven() {
        return steven;
    }

    public void setSteven(String steven) {
        this.steven = steven == null ? null : steven.trim();
    }

    public Integer getPatientInforId() {
        return patientInforId;
    }

    public void setPatientInforId(Integer patientInforId) {
        this.patientInforId = patientInforId;
    }
}