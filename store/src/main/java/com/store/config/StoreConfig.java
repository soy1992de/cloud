package com.store.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.store.dao")
public class StoreConfig {

   /* public DataSource dataSource(){
        return new DataSo
    }*/
}
