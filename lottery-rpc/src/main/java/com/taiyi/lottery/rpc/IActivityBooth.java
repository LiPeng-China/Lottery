package com.taiyi.lottery.rpc;

import com.taiyi.lottery.rpc.req.ActivityReq;
import com.taiyi.lottery.rpc.res.ActivityRes;

/**
 * 活动站台
 * 1、创建活动
 * 2、更新活动
 * 3、查询活动
 */
public interface IActivityBooth {
     ActivityRes queryActivityById(ActivityReq req);
}
