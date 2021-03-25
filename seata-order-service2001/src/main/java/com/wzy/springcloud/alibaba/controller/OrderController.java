package com.wzy.springcloud.alibaba.controller;

import com.wzy.springcloud.alibaba.domain.CommonResult;
import com.wzy.springcloud.alibaba.domain.Order;
import com.wzy.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: WuZY
 * @time: 2021/3/24 0024
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order)
    {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
