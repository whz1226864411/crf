package com.creat.secret.po;

public class Pic {
    private Integer picId;

    private String picUrl;

    private Integer ndtId;

    public Integer getPicId() {
        return picId;
    }

    public void setPicId(Integer picId) {
        this.picId = picId;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public Integer getNdtId() {
        return ndtId;
    }

    public void setNdtId(Integer ndtId) {
        this.ndtId = ndtId;
    }
}