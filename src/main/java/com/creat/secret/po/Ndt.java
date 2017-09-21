package com.creat.secret.po;

import com.creat.secret.validgroup.TjxmSaveGroup;
import com.creat.secret.validgroup.TjxmUpdateGroup;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

public class Ndt {
    private Integer ndtId;
    @NotBlank(message = "{ndt.ycType.notBlank}",
            groups = {TjxmSaveGroup.class, TjxmUpdateGroup.class})
    private String ycType;
    @NotBlank(message = "{ndt.jcType.notBlank}",
            groups = {TjxmSaveGroup.class, TjxmUpdateGroup.class})
    private String jcType;
    @NotBlank(message = "{ndt.jcTime.notBlank}",
            groups = {TjxmSaveGroup.class, TjxmUpdateGroup.class})
    private String jcTime;

    private Integer tjxmId;

    public Integer getNdtId() {
        return ndtId;
    }

    public void setNdtId(Integer ndtId) {
        this.ndtId = ndtId;
    }

    public String getYcType() {
        return ycType;
    }

    public void setYcType(String ycType) {
        this.ycType = ycType == null ? null : ycType.trim();
    }

    public String getJcType() {
        return jcType;
    }

    public void setJcType(String jcType) {
        this.jcType = jcType == null ? null : jcType.trim();
    }

    public String getJcTime() {
        return jcTime;
    }

    public void setJcTime(String jcTime) {
        this.jcTime = jcTime == null ? null : jcTime.trim();
    }

    public Integer getTjxmId() {
        return tjxmId;
    }

    public void setTjxmId(Integer tjxmId) {
        this.tjxmId = tjxmId;
    }
}