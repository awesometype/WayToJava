package com.mudy.loadResource;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by mudy on 18/3/27.
 * 加载资源文件
 */
public class LoadResource {
    public static void main(String[] args) throws Exception{
        test3();
    }

    //方式3 使用相对路径-相对于当前加载资源文件的字节码路径
    private static void test3() {

    }

    //方式2：使用相对路径加载-相对于classpath的根路径（字节码输出目录）
    private static void test2() throws  Exception{
        Properties p = new Properties();
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream stream = loader.getResourceAsStream("db.properties");
        p.load(stream);
        System.out.println(p);
    }

    //方式一 使用绝对路径的方式加载
    private static void test1() throws Exception{
        Properties p = new Properties();
        InputStream inputStream = new FileInputStream("/Users/mudy/IntelliJIDEAProjects/WayToJava/Day23/resource/db.properties");
        p.load(inputStream);
        System.out.println(p);//{password=admin, name=root}
    }
}
