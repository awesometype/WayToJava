package com.mudy.buffer;

import java.io.*;

/**
 * Created by mudy on 18/3/26.
 * 节点流和缓冲流对比
 */
public class NodeStreamVSBufferedStramDemo {
    public static void main(String[] args) throws Exception{
        File srcFile = new File("srcFile/数据结构高一凡.pdf");
        File desFile = new File("desFile/数据结构高一凡.pdf");
        test4(srcFile,desFile);
    }

    //使用节点流，一个字节一个字节的读写
    private static void test1(File srcFile, File desFile) throws Exception{
        long begain = System.currentTimeMillis();

        FileInputStream in = new FileInputStream(srcFile);
        FileOutputStream out = new FileOutputStream(desFile,true);

        int len = -1;
        while ((len = in.read())!=-1){
            out.write(len);
        }

        long end = System.currentTimeMillis();
        System.out.println(end - begain);//14541
        in.close();
        out.close();

    }

    //使用缓冲流 一个字节一个字节的读写
    private static void test2(File srcFile, File desFile) throws Exception{
        long begain = System.currentTimeMillis();

        FileInputStream fileInputStream = new FileInputStream(srcFile);
        FileOutputStream fileOutputStream = new FileOutputStream(desFile);

        BufferedInputStream in = new BufferedInputStream(fileInputStream);
        BufferedOutputStream out = new BufferedOutputStream(fileOutputStream);
        int len = -1;
        while ((len = in.read())!=-1){
            out.write(len);
        }

        in.close();
        out.close();
        long end = System.currentTimeMillis();
        System.out.println(end - begain);//506
    }


    //使用节点流，一个字节一个字节的读写 缓冲区1024
    private static void test3(File srcFile, File desFile) throws Exception{
        long begain = System.currentTimeMillis();

        FileInputStream in = new FileInputStream(srcFile);
        FileOutputStream out = new FileOutputStream(desFile,true);

        int len = -1;
        byte[] buffer = new byte[1024];
        while ((len = in.read(buffer))!=-1){
            out.write(buffer);
        }

        long end = System.currentTimeMillis();
        System.out.println(end - begain);//35
        in.close();
        out.close();

    }

    //使用缓冲流 一个字节一个字节的读写 1024的buffer
    private static void test4(File srcFile, File desFile) throws Exception{
        long begain = System.currentTimeMillis();

        FileInputStream fileInputStream = new FileInputStream(srcFile);
        FileOutputStream fileOutputStream = new FileOutputStream(desFile);

        BufferedInputStream in = new BufferedInputStream(fileInputStream);
        BufferedOutputStream out = new BufferedOutputStream(fileOutputStream);
        int len = -1;
        byte[] buffer = new byte[1024];
        while ((len = in.read(buffer))!=-1){
            out.write(buffer);
        }

        in.close();
        out.close();
        long end = System.currentTimeMillis();
        System.out.println(end - begain);//18
    }

}
