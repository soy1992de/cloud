package com.order.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntity {

    private Long id;
    private Long userId;
    private Long productId;
    private Long count;
    private BigDecimal money;
    private Long status; // 订单状态 : 0 创建中 1 已经完结
}
