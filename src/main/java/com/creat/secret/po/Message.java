package com.creat.secret.po;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/8/25.
 */
public class Message implements Serializable{
    private boolean success;
    private String message;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
