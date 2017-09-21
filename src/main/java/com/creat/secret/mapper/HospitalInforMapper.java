package com.creat.secret.mapper;

import com.creat.secret.po.HospitalInfor;
import com.creat.secret.po.HospitalInforExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HospitalInforMapper {
    int countByExample(HospitalInforExample example);

    int deleteByExample(HospitalInforExample example);

    int deleteByPrimaryKey(Integer hospitalInforId);

    int insert(HospitalInfor record);

    int insertSelective(HospitalInfor record);

    List<HospitalInfor> selectByExample(HospitalInforExample example);

    HospitalInfor selectByPrimaryKey(Integer hospitalInforId);

    int updateByExampleSelective(@Param("record") HospitalInfor record, @Param("example") HospitalInforExample example);

    int updateByExample(@Param("record") HospitalInfor record, @Param("example") HospitalInforExample example);

    int updateByPrimaryKeySelective(HospitalInfor record);

    int updateByPrimaryKey(HospitalInfor record);
}