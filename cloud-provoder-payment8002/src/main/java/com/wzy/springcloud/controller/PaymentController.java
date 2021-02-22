package com.wzy.springcloud.controller;

import com.wzy.commons.entity.common.CommonResult;
import com.wzy.commons.entity.payment.Payment;
import com.wzy.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @description:
 * @author: WuZY
 * @time: 2021/2/2 0002
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        if (result > 0) {
            return new CommonResult(200
                    ,"插入数据库成功,serverPort: "+serverPort,result);
        } else {
            return new CommonResult(444
                    ,"插入数据库失败,serverPort: ",result);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable Long id){
        Payment payment = paymentService.getPaymentById(id);
        if (payment != null) {
            return new CommonResult(200
                    ,"查询数据成功,serverPort: "+serverPort,payment);
        } else {
            return new CommonResult(444
                    ,"没有对应数据,serverPort: ",payment);
        }
    }
}
