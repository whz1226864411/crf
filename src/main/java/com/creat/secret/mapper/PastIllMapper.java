package com.creat.secret.mapper;

import com.creat.secret.po.PastIll;
import com.creat.secret.po.PastIllExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PastIllMapper {
    int countByExample(PastIllExample example);

    int deleteByExample(PastIllExample example);

    int deleteByPrimaryKey(Integer pastId);

    int insert(PastIll record);

    int insertSelective(PastIll record);

    List<PastIll> selectByExample(PastIllExample example);

    PastIll selectByPrimaryKey(Integer pastId);

    int updateByExampleSelective(@Param("record") PastIll record, @Param("example") PastIllExample example);

    int updateByExample(@Param("record") PastIll record, @Param("example") PastIllExample example);

    int updateByPrimaryKeySelective(PastIll record);

    int updateByPrimaryKey(PastIll record);
}