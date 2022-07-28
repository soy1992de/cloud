package com.order.controller;

import com.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class helloController {



    @Autowired
    private OrderService orderService;

    @GetMapping("/config")
    public String configInfo(){
        return orderService.orderHandler();
    }

}
