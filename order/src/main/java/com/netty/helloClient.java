package com.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.string.StringEncoder;

import java.net.InetAddress;
import java.net.InetSocketAddress;

public class helloClient {

    static InetSocketAddress address=new InetSocketAddress("localhost",8080);

    public static void main(String[] args)  {

        clientStart(address);

    }

    public static void clientStart(InetSocketAddress address){
        try {
            new Bootstrap().group(new NioEventLoopGroup())
                    .channel(NioSocketChannel.class)
                    .handler(new ChannelInitializer<NioSocketChannel>() {
                        @Override
                        protected void initChannel(NioSocketChannel ch) throws Exception {
                            ch.pipeline().addLast(new StringEncoder());
                        }
                    })
                    .connect(address)
                    .sync()
                    .channel()
                    .writeAndFlush("hello world!");
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
