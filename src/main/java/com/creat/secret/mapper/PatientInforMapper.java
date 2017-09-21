package com.creat.secret.mapper;

import com.creat.secret.po.PatientInfor;
import com.creat.secret.po.PatientInforExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatientInforMapper {
    int countByExample(PatientInforExample example);

    int deleteByExample(PatientInforExample example);

    int deleteByPrimaryKey(Integer patientInforId);

    int insert(PatientInfor record);

    int insertSelective(PatientInfor record);

    List<PatientInfor> selectByExample(PatientInforExample example);

    PatientInfor selectByPrimaryKey(Integer patientInforId);

    int updateByExampleSelective(@Param("record") PatientInfor record, @Param("example") PatientInforExample example);

    int updateByExample(@Param("record") PatientInfor record, @Param("example") PatientInforExample example);

    int updateByPrimaryKeySelective(PatientInfor record);

    int updateByPrimaryKey(PatientInfor record);
}