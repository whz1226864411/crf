package com.creat.secret.service.impl;

import com.creat.secret.mapper.NdtMapper;
import com.creat.secret.mapper.PicMapper;
import com.creat.secret.mapper.TjxmMapper;
import com.creat.secret.po.*;
import com.creat.secret.service.PicTooManyException;
import com.creat.secret.service.TjxmService;
import com.creat.secret.utils.FileUpLoadUtil;
import com.creat.secret.utils.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by whz on 2017/8/29.
 */
public class TjxmServiceImpl implements TjxmService{

    @Autowired
    private TjxmMapper tjxmMapper;
    @Autowired
    private NdtMapper ndtMapper;
    @Autowired
    private PicMapper picMapper;

    public void updateTjxm(TjxmCustom tjxmCustom, PictureFiles pictureFiles) throws PicTooManyException {
        try {
            List<List<String>> multipartFiles = null;
            if(pictureFiles != null){
                multipartFiles = pictureFiles.getMultipartFiles();
            }
            if(tjxmCustom.getTjxmId() == null){
                tjxmMapper.insert(tjxmCustom);
                for(int i = 0; i < tjxmCustom.getNdtCustomList().size(); i++){
                    NdtCustom ndtCustom = tjxmCustom.getNdtCustomList().get(i);
                    ndtCustom.setTjxmId(tjxmCustom.getTjxmId());
                    ndtMapper.insert(ndtCustom);
                    saveMultipartFiles(multipartFiles,i,ndtCustom.getNdtId());
                }
            }else {
                tjxmMapper.updateByPrimaryKey(tjxmCustom);
                for(int i = 0; i < tjxmCustom.getNdtCustomList().size(); i++){
                    NdtCustom ndtCustom = tjxmCustom.getNdtCustomList().get(i);
                    if(ndtCustom.getNdtId() != null){
                        deletePicByNdtId(ndtCustom.getNdtId());
                        ndtCustom.setTjxmId(tjxmCustom.getTjxmId());
                        ndtMapper.updateByPrimaryKey(ndtCustom);
                    }else {
                        ndtCustom.setTjxmId(tjxmCustom.getTjxmId());
                        ndtMapper.insert(ndtCustom);
                    }
                    saveMultipartFiles(multipartFiles,i,ndtCustom.getNdtId());
                }
            }
        }catch (IOException e){
            e.getStackTrace();
        }
    }
    //删除对应ndtId的图片
    private void deletePicByNdtId(Integer ndtId){
        PicExample picExample = new PicExample();
        PicExample.Criteria criteria = picExample.createCriteria();
        criteria.andNdtIdEqualTo(ndtId);
        picMapper.deleteByExample(picExample);
    }
    //保存图片并持久化到数据库
    public void savePic( List<String> multipartFiles,Integer ndtId) throws IOException {
        for(int n = 0; n < multipartFiles.size(); n++){
            //Pic pic = uploadPics(multipartFiles[n]);
            Pic pic = new Pic();
            pic.setPicUrl(multipartFiles.get(n));
            pic.setNdtId(ndtId);
            picMapper.insert(pic);
        }
    }
    //保存图片到本地文件夹
    public Pic uploadPics(MultipartFile multipartFile) throws IOException {
        String pictureFileName =  multipartFile.getOriginalFilename();
        String newFileName = "cache-pic/"+UUIDUtil.getUUID().toString()+pictureFileName.substring(pictureFileName.lastIndexOf("."));
        FileUpLoadUtil.upload(newFileName,multipartFile);
        Pic pic = new Pic();
        pic.setPicUrl(newFileName);
        return pic;
    }

    public void saveMultipartFiles(List<List<String>> multipartFiles,int index,Integer ndtId) throws PicTooManyException, IOException {
        if(multipartFiles != null && multipartFiles.size() > index){
            List<String> pics = multipartFiles.get(index);
            if(pics != null && pics.size() > 0){
                if(pics.size() > 3){
                    throw new PicTooManyException("照片上传每次不能多于3张！");
                }
                savePic(pics,ndtId);
            }
        }
    }
}
