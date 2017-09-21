package com.creat.secret.service.impl;

import com.creat.secret.mapper.XyndMapper;
import com.creat.secret.mapper.YyqkMapper;
import com.creat.secret.mapper.ZlqkMapper;
import com.creat.secret.po.Xynd;
import com.creat.secret.po.YyqkCustom;
import com.creat.secret.po.Zlqk;
import com.creat.secret.po.ZlqkCustom;
import com.creat.secret.service.ZlqkService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2017/8/29.
 */
public class ZlqkServiceImpl implements ZlqkService{

    @Autowired
    private ZlqkMapper zlqkMapper;
    @Autowired
    private YyqkMapper yyqkMapper;
    @Autowired
    private XyndMapper xyndMapper;

    public void updateZlqk(ZlqkCustom zlqkCustom) {
        if(zlqkCustom.getZlqkId() != null){
            zlqkMapper.updateByPrimaryKey(zlqkCustom);
            List<YyqkCustom> yyqkCustomList = zlqkCustom.getYyqkCustomList();
            if(yyqkCustomList != null && yyqkCustomList.size() > 0){
                for(YyqkCustom yyqkCustom : yyqkCustomList){
                    yyqkCustom.setZlqkId(zlqkCustom.getZlqkId());
                    if(yyqkCustom.getYyqkId() != null){
                       yyqkMapper.updateByPrimaryKey(yyqkCustom);
                       List<Xynd> xyndList = yyqkCustom.getXxydList();
                        for(Xynd xynd : xyndList){
                            xynd.setYyqkId(yyqkCustom.getYyqkId());
                            if(xynd.getXyndId() != null){
                                xyndMapper.updateByPrimaryKey(xynd);
                            }else {
                                xyndMapper.insert(xynd);
                            }
                        }
                    }else {
                        yyqkMapper.insert(yyqkCustom);
                        List<Xynd> xyndList = yyqkCustom.getXxydList();
                        for(Xynd xynd : xyndList){
                            xynd.setYyqkId(yyqkCustom.getYyqkId());
                            xyndMapper.insert(xynd);
                        }
                    }
                }
            }
        }else {
            zlqkMapper.insert(zlqkCustom);
            List<YyqkCustom> yyqkCustomList = zlqkCustom.getYyqkCustomList();
            if(yyqkCustomList != null && yyqkCustomList.size() > 0){
                for(YyqkCustom yyqkCustom : yyqkCustomList){
                    yyqkCustom.setZlqkId(zlqkCustom.getZlqkId());
                    yyqkMapper.insert(yyqkCustom);
                    List<Xynd> xyndList = yyqkCustom.getXxydList();
                    for(Xynd xynd : xyndList){
                        xynd.setYyqkId(yyqkCustom.getYyqkId());
                        xyndMapper.insert(xynd);
                    }
                }
            }
        }
    }
}
