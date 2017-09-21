package com.creat.secret.mapper;

import com.creat.secret.po.YyqkCustom;
import com.creat.secret.po.YyqkExample;

import java.util.List;

/**
 * Created by Administrator on 2017/9/3.
 */
public interface YyqkCustomMapper {
    List<YyqkCustom> selectCustomByExample(YyqkExample yyqkExample);
}
