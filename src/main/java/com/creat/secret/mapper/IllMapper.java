package com.creat.secret.mapper;

import com.creat.secret.po.Ill;
import com.creat.secret.po.IllExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IllMapper {
    int countByExample(IllExample example);

    int deleteByExample(IllExample example);

    int deleteByPrimaryKey(Integer illId);

    int insert(Ill record);

    int insertSelective(Ill record);

    List<Ill> selectByExample(IllExample example);

    Ill selectByPrimaryKey(Integer illId);

    int updateByExampleSelective(@Param("record") Ill record, @Param("example") IllExample example);

    int updateByExample(@Param("record") Ill record, @Param("example") IllExample example);

    int updateByPrimaryKeySelective(Ill record);

    int updateByPrimaryKey(Ill record);
}