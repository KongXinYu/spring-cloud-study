package com.wzy.springcloud.alibaba.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @description:
 * @author: WuZY
 * @time: 2021/2/24 0024
 */
public interface LoadBalancer {

    public ServiceInstance instances(List<ServiceInstance> serviceInstances);


}
