package com.wzy.springcloud.alibaba.service;

/**
 * @description:
 * @author: WuZY
 * @time: 2021/3/24 0024
 */

public interface StorageService {

    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);

}
