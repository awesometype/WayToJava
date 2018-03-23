package com.mudy.file;

import java.io.File;

/**
 * Created by mudy on 18/3/23.
 *
 */
public class FileDemo1 {
    public static void main(String[] args) {

        /** 字段摘要
         * static String pathSeparator;
         * static char pathSeparatorChar
         * static String separator
         * static char separatorChar
         */
        //获取属性分割符
        String pathSeparator = File.pathSeparator;
        char pathSeparatorChar= File.pathSeparatorChar;
        System.out.println(pathSeparator);//:
        System.out.println(pathSeparatorChar);//:

        //获取路径分隔符
        String separator = File.separator;
        char separatorChar= File.separatorChar;
        System.out.println(separator);// /
        System.out.println(separatorChar);// /

        //表示一个文件的路径
        String path = "/Users/mudy/IntelliJIDEAProjects/WayToJava/Day19/Day19-文件相关.iml";

    }
}
