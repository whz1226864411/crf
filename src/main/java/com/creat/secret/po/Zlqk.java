package com.creat.secret.po;

import com.creat.secret.validgroup.ZlqkSaveGroup;
import com.creat.secret.validgroup.ZlqkUpdateGroup;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

public class Zlqk {
    private Integer zlqkId;
    @NotBlank(message = "{zlqk.yyqk.notBlank}",
            groups = {ZlqkSaveGroup.class, ZlqkUpdateGroup.class})
    private String yyqk;
    @NotNull(message = "{zlqk.patientInforId.notNull}",
                        groups = {ZlqkUpdateGroup.class})
    private Integer patientInforId;
    @NotBlank(message = "{zlqk.lx.notBlank}",
            groups = {ZlqkSaveGroup.class, ZlqkUpdateGroup.class})
    private String lx;

    public Integer getZlqkId() {
        return zlqkId;
    }

    public void setZlqkId(Integer zlqkId) {
        this.zlqkId = zlqkId;
    }

    public String getYyqk() {
        return yyqk;
    }

    public void setYyqk(String yyqk) {
        this.yyqk = yyqk == null ? null : yyqk.trim();
    }

    public Integer getPatientInforId() {
        return patientInforId;
    }

    public void setPatientInforId(Integer patientInforId) {
        this.patientInforId = patientInforId;
    }

    public String getLx() {
        return lx;
    }

    public void setLx(String lx) {
        this.lx = lx == null ? null : lx.trim();
    }
}