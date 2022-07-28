package com.boot;


import com.boot.controller.HelloController;
import org.openjdk.jol.info.ClassLayout;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
public class appMain {

    public static void main(String[] args) {
      /*  ConfigurableApplicationContext context = SpringApplication.run(appMain.class, args);
        HelloController bean = context.getBean(HelloController.class);*/
       // bean.utilTime.now();

        Object obj=new Object();
        System.out.println(ClassLayout.parseInstance(obj).toPrintable());

    }
}
