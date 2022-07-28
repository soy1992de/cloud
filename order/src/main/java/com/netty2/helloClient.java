package com.netty2;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringEncoder;

public class helloClient {

    public static void main(String[] args) throws InterruptedException {
        start();
    }

    public static void start() throws InterruptedException {
        NioEventLoopGroup work=new NioEventLoopGroup();
        Channel localhost = new Bootstrap().group(work)
                .channel(NioSocketChannel.class)
                .handler(new ChannelInitializer<NioSocketChannel>() {
                    @Override
                    protected void initChannel(NioSocketChannel ch) throws Exception {
                        ch.pipeline().addLast(new StringEncoder());
                    }
                }).connect("localhost", 8080)
                .sync()
                .channel();

        System.out.println(localhost);
        System.out.println("");
    }
}
