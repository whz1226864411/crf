package com.creat.secret.mapper;

import com.creat.secret.po.Blfy;
import com.creat.secret.po.BlfyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlfyMapper {
    int countByExample(BlfyExample example);

    int deleteByExample(BlfyExample example);

    int deleteByPrimaryKey(Integer blfyId);

    int insert(Blfy record);

    int insertSelective(Blfy record);

    List<Blfy> selectByExample(BlfyExample example);

    Blfy selectByPrimaryKey(Integer blfyId);

    int updateByExampleSelective(@Param("record") Blfy record, @Param("example") BlfyExample example);

    int updateByExample(@Param("record") Blfy record, @Param("example") BlfyExample example);

    int updateByPrimaryKeySelective(Blfy record);

    int updateByPrimaryKey(Blfy record);
}