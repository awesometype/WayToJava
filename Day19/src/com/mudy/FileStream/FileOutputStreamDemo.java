package src.com.mudy.FileStream;

import java.io.FileOutputStream;
import java.io.OutputStream;

//文件字节输出流
public class FileOutputStreamDemo {
    public static void main(String[] args) throws Exception{
        //1、创建目标对象(表示把数据保存在哪一个文件)
        String targrtFile = "stream.txt";
        //2、创建水管 文件字节输出流对象 append表示是追加还是覆盖
        OutputStream outputStream = new FileOutputStream(targrtFile,false);//FileOutputStream用于写入诸如图像数据之类的原始字节的流。要写入字符流，请考虑使用FileWriter
        //3、具体的输出操作(往外写操作)
        outputStream.write(65);//A
        outputStream.write("BCDE".getBytes());
        outputStream.write("EFGHI".getBytes(),1,3);
        //4、关闭资源对象(水管)
        outputStream.close();


    }
}

/** IO流的分类和操作模板
 *  IO流的分类:不同的角度的分类方式是不同的
 *  1)根据流向划分为输入流、输出流
 *  2)根据数据的单位划分:字节流和字符流 (一个一个字节的流 一个一个字符的流)
 *  3)根据节点的划分，节点流和包装流
 *
 * 四大基流(字节输出流、字节输入流、字符输出流、字符输入流)
 * 四大基流都是抽象类:其他流都是基于这四大基流的
 * 我们不能创建四大基流的对象，只能创建其子类对象
 * 无论是什么流，都有close方法，用来关闭资源
 * 如果操作文件，就得开通一个流对象关联我们的磁盘文件，如果不关闭资源，那么磁盘的文件一直被程序所引用
 *
 */


/** 操作IO流的模板
 * 1) 创建源或者目标对象(挖井)
 * 拿文件流举例:
 * 输入操作:把文件中的数据流向到程序中，此时文件是源，程序是目标
 * 输出操作:把程序中的数据流向到文件中，此时文件是目标，程序是源
 *
 * 2)创建IO对象(水管)
 * 输入操作:创建输入流对象
 * 输出操作:创建输出流对象
 *
 *
 * 3)具体的IO操作
 * 输入操作:输入流对象的read方法
 * 输出操作:输出流对象的write方法
 *
 * 4) 关闭资源(释放资源)
 *
 *
 *
 * 操作IO流的六字箴言:读进来，写出去
 * 读进来: 进来强调输入，读，说明是read方法
 * 写出去: 出去强调输出，写，说明是write方法
 *
 */
