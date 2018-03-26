package com.mudy.buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by mudy on 18/3/26.
 * 字符缓冲流
 */
public class BufferedWriterReaderDemo {
    public static void main(String[] args) throws Exception{
        //输出
        FileWriter fileWriter = new FileWriter("desFile/7.txt");
        BufferedWriter out = new BufferedWriter(fileWriter);
        out.write("床前明月光");
        out.newLine();
        out.write("疑是地上霜");
        out.newLine();
        out.write("举头望明月");
        out.newLine();
        out.write("低头思故乡");
        out.close();

        //输入
        FileReader fileReader = new FileReader("desFile/7.txt");
        BufferedReader in = new BufferedReader(fileReader);

//        int len = -1;
//        char[] buffer = new char[1024];
//        while ((len = in.read(buffer)) != -1){
//            String res = new String(buffer,0,len);
//            System.out.println(res);
//        }

//        String res = null;
//        while ((res = in.readLine()) != null){
//            System.out.println(res);
//        }

//        for (String res = in.readLine(); (res = in.readLine()) != null; ) { 这种不可行
//            System.out.println(res);
//        }

        in.close();

    }
}



/**
 for (Iterator it2 = list.iterator(); it2.hasNext() ;) {
 System.out.println(it2.next());
 }
 */
