package com.mudy.generictype;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TDemo {
    public static void main(String[] args) {
        List list = new ArrayList(5);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Integer item = (Integer) list.get(2);
        System.out.println(item);


        TreeSet set = new TreeSet();
        set.add(5);
        set.add("mudy");
        System.out.println(set);//在这里会报错
    }


}

/**为什么要使用泛型
 * 1）存储任意类型的数据在集合中，但是取出来的都是Object类型的，此时就得强转
 * 2）约束存储到集合中的元素必须是相同的数据类型
 * 3）设计一个点类，来封装坐标位置，要求坐标位置支持String Integer Double类型
 */


