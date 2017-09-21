package com.creat.secret.mapper;

import com.creat.secret.po.NdtCustom;
import com.creat.secret.po.NdtExample;

import java.util.List;

/**
 * Created by Administrator on 2017/9/3.
 */
public interface NdtCustomMapper {
    List<NdtCustom> selectCustomByExample(NdtExample ndtExample);
}
