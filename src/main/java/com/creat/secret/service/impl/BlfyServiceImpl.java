package com.creat.secret.service.impl;

import com.creat.secret.mapper.BlfyMapper;
import com.creat.secret.po.Blfy;
import com.creat.secret.service.BlfyService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/8/29.
 */
public class BlfyServiceImpl implements BlfyService{

    @Autowired
    private BlfyMapper blfyMapper;

    public void updateBlfy(Blfy blfy) {
        if(blfy.getBlfyId() == null){
            blfyMapper.insert(blfy);
        }else {
            blfyMapper.updateByPrimaryKey(blfy);
        }
    }
}
