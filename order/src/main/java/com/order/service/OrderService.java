package com.order.service;

import com.order.dao.OrderDao;
import com.order.entity.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class OrderService {

    @Autowired
    private OrderDao orderDao;

    public  String orderHandler(){
        OrderEntity entity =new OrderEntity();
        entity.setUserId(222L);
        entity.setProductId(1L);
        entity.setCount(1L);
        entity.setMoney(new BigDecimal(90));
        orderDao.saveOrder(entity);
        return "200";
    }
}
