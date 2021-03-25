package com.wzy.springcloud.alibaba.service.impl;

import com.wzy.springcloud.alibaba.dao.StorageDao;
import com.wzy.springcloud.alibaba.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: WuZY
 * @time: 2021/3/24 0024
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count) {

        log.info("------->storage-service中扣减库存开始");
        storageDao.decrease(productId,count);
        log.info("------->storage-service中扣减库存结束");

    }
}
