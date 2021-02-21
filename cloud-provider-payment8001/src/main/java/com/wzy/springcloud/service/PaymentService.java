package com.wzy.springcloud.service;

import com.wzy.commons.entity.payment.Payment;

/**
 * @description:
 * @author: WuZY
 * @time: 2021/2/2 0002
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
