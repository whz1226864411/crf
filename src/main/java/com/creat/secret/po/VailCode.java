package com.creat.secret.po;

import java.util.Date;

/**
 * Created by Administrator on 2017/8/25.
 */
public class VailCode {
    private String value;
    private Date createTime;
    private int validTime;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getValidTime() {
        return validTime;
    }

    public void setValidTime(int validTime) {
        this.validTime = validTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
