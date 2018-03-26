package com.mudy.FileWriterReader;

import java.io.File;
import java.io.FileWriter;

/**
 * Created by mudy on 18/3/26.
 * 字符文件输出流
 */
public class FileWriterDemo {
    public static void main(String[] args) throws Exception{
        //1:创建目标
        File file = new File("desFile/7.txt");//如果文件不存在，则会创建，如果目录不存在，则会报错
        //2:创建字符输出流对象
        FileWriter writer = new FileWriter(file);
        //3:写出操作
//        writer.write("好好好学习，天天香山");
        writer.write("ABCDefg",3,2);
        //4:关闭流
//        writer.close(); //如果不关闭 也不flush的话，那么并不会保存，
//        writer.flush(); 刷新字符流  如果不关闭，调用flush的话，也可以保存


    }
}


/** flush(刷新)操作，输出流中都有flush方法
 * 计算机访问外部设备(磁盘文件)要比直接访问内存慢很多，如果每次write都要直接写出到磁盘文件中，
 * CPU会花更多的时候，此时我们可以准备一个内存缓冲区，程序每次write方法都是直接写到内存缓冲区中
 * 当内存缓冲区满后，系统才把缓冲区内容一次性的写出给磁盘
 *
 * 使用缓冲区的好处:
 *  1:提高CPU使用率
 *  2:有机会回滚写入的数据
 *
 * 对于字节流，flush不是都有作用(部分字节流才会有作用)，对于字符流都起作用
 *   如果我们调用close方法，系统在关闭资源前，会先调用flush方法
 *
 * 操作西统使用-1表示磁盘文件的结尾标记
 * 缓冲区大小一般是使用容量的整数倍，可以提高io性能。
 *
 */


