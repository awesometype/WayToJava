package com.mudy.file;

import java.io.File;

/**
 * Created by mudy on 18/3/23.
 * 文件操作
 */
public class FileDemo3 {
    public static void main(String[] args) {
        File dir = new File("/Users/mudy/IntelliJIDEAProjects/WayToJava");
        listAllFile(dir);
    }

    //列出指定文件夹下的所有文件，包括子文件夹下的文件 递归操作
    private static void listAllFile(File file) {

        for (File file1:file.listFiles()) {

            if (file1.isDirectory()){//如果是目录，继续
                listAllFile(file1);
            }
            System.out.println(file1);
        }
    }

}
