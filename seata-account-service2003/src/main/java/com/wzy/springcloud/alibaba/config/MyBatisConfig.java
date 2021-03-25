package com.wzy.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: WuZY
 * @time: 2021/3/24 0024
 */
@Configuration
@MapperScan({"com.wzy.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
