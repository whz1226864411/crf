package com.creat.secret.service.impl;

import com.creat.secret.service.PictureService;
import com.creat.secret.utils.FileUpLoadUtil;
import com.creat.secret.utils.UUIDUtil;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * Created by Administrator on 2017/9/15.
 */
public class PictureServiceImpl implements PictureService{

    public void uploadPicture(String newFileName, MultipartFile multipartFile)
            throws IOException {
        FileUpLoadUtil.upload(newFileName,multipartFile);
    }

    public String producePictureName(MultipartFile picture) {
        String pictureFileName =  picture.getOriginalFilename();
        int hash = pictureFileName.hashCode()%24;
        String newFileName = "cache-pic/"+ hash+"/"+UUIDUtil.getUUID().toString()+pictureFileName.substring(pictureFileName.lastIndexOf("."));
        return newFileName;
    }
}
