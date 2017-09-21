package com.creat.secret.po;

/**
 * Created by Administrator on 2017/9/2.
 */
public class LoginMessage extends Message{
    private int id;
    private String identity;
    private Boolean hasCrf;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public Boolean getHasCrf() {
        return hasCrf;
    }

    public void setHasCrf(Boolean hasCrf) {
        this.hasCrf = hasCrf;
    }
}
