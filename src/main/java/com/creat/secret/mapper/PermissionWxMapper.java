package com.creat.secret.mapper;

import com.creat.secret.po.PermissionWx;
import com.creat.secret.po.PermissionWxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissionWxMapper {
    int countByExample(PermissionWxExample example);

    int deleteByExample(PermissionWxExample example);

    int insert(PermissionWx record);

    int insertSelective(PermissionWx record);

    List<PermissionWx> selectByExample(PermissionWxExample example);

    int updateByExampleSelective(@Param("record") PermissionWx record, @Param("example") PermissionWxExample example);

    int updateByExample(@Param("record") PermissionWx record, @Param("example") PermissionWxExample example);
}