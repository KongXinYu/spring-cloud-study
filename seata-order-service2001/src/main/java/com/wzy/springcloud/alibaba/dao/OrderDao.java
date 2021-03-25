package com.wzy.springcloud.alibaba.dao;

import com.wzy.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @description:
 * @author: WuZY
 * @time: 2021/3/24 0024
 */
@Mapper
public interface OrderDao {

    //1 新建订单
    void create(Order order);

    //2 修改订单状态，从零改为1
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
