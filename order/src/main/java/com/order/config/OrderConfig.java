package com.order.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.order.dao")
@EnableFeignClients(basePackages ="com.order.feign")
@RefreshScope
public class OrderConfig {
}
