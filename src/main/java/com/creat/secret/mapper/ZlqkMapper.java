package com.creat.secret.mapper;

import com.creat.secret.po.Zlqk;
import com.creat.secret.po.ZlqkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZlqkMapper {
    int countByExample(ZlqkExample example);

    int deleteByExample(ZlqkExample example);

    int deleteByPrimaryKey(Integer zlqkId);

    int insert(Zlqk record);

    int insertSelective(Zlqk record);

    List<Zlqk> selectByExample(ZlqkExample example);

    Zlqk selectByPrimaryKey(Integer zlqkId);

    int updateByExampleSelective(@Param("record") Zlqk record, @Param("example") ZlqkExample example);

    int updateByExample(@Param("record") Zlqk record, @Param("example") ZlqkExample example);

    int updateByPrimaryKeySelective(Zlqk record);

    int updateByPrimaryKey(Zlqk record);
}