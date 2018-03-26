package com.mudy.review;

import java.io.*;

/**
 * Created by mudy on 18/3/26.
 *
 */
public class CopDemo {
    public static void main(String[] args) throws Exception{
        //1、找到源文件夹下的所有的map3文件
        File srcFile = new File("srcFile");
        File desFile = new File("desFile");
        File[] res = srcFile.listFiles(new FileFilter() {//或FilenameFilter
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith("mp3") && pathname.isFile();
            }
        });

        //迭代出每一个文件对象，并拷贝
        for (File file1:res) {
            System.out.println(file1);
            InputStream in = new FileInputStream(file1);
            OutputStream out = new FileOutputStream(new File("desFile",file1.getName()));

            byte[] buffer = new byte[10];
            int len = -1;

            while ((len = in.read(buffer)) > 0){
                out.write(buffer,0,len);
            }


            in.close();
            out.close();
        }

        //改名字
        for (File music:desFile.listFiles()) {
            String string =  music.getName().substring(0,music.getName().length()-4);
            String newNameStr = string + ".txt";
            System.out.println(string);
            File newName = new File(desFile,newNameStr);
            music.renameTo(newName);
            System.out.println(music.getName());
        }
    }

}


/** 文件拷贝案例，拷贝指定目录中指定类型文件到指定目录
 *
 *
 *
 */