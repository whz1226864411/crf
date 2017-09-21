package com.creat.photo.service;


import com.creat.secret.po.Message;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Administrator on 2017/9/17.
 */
public interface RMIPhotoService {
    String savePhoto(MultipartFile picture);
}
