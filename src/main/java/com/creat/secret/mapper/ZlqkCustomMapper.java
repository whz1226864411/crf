package com.creat.secret.mapper;

import com.creat.secret.po.ZlqkCustom;
import com.creat.secret.po.ZlqkExample;

import java.util.List;

/**
 * Created by Administrator on 2017/9/3.
 */
public interface ZlqkCustomMapper {
    List<ZlqkCustom> selectCustomByExample(ZlqkExample zlqkExample);
}
