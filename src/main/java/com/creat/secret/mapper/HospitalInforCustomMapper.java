package com.creat.secret.mapper;

import com.creat.secret.po.HospitalInforCustom;
import com.creat.secret.po.HospitalInforExample;

import java.util.List;

/**
 * Created by Administrator on 2017/9/3.
 */
public interface HospitalInforCustomMapper {
    List<HospitalInforCustom> selectByExample(HospitalInforExample hospitalInforExample);
}
