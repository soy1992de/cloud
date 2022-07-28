package com.NIO;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

import javax.net.ServerSocketFactory;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

@Slf4j
public class server {


    static  int byteLen=10;

    public static void main(String[] args) throws Exception {
        scatteringReads();
    }

    public  static  void start() throws Exception{
        /*File file = new File("student.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(1);
        String path = file.getPath();
        System.out.println(file.getAbsolutePath());*/
        ByteBuffer byteBuffer=ByteBuffer.allocate(byteLen);

        try (FileChannel channel = new FileInputStream("data.txt").getChannel()) {
            while (channel.read(byteBuffer)!=-1){//向buffer 中读数据
                byteBuffer.flip();//切换至读模式
                while (byteBuffer.hasRemaining()){
                    log.debug("读取的字节:{}",(char)byteBuffer.get());
                }
                byteBuffer.clear();//切换至写模式
            }
            
        } catch (IOException e) {
           log.error(e.getMessage());
        }
                
    }

    public static  void buf(){
        ByteBuffer byteBuffer = ByteBuffer.allocate(byteLen);
        byteBuffer.put("hello".getBytes(StandardCharsets.UTF_8));

        ByteBuffer helll0 = StandardCharsets.UTF_8.encode("helll0");

        ByteBuffer wrap = ByteBuffer.wrap("hello".getBytes(StandardCharsets.UTF_8));

        byteBuffer.flip();


    }



    public static  void scatteringReads(){
        ByteBuffer b1 = ByteBuffer.allocate(3);
        ByteBuffer b2 = ByteBuffer.allocate(3);
        ByteBuffer b3 = ByteBuffer.allocate(5);

        try (FileChannel channel = new RandomAccessFile("data2.txt","r").getChannel()) {
            channel.read(new ByteBuffer[]{b1,b2,b3});

            b1.flip();
            b2.flip();
            b3.flip();
            log.debug("sss:{}",StandardCharsets.UTF_8.decode(b1));
            log.debug("sss:{}",StandardCharsets.UTF_8.decode(b2));
            log.debug("sss:{}",StandardCharsets.UTF_8.decode(b3));
        } catch (IOException e) {
        }

    }















}
