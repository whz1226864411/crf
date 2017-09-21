package com.creat.secret.mapper;

import com.creat.secret.po.Yyqk;
import com.creat.secret.po.YyqkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YyqkMapper {
    int countByExample(YyqkExample example);

    int deleteByExample(YyqkExample example);

    int deleteByPrimaryKey(Integer yyqkId);

    int insert(Yyqk record);

    int insertSelective(Yyqk record);

    List<Yyqk> selectByExample(YyqkExample example);

    Yyqk selectByPrimaryKey(Integer yyqkId);

    int updateByExampleSelective(@Param("record") Yyqk record, @Param("example") YyqkExample example);

    int updateByExample(@Param("record") Yyqk record, @Param("example") YyqkExample example);

    int updateByPrimaryKeySelective(Yyqk record);

    int updateByPrimaryKey(Yyqk record);
}