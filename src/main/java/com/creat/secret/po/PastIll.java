package com.creat.secret.po;

import com.creat.secret.validgroup.PastIllSaveGroup;
import com.creat.secret.validgroup.PastIllUpdateGroup;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

public class PastIll {
    private Integer pastId;
    @NotBlank(message = "{pastIll.hasDx.notBlank}",
            groups = {PastIllSaveGroup.class, PastIllUpdateGroup.class})
    private String hasDx;

    private String dxTpye;
    @NotBlank(message = "{pastIll.gxy.notBlank}",
            groups = {PastIllSaveGroup.class, PastIllUpdateGroup.class})
    private String gxy;
    @NotBlank(message = "{pastIll.hasTnb.notBlank}",
            groups = {PastIllSaveGroup.class, PastIllUpdateGroup.class})
    private String hasTnb;

    private String otherIll;
    @NotBlank(message = "{pastIll.hasYcsfq.notBlank}",
            groups = {PastIllSaveGroup.class, PastIllUpdateGroup.class})
    private String hasYcsfq;

    private String ycsfq;
    @NotBlank(message = "{pastIll.hasJzsfq.notBlank}",
            groups = {PastIllSaveGroup.class, PastIllUpdateGroup.class})
    private String hasJzsfq;

    private String jzsfq;
    @NotBlank(message = "{pastIll.hasYcsmq.notBlank}",
            groups = {PastIllSaveGroup.class, PastIllUpdateGroup.class})
    private String hasYcsmq;

    private String ycsmq;
    @NotBlank(message = "{pastIll.hasJzsmq.notBlank}",
            groups = {PastIllSaveGroup.class, PastIllUpdateGroup.class})
    private String hasJzsmq;

    private String jzsmq;
    @NotNull(message = "{pastIll.patientInforId.notNull}",
            groups = {PastIllUpdateGroup.class})
    private Integer patientInforId;

    public Integer getPastId() {
        return pastId;
    }

    public void setPastId(Integer pastId) {
        this.pastId = pastId;
    }

    public String getHasDx() {
        return hasDx;
    }

    public void setHasDx(String hasDx) {
        this.hasDx = hasDx == null ? null : hasDx.trim();
    }

    public String getDxTpye() {
        return dxTpye;
    }

    public void setDxTpye(String dxTpye) {
        this.dxTpye = dxTpye == null ? null : dxTpye.trim();
    }

    public String getGxy() {
        return gxy;
    }

    public void setGxy(String gxy) {
        this.gxy = gxy == null ? null : gxy.trim();
    }

    public String getHasTnb() {
        return hasTnb;
    }

    public void setHasTnb(String hasTnb) {
        this.hasTnb = hasTnb == null ? null : hasTnb.trim();
    }

    public String getOtherIll() {
        return otherIll;
    }

    public void setOtherIll(String otherIll) {
        this.otherIll = otherIll == null ? null : otherIll.trim();
    }

    public String getHasYcsfq() {
        return hasYcsfq;
    }

    public void setHasYcsfq(String hasYcsfq) {
        this.hasYcsfq = hasYcsfq == null ? null : hasYcsfq.trim();
    }

    public String getYcsfq() {
        return ycsfq;
    }

    public void setYcsfq(String ycsfq) {
        this.ycsfq = ycsfq == null ? null : ycsfq.trim();
    }

    public String getHasJzsfq() {
        return hasJzsfq;
    }

    public void setHasJzsfq(String hasJzsfq) {
        this.hasJzsfq = hasJzsfq == null ? null : hasJzsfq.trim();
    }

    public String getJzsfq() {
        return jzsfq;
    }

    public void setJzsfq(String jzsfq) {
        this.jzsfq = jzsfq == null ? null : jzsfq.trim();
    }

    public String getHasYcsmq() {
        return hasYcsmq;
    }

    public void setHasYcsmq(String hasYcsmq) {
        this.hasYcsmq = hasYcsmq == null ? null : hasYcsmq.trim();
    }

    public String getYcsmq() {
        return ycsmq;
    }

    public void setYcsmq(String ycsmq) {
        this.ycsmq = ycsmq == null ? null : ycsmq.trim();
    }

    public String getHasJzsmq() {
        return hasJzsmq;
    }

    public void setHasJzsmq(String hasJzsmq) {
        this.hasJzsmq = hasJzsmq == null ? null : hasJzsmq.trim();
    }

    public String getJzsmq() {
        return jzsmq;
    }

    public void setJzsmq(String jzsmq) {
        this.jzsmq = jzsmq == null ? null : jzsmq.trim();
    }

    public Integer getPatientInforId() {
        return patientInforId;
    }

    public void setPatientInforId(Integer patientInforId) {
        this.patientInforId = patientInforId;
    }
}