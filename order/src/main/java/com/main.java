package com;

import com.config.myConfig;
import com.entity.AEvent;
import com.entity.order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@SpringBootApplication
@EnableDiscoveryClient
public class main {


   /* class user{
        public   void  sys(){
            System.out.println("======");
            System.out.println(user.this);
        }
    }*/

    public static void main(String[] args) {
        SpringApplication.run(main.class);

        /*SpringApplication.run(main.class);

        Executors.newCachedThreadPool()*/
       /* new ThreadPoolExecutor(0, Integer.MAX_VALUE,
                60L, TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(20));*/
       // System.out.println(i++);
      /*  Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                super.run();
            }
        });
        ExecutorService executorService = Executors.newCachedThreadPool();
        *//*executorService.execute();
        executorService.submit()*//*
        *//*ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleAtFixedRate()*//*


        //ScheduledThreadPoolExecutor scheduledThreadPoolExecutor =new ScheduledThreadPoolExecutor();
        // ConfigurableApplicationContext run = SpringApplication.run(main.class);

       *//* order bean = run.getBean(order.class);

        bean.getUtilTime().now();*//*

        ReentrantReadWriteLock  lock =new ReentrantReadWriteLock();
        lock.writeLock().lock();
        lock.readLock().lock();

        String a ="A";
        AEvent aEvent=new AEvent(a);

        AnnotationConfigApplicationContext acp = new AnnotationConfigApplicationContext(myConfig.class);


        acp.publishEvent(aEvent);*/
      //  acp.refresh();

       /* Object order = acp.getBean("order");
        System.out.println(order+"====");*/
     /*  final ReentrantLock lock =new ReentrantLock(true);
        lock.lock();
        lock.unlock();
        new Thread(()->{

            lock.lock();
            System.out.println("--");
        }).start();*/

        //new user().sys();

    //    deadLock();


    }

    public  static  void  deadLock(){
        String  a="a";
        String b="b";
        new Thread(new Runnable(){
            @Override
            public void run() {
                synchronized (a){
                    try {
                        Thread.sleep(1000);
                        System.out.println("----------------");
                         synchronized (b){
                             System.out.println("======");
                         }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"thread a " ).start();


        new Thread(new Runnable(){
            @Override
            public void run() {
                synchronized (b){
                    try {
                        Thread.sleep(1000);
                        System.out.println("------+++++----------");
                        synchronized (a){
                            System.out.println("===||||||||===");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"thread b " ).start();
    }
}
