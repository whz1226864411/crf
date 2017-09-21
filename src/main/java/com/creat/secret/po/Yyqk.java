package com.creat.secret.po;

import com.creat.secret.validgroup.ZlqkSaveGroup;
import com.creat.secret.validgroup.ZlqkUpdateGroup;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

public class Yyqk {
    private Integer yyqkId;

    private String yymc;
    @NotBlank(message = "{yyqk.yypp.notBlank}",
            groups = {ZlqkSaveGroup.class, ZlqkUpdateGroup.class})
    private String yypp;
    @NotNull(message = "{yyqk.yyjlCs.notNull}",
            groups = {ZlqkSaveGroup.class, ZlqkUpdateGroup.class})
    private Integer yyjlCs;
    @NotBlank(message = "{yyqk.yyjlYl.notBlank}",
            groups = {ZlqkSaveGroup.class, ZlqkUpdateGroup.class})
    private String yyjlYl;

    @NotNull(message = "{yyqk.type.notNull}",
            groups = {ZlqkSaveGroup.class, ZlqkUpdateGroup.class})
    private Integer type;

    private Integer zlqkId;

    public Integer getYyqkId() {
        return yyqkId;
    }

    public void setYyqkId(Integer yyqkId) {
        this.yyqkId = yyqkId;
    }

    public String getYymc() {
        return yymc;
    }

    public void setYymc(String yymc) {
        this.yymc = yymc == null ? null : yymc.trim();
    }

    public String getYypp() {
        return yypp;
    }

    public void setYypp(String yypp) {
        this.yypp = yypp == null ? null : yypp.trim();
    }

    public Integer getYyjlCs() {
        return yyjlCs;
    }

    public void setYyjlCs(Integer yyjlCs) {
        this.yyjlCs = yyjlCs;
    }

    public String getYyjlYl() {
        return yyjlYl;
    }

    public void setYyjlYl(String yyjlYl) {
        this.yyjlYl = yyjlYl == null ? null : yyjlYl.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getZlqkId() {
        return zlqkId;
    }

    public void setZlqkId(Integer zlqkId) {
        this.zlqkId = zlqkId;
    }
}