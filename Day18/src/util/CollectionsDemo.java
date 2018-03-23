package util;

import java.util.Collections;
import java.util.List;

/**
 * Created by mudy on 18/3/23.
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        List<Object> list = Collections.emptyList();//空 获取空集对象
    }
}



/** 面试题:Collection和Collections的区别
 * 一个是接口，一个是底层工具类
 *
 * Collection类:
 * shuffle：使用随机源对指定列表进行置换
 */

/** 常用集合类:ArrayList,HahSet,HashMap都是线程不安全的，在多线程环境下不安全
 * 在Collections类中有获取线程安全的集合方法
 * 
 */

// TODO: 18/3/23  List list = Collections.synchronizedList(new ArrayList()); 