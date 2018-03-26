package com.mudy.buffer;

import java.io.*;

/**
 * Created by mudy on 18/3/26.
 *
 */
public class BufferedStreamDemo {
    public static void main(String[] args) throws Exception{
        //字节缓冲输出流
        OutputStream out = new FileOutputStream("desFile/7.txt");
        BufferedOutputStream bos = new BufferedOutputStream(out);//包装流
        bos.write("hello".getBytes());
        bos.close();

        //字节缓冲输入流
        BufferedInputStream bin = new BufferedInputStream(new FileInputStream("desFile/7.txt"));
        byte[] buffer = new byte[1024];
        int len = -1;
        while ((len = bin.read())>0){
            System.out.println(bin.read(buffer,0,len));
        }
        bin.close();

    }
}
