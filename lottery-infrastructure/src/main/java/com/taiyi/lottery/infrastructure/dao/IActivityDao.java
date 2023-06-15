package com.taiyi.lottery.infrastructure.dao;

import com.taiyi.lottery.infrastructure.entity.Activity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IActivityDao {
    void insert(Activity req);

    Activity queryActivityById(Long activityId);
}
