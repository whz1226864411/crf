package com.creat.secret.mapper;

import com.creat.secret.po.CrfRecord;

import java.util.List;

/**
 * Created by Administrator on 2017/8/30.
 */
public interface CrfRecordMapper {

    List<CrfRecord> selectAllByDoctorId(Integer doctorId);
}
