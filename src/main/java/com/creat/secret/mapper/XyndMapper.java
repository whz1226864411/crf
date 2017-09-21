package com.creat.secret.mapper;

import com.creat.secret.po.Xynd;
import com.creat.secret.po.XyndExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XyndMapper {
    int countByExample(XyndExample example);

    int deleteByExample(XyndExample example);

    int deleteByPrimaryKey(Integer xyndId);

    int insert(Xynd record);

    int insertSelective(Xynd record);

    List<Xynd> selectByExample(XyndExample example);

    Xynd selectByPrimaryKey(Integer xyndId);

    int updateByExampleSelective(@Param("record") Xynd record, @Param("example") XyndExample example);

    int updateByExample(@Param("record") Xynd record, @Param("example") XyndExample example);

    int updateByPrimaryKeySelective(Xynd record);

    int updateByPrimaryKey(Xynd record);
}