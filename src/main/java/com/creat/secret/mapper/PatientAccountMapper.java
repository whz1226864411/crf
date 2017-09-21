package com.creat.secret.mapper;

import com.creat.secret.po.PatientAccount;
import com.creat.secret.po.PatientAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatientAccountMapper {
    int countByExample(PatientAccountExample example);

    int deleteByExample(PatientAccountExample example);

    int deleteByPrimaryKey(Integer patientAccountId);

    int insert(PatientAccount record);

    int insertSelective(PatientAccount record);

    List<PatientAccount> selectByExample(PatientAccountExample example);

    PatientAccount selectByPrimaryKey(Integer patientAccountId);

    int updateByExampleSelective(@Param("record") PatientAccount record, @Param("example") PatientAccountExample example);

    int updateByExample(@Param("record") PatientAccount record, @Param("example") PatientAccountExample example);

    int updateByPrimaryKeySelective(PatientAccount record);

    int updateByPrimaryKey(PatientAccount record);
}