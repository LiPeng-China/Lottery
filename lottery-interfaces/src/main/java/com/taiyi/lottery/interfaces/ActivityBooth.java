package com.taiyi.lottery.interfaces;

import com.taiyi.lottery.common.Result;
import com.taiyi.lottery.infrastructure.dao.IActivityDao;
import com.taiyi.lottery.infrastructure.entity.Activity;
import com.taiyi.lottery.rpc.IActivityBooth;
import com.taiyi.lottery.rpc.dto.ActivityDto;
import com.taiyi.lottery.rpc.req.ActivityReq;
import com.taiyi.lottery.rpc.res.ActivityRes;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;

/**
 * 活动站台
 */
@Service
public class ActivityBooth implements IActivityBooth {

    @Resource
    private IActivityDao activityDao;

    @Override
    public ActivityRes queryActivityById(ActivityReq req) {
        Activity activity = activityDao.queryActivityById(req.getActivityId());

        ActivityDto activityDto = new ActivityDto();
        activityDto.setActivityId(activity.getActivityId());
        activityDto.setActivityName(activity.getActivityName());
        activityDto.setActivityDesc(activity.getActivityDesc());
        activityDto.setBeginDateTime(activity.getBeginDateTime());
        activityDto.setEndDateTime(activity.getEndDateTime());
        activityDto.setStockCount(activity.getStockCount());
        activityDto.setTakeCount(activity.getTakeCount());

        return new ActivityRes(activityDto, Result.buildSuccessResult());
    }
}
