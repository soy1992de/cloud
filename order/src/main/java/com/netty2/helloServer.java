package com.netty2;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.nio.charset.Charset;

public class helloServer {

    public static void main(String[] args) {
        start(8080);
    }

    public  static  void  start(int port){

        NioEventLoopGroup work =new NioEventLoopGroup();
        new ServerBootstrap().group(work)
                             .channel(NioServerSocketChannel.class)
                             .childHandler(new ChannelInitializer<NioSocketChannel>() {
                                 @Override
                                 protected void initChannel(NioSocketChannel ch) throws Exception {
                                     ch.pipeline().addLast(new ChannelInboundHandlerAdapter(){
                                         @Override
                                         public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
                                             ByteBuf msg1 = (ByteBuf) msg;
                                             System.out.println(msg1.toString(Charset.forName("UTF-8")));
                                         }
                                     });
                                 }
                             }).bind(port);
    }
}
