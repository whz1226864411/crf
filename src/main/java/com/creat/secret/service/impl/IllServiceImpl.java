package com.creat.secret.service.impl;

import com.creat.secret.mapper.IllMapper;
import com.creat.secret.po.Ill;
import com.creat.secret.service.IllService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/8/29.
 */
public class IllServiceImpl implements IllService{

    @Autowired
    private IllMapper illMapper;

    public void updateIll(Ill ill) {
        if(ill.getIllId() == null){
            illMapper.insert(ill);
        }else {
            illMapper.updateByPrimaryKey(ill);
        }
    }
}
