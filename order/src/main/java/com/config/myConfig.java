package com.config;

import com.netflix.client.config.DefaultClientConfigImpl;
import com.netflix.client.config.IClientConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

@Configuration
//@ComponentScan("com")
public class myConfig {


  /*  @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IClientConfig getDefaultClientConfigImpl(){
        return new DefaultClientConfigImpl();
    }
*/

    /*public void sys(){
        System.out.println("----");
    }

    public static void main(String[] args) {
        *//*ReentrantLock lock =new ReentrantLock(true);
        lock.lock();
        lock.unlock();*//*

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 5, TimeUnit.MINUTES, new ArrayBlockingQueue<Runnable>(5));

        threadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("=======");
            }
        });
    }*/
}
