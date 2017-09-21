package com.creat.secret.mapper;

import com.creat.secret.po.Tjxm;
import com.creat.secret.po.TjxmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TjxmMapper {
    int countByExample(TjxmExample example);

    int deleteByExample(TjxmExample example);

    int deleteByPrimaryKey(Integer tjxmId);

    int insert(Tjxm record);

    int insertSelective(Tjxm record);

    List<Tjxm> selectByExample(TjxmExample example);

    Tjxm selectByPrimaryKey(Integer tjxmId);

    int updateByExampleSelective(@Param("record") Tjxm record, @Param("example") TjxmExample example);

    int updateByExample(@Param("record") Tjxm record, @Param("example") TjxmExample example);

    int updateByPrimaryKeySelective(Tjxm record);

    int updateByPrimaryKey(Tjxm record);
}