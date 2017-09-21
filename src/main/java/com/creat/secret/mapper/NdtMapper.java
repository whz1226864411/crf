package com.creat.secret.mapper;

import com.creat.secret.po.Ndt;
import com.creat.secret.po.NdtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NdtMapper {
    int countByExample(NdtExample example);

    int deleteByExample(NdtExample example);

    int deleteByPrimaryKey(Integer ndtId);

    int insert(Ndt record);

    int insertSelective(Ndt record);

    List<Ndt> selectByExample(NdtExample example);

    Ndt selectByPrimaryKey(Integer ndtId);

    int updateByExampleSelective(@Param("record") Ndt record, @Param("example") NdtExample example);

    int updateByExample(@Param("record") Ndt record, @Param("example") NdtExample example);

    int updateByPrimaryKeySelective(Ndt record);

    int updateByPrimaryKey(Ndt record);
}