package com.creat.secret.mapper;

import com.creat.secret.po.CrfInforCustom;

import java.util.List;

/**
 * Created by Administrator on 2017/9/3.
 */
public interface CrfInforCustomMapper {
    CrfInforCustom getCrfInforCustomByPk(Integer crfId);
    int updateSubmittedByCrfIds(List<Integer> crfIds);
}
