package com.wzy.springcloud.alibaba.controller;

import com.wzy.commons.entity.common.CommonResult;
import com.wzy.commons.entity.payment.Payment;
import com.wzy.springcloud.alibaba.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

    @Resource
    private DiscoveryClient discoveryClient;

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


    @GetMapping(value = "/payment/discovery")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        for (String element : services) {
            log.info("*****element: " + element);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }

        return this.discoveryClient;

    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB()
    {
        return serverPort;
    }

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout() {
        // 业务逻辑处理正确,大势需要耗费3秒钟
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return serverPort;
    }

    @GetMapping("/payment/zipkin")
    public String paymentZipkin()
    {
        return "hi ,i'am paymentzipkin server fall back，welcome to atguigu，O(∩_∩)O哈哈~";
    }
}
