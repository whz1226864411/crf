package com.creat.secret.mapper;

import com.creat.secret.po.PermissionWeb;
import com.creat.secret.po.PermissionWebExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissionWebMapper {
    int countByExample(PermissionWebExample example);

    int deleteByExample(PermissionWebExample example);

    int insert(PermissionWeb record);

    int insertSelective(PermissionWeb record);

    List<PermissionWeb> selectByExample(PermissionWebExample example);

    int updateByExampleSelective(@Param("record") PermissionWeb record, @Param("example") PermissionWebExample example);

    int updateByExample(@Param("record") PermissionWeb record, @Param("example") PermissionWebExample example);
}