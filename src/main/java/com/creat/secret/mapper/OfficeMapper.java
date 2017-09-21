package com.creat.secret.mapper;

import com.creat.secret.po.Office;
import com.creat.secret.po.OfficeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfficeMapper {
    int countByExample(OfficeExample example);

    int deleteByExample(OfficeExample example);

    int deleteByPrimaryKey(Integer officeId);

    int insert(Office record);

    int insertSelective(Office record);

    List<Office> selectByExample(OfficeExample example);

    Office selectByPrimaryKey(Integer officeId);

    int updateByExampleSelective(@Param("record") Office record, @Param("example") OfficeExample example);

    int updateByExample(@Param("record") Office record, @Param("example") OfficeExample example);

    int updateByPrimaryKeySelective(Office record);

    int updateByPrimaryKey(Office record);
}