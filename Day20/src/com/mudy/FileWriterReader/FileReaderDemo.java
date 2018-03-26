package com.mudy.FileWriterReader;

import java.io.File;
import java.io.FileReader;

/**
 * Created by mudy on 18/3/26.
 * 字符文件输入流
 */
public class FileReaderDemo {
    public static void main(String[] args) throws Exception{
        File file = new File("desFile/4.txt");
        FileReader reader = new FileReader(file);

        char[] buffer = new char[1024];
        int len = -1;
        while ((len = reader.read(buffer))>0){
            String str = new String(buffer,0,len);
            System.out.println(str);
        }
        reader.close();
    }
}
