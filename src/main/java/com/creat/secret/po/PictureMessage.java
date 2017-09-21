package com.creat.secret.po;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/9/15.
 */
public class PictureMessage extends Message implements Serializable{
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
