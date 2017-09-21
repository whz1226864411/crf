package com.creat.secret.po;

import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/9/12.
 */
public class PictureFiles {
    private List<List<String>> multipartFiles;


    public List<List<String>> getMultipartFiles() {
        return multipartFiles;
    }

    public void setMultipartFiles(List<List<String>> multipartFiles) {
        this.multipartFiles = multipartFiles;
    }
}
