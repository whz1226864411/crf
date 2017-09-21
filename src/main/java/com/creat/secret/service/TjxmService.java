package com.creat.secret.service;

import com.creat.secret.po.Pic;
import com.creat.secret.po.PictureFiles;
import com.creat.secret.po.TjxmCustom;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * Created by Administrator on 2017/8/29.
 */
public interface TjxmService {
    void updateTjxm(TjxmCustom tjxmCustom, PictureFiles pictureFiles) throws PicTooManyException;
    Pic uploadPics(MultipartFile multipartFile) throws IOException;
}
