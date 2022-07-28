package com.order;

import com.order.service.OrderService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class appTest {
    @Autowired
    private OrderService orderService;

    @Test
    public void shouldAnswerWithTrue()
    {
        String handler = orderService.orderHandler();
        System.out.println(handler);
    }
}
