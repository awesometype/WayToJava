package src.com.mudy.FileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @Author : mudy
 * @Date : Created in 21:51 2018/3/25
 * 文件拷贝
 */
public class SreamCopyDemo {
    public static void main(String[] args) throws Exception{
        //先读
        File file = new File("stream.txt");

        FileInputStream fileInputStream = new FileInputStream(file);

        byte[] buffer = new byte[10];

        int len = fileInputStream.read(buffer);

//        String desFile = "stream1.txt";
        File file1 = new File("stream1.txt");

        FileOutputStream fileOutputStream = new FileOutputStream(file1,true);

        while ((len = fileInputStream.read(buffer)) != -1 ){
//            String string = new String(buffer,0,len);
            fileOutputStream.write(buffer);
            System.out.println(buffer);
        }

        fileInputStream.close();
        fileOutputStream.close();
        //一边读一边写
    }
}
