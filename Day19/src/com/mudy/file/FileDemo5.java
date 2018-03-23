package com.mudy.file;

import java.io.File;

/**
 * Created by mudy on 18/3/23.
 * 批量修改文件名称
 */
public class FileDemo5 {
    public static void main(String[] args) {
        File f = new File("/Users/mudy/IntelliJIDEAProjects/WayToJava/Day19/src/com/mudy/file/myfile");
//        File f = new File("/Users/mudy/Documents/全栈/day03-python\\ 全栈开发-基础篇");
        changeName2(f);
    }



    //修改名称-在文件名之前添加前缀
    private static void changeName1(File f) {
        for (File file:f.listFiles()) {
            String name = file.getName();
            File desFile = new File(file.getParent() + "/"+"东永"+name);
            System.out.println(desFile);
            file.renameTo(desFile);
//            System.out.println(name);
        }
    }

    //修改名称-删除文件名之前的前缀
    private static void changeName2(File f) {
        for (File fileName : f.listFiles()) {
            String nameString = fileName.getName().substring(2);//截取
            File decFile = new File(f+"/"+nameString);
            System.out.println(decFile);
            fileName.renameTo(decFile);
        }
    }


}
