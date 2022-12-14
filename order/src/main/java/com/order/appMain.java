package com.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@EnableDiscoveryClient
public class appMain {

    public static void main(String[] args) {
        SpringApplication.run(appMain.class);

        System.out.println("1 gift!");
        System.out.println("2 gift!");
        System.out.println("master gift!");
        System.out.println("hot-fix gift!");
        System.out.println("master git22!");
        System.out.println("master git333333333333333333!");
        System.out.println("master git333333333333333333!");
        System.out.println("master 9999999999999999!");
        System.out.println("master git3338888888888888!");
    }
}
