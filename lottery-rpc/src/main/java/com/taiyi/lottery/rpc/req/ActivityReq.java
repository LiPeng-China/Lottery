package com.taiyi.lottery.rpc.req;

import com.taiyi.lottery.common.Result;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data

public class ActivityReq implements Serializable {
    private Long ActivityId;
}
