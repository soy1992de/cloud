package com.store.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StoreEntity {




    private Long productId;
    private Long residue; // '剩余库存'
    private Long total; // '总库存'
    private Long used; // '已用库存'
}
