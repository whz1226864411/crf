package com.creat.secret.po;

import java.util.List;

/**
 * Created by Administrator on 2017/8/30.
 */
public class CrfRecordVO {

    private boolean success;
    private String message;
    private List<CrfRecord> crfRecordList;

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

    public List<CrfRecord> getCrfRecordList() {
        return crfRecordList;
    }

    public void setCrfRecordList(List<CrfRecord> crfRecordList) {
        this.crfRecordList = crfRecordList;
    }
}
