package com.creat.secret.po;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

public class Xynd {
    private Integer xyndId;

    private Integer yyqkId;
    @NotNull(message = "{xynd.fnd.notNull}")
    private String fnd;
    @NotNull(message = "{xynd.gnd.notNull}")
    private String gnd;
    @NotBlank(message = "xynd.yysj.notBlank")
    private String yysj;

    public Integer getXyndId() {
        return xyndId;
    }

    public void setXyndId(Integer xyndId) {
        this.xyndId = xyndId;
    }

    public Integer getYyqkId() {
        return yyqkId;
    }

    public void setYyqkId(Integer yyqkId) {
        this.yyqkId = yyqkId;
    }

    public String getFnd() {
        return fnd;
    }

    public void setFnd(String fnd) {
        this.fnd = fnd == null ? null : fnd.trim();
    }

    public String getGnd() {
        return gnd;
    }

    public void setGnd(String gnd) {
        this.gnd = gnd == null ? null : gnd.trim();
    }

    public String getYysj() {
        return yysj;
    }

    public void setYysj(String yysj) {
        this.yysj = yysj == null ? null : yysj.trim();
    }
}