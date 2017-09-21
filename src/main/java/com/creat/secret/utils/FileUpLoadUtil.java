package com.creat.secret.utils;

import com.creat.secret.controller.TjxmController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2017/8/25.
 */
public class FileUpLoadUtil {
    public static void upload(String newFileName, MultipartFile pictureFile) throws IOException {
        String path = TjxmController.class.getClassLoader().getResource("/").getPath().replaceAll("WEB-INF/classes/","")+newFileName;
        File uploadPic = new File(path);
        if(!uploadPic.exists()){
            uploadPic.mkdirs();
        }
        //向磁盘写文件
        pictureFile.transferTo(uploadPic);
    }
}
