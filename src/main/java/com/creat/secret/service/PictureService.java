package com.creat.secret.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * Created by Administrator on 2017/9/15.
 */
public interface PictureService {
    void uploadPicture(String newFileName, MultipartFile multipartFile) throws IOException;
    String producePictureName(MultipartFile picture);
}
