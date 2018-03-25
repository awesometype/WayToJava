package src.com.mudy.file;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by mudy on 18/3/23.
 * 文件流 程序和文件打交道
 */
public class FileDemo7 {
    public static void main(String[] args) {
        //获取系统的所有属性
        Properties property = System.getProperties();
//        System.out.println(property.entrySet());

        Set<Map.Entry<Object,Object>> entrySet = property.entrySet();

        for (Map.Entry<Object,Object>  entry : entrySet) {
            System.out.println(entry);
        }

    }
}

