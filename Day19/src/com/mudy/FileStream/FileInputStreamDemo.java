package src.com.mudy.FileStream;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

//演示文件字节输入流
public class FileInputStreamDemo {
    public static void main(String[] args) throws Exception{
        //获取源文件
        File file = new File("stream.txt");
        //创建字节输入流对象
        FileInputStream fileInputStream = new FileInputStream(file);

//       int data = fileInputStream.read();一个一个字节的读取
//        System.out.println(data); 一个一个字节的读取
//        System.out.println(fileInputStream.read());
//        System.out.println(fileInputStream.read());
//        System.out.println(fileInputStream.read());

        byte[] buffer  = new byte[5];//一次最多读10个
//        int count = fileInputStream.read(buffer); //返回读取了几个字节
//        System.out.println(count);
//        System.out.println(Arrays.toString(buffer));


        int len = -1 ; //表示当前读取的字节数，如果是-1表示读完了
        while ((len = fileInputStream.read(buffer)) != -1){
            String string = new String(buffer,0,len);
            System.out.println(string);
//            fileInputStream.read(buffer)
        }

        fileInputStream.close();
    }
}