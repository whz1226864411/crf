package com.creat.secret.mapper;

import com.creat.secret.po.CrfInfor;
import com.creat.secret.po.CrfInforExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrfInforMapper {
    int countByExample(CrfInforExample example);

    int deleteByExample(CrfInforExample example);

    int deleteByPrimaryKey(Integer crfId);

    int insert(CrfInfor record);

    int insertSelective(CrfInfor record);

    List<CrfInfor> selectByExample(CrfInforExample example);

    CrfInfor selectByPrimaryKey(Integer crfId);

    int updateByExampleSelective(@Param("record") CrfInfor record, @Param("example") CrfInforExample example);

    int updateByExample(@Param("record") CrfInfor record, @Param("example") CrfInforExample example);

    int updateByPrimaryKeySelective(CrfInfor record);

    int updateByPrimaryKey(CrfInfor record);
}