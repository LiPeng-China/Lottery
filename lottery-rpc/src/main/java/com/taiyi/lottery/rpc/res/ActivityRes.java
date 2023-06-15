package com.taiyi.lottery.rpc.res;

import com.taiyi.lottery.common.Result;
import com.taiyi.lottery.rpc.dto.ActivityDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActivityRes implements Serializable {
    private ActivityDto activity;
    private Result result;

    public ActivityRes(Result result){
        this.result = result;
    }
}
