package com.mudy.map;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by mudy on 18/3/22.
 * 一般用来加载资源文件 用的比较多
 */
public class PropertriesDemo {
    public static void main(String[] args) throws IOException{
        //是Mao的实现类，是Hashtable的子类
        Properties p = new Properties();
        p.setProperty("username","admin");
        p.setProperty("passwd","root");
        System.out.println(p);

        //根据key获取value值 源码中已经强转了
        //当该key不存在的时候，可以设置返回的默认值
        String username = p.getProperty("username","mudy");
        //加载资源文件（IO）
        InputStream inputStream = null;
        p.load(inputStream);
        System.out.println(username);
    }
}


/** Map类的性能分析
 *  HashMap TreeMap 以及LinkedHashMap都是线程不安全的
 *  解决方法:Mao m = Collections.synchronizedMap(Map对象);
 * Hashtable类是线程安全的，但是性能较低  不用
 */

/**
 *哈希表算法：做等值查询最快
 *树结构算法:做范围查询最快,应用到索引上
 */

