package com.netty3;

import io.netty.channel.DefaultEventLoopGroup;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.InetAddress;

public class helloServer {

    public void start(InetAddress address){
        NioEventLoopGroup boss=new NioEventLoopGroup();
        NioEventLoopGroup work=new NioEventLoopGroup();
        EventLoopGroup  handler = new DefaultEventLoopGroup();
    }
}
