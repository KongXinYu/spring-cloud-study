package com.wzy.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: WuZY
 * @time: 2021/2/25 0025
 */
@Configuration
public class FeignConfig {
    /**
     * feignClient配置日志级别
     * @return
     */
    @Bean
    public Logger.Level feignLoggerLevel() {
        // 请求和相应头信息，请求和响应正文及元数据
        return Logger.Level.FULL;
    }

}
