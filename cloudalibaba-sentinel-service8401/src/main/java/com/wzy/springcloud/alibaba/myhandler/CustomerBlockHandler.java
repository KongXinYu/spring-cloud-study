package com.wzy.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.wzy.commons.entity.common.CommonResult;

/**
 * @description:
 * @author: WuZY
 * @time: 2021/3/23 0023
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----1");
    }
    public static CommonResult handlerException2(BlockException exception)
    {
        return new CommonResult(4444,"按客戶自定义,global handlerException----2");
    }
}
