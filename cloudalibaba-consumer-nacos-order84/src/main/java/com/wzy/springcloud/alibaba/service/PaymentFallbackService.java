package com.wzy.springcloud.alibaba.service;

import com.wzy.commons.entity.common.CommonResult;
import com.wzy.commons.entity.payment.Payment;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: WuZY
 * @time: 2021/3/24 0024
 */
@Component
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
