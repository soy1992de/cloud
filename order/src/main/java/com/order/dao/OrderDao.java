package com.order.dao;

import com.order.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/*@Mapper
@Repository*/
public interface OrderDao {

    public Integer saveOrder(OrderEntity order);

}
