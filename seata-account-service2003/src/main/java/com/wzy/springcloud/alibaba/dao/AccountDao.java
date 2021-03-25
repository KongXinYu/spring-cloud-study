package com.wzy.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @description:
 * @author: WuZY
 * @time: 2021/3/24 0024
 */
public interface AccountDao {

    /**
     * 扣减账户余额
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);


}
