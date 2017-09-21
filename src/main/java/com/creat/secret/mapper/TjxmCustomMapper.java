package com.creat.secret.mapper;

import com.creat.secret.po.TjxmCustom;
import com.creat.secret.po.TjxmExample;

import java.util.List;

/**
 * Created by Administrator on 2017/9/3.
 */
public interface TjxmCustomMapper {
    List<TjxmCustom> selectCustomByExample(TjxmExample tjxmExample);
}
