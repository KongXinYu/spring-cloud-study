package com.wzy.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author: WuZY
 * @time: 2021/3/24 0024
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9004 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9004.class, args);
    }

}
