package com.creat.secret.controller;

import com.creat.secret.po.Message;
import com.creat.secret.po.PictureMessage;
import com.creat.secret.service.PictureService;
import com.creat.photo.service.RMIPhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by whz on 2017/9/15.
 */
@Controller
@RequestMapping("/picture")
public class PictureController {

    @Autowired
    private RMIPhotoService rmiPhotoService;
    //上传图片
    @RequestMapping(value = "/uploadPicture",method = RequestMethod.POST,consumes = "multipart/form-data")
    public @ResponseBody Message uploadPicture(MultipartFile picture, HttpServletRequest request){
        PictureMessage message = new PictureMessage();
        if (picture == null){
            message.setSuccess(false);
            message.setMessage("文件不能为空！");
        }else {
                String url = rmiPhotoService.savePhoto(picture);
                if(url.equals("")){
                    message.setSuccess(false);
                    message.setMessage("未知错误！");
                }else {
                    message.setSuccess(true);
                    message.setMessage("上传成功！");
                    message.setUrl(url);
                }
        }
        return message;
    }
}
