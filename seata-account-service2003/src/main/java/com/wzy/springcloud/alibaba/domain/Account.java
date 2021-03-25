package com.wzy.springcloud.alibaba.domain;

import lombok.Data;

@Data
public class Account {

    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;

    /**
     * 用户id
     */
    private Long userId;
}
