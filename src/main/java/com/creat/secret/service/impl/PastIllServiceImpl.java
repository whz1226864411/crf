package com.creat.secret.service.impl;

import com.creat.secret.mapper.PastIllMapper;
import com.creat.secret.po.PastIll;
import com.creat.secret.service.PastIllService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/8/30.
 */
public class PastIllServiceImpl implements PastIllService{
    @Autowired
    private PastIllMapper pastIllMapper;
    public void updatePastIll(PastIll pastIll) {
        if(pastIll.getPastId() == null){
            pastIllMapper.insert(pastIll);
        }else {
            pastIllMapper.updateByPrimaryKey(pastIll);
        }
    }
}
