package com.mudy.file;

import java.io.File;
import java.util.Date;

/**
 * Created by mudy on 18/3/23.
 *
 */
public class FileDemo2 {
    public static void main(String[] args) {
        test2();
    }
    /**操作File路径和名称
     * File f.getAbsoluteFile() 获取绝对路径
     * String f.getAbsolutePath() 获取绝对路径
     * String f.getPath() 获取文件路径
     * String f.getName() 获取文件名称
     * File f.getParentFile() 获取上级目录文件
     * String f.getParent() 获取上级目录路径
     */

    private static void test1() {
        File f = new File("/Users/mudy/IntelliJIDEAProjects/WayToJava/Day19/src/com/mudy/file/mudy.txt");
        File absoluteFile =  f.getAbsoluteFile();
        String absolutePath =f.getAbsolutePath();
        String path = f.getPath();
        String name= f.getName();
        String parent = f.getParent();
        File parentFile =f.getParentFile();

        System.out.println(absoluteFile);
        System.out.println(absolutePath);
        System.out.println(path);
        System.out.println(name);
        System.out.println(parent);
        System.out.println(parentFile);
        /**
         /Users/mudy/IntelliJIDEAProjects/WayToJava/Day19/src/com/mudy/file/mudy.txt
         /Users/mudy/IntelliJIDEAProjects/WayToJava/Day19/src/com/mudy/file/mudy.txt
         /Users/mudy/IntelliJIDEAProjects/WayToJava/Day19/src/com/mudy/file/mudy.txt
         mudy.txt
         /Users/mudy/IntelliJIDEAProjects/WayToJava/Day19/src/com/mudy/file
         /Users/mudy/IntelliJIDEAProjects/WayToJava/Day19/src/com/mudy/file
         */
    }


    /** 检测File状态的方法
     * boolean f.canExecute(); 是否是可执行文件
     * boolean canRead()是否可读
     * boolean canWrite()是否可写
     * boolean isHidden()是否是隐藏文件
     * long lastModified()该文件的最后修改时间
     * long length()获取该文件爱你的长度大小(单位是字节)
     */
    private static void test2() {
        File f = new File("/Users/mudy/IntelliJIDEAProjects/WayToJava/Day19/src/com/mudy/file/mudy.txt");
        System.out.println(f.canExecute());
        System.out.println(f.canWrite());
        System.out.println(new Date(f.lastModified()).toString());
        System.out.println(new Date(f.lastModified()).toLocaleString());
    }
}
