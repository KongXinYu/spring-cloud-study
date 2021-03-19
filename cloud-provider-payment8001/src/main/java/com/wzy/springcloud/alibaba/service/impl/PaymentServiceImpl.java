package com.wzy.springcloud.alibaba.service.impl;

import com.wzy.commons.entity.payment.Payment;
import com.wzy.springcloud.alibaba.dao.PaymentMapper;
import com.wzy.springcloud.alibaba.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: WuZY
 * @time: 2021/2/2 0002
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public int create(Payment payment) {
        return paymentMapper.insert(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentMapper.selectByPrimaryKey(id);
    }
}
