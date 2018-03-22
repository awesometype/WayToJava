package com.mudy.generictype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mudy on 18/3/22.
 */
public class GenericTypeDemo2 {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList();
        list1.add("ABB");
//        list1.add(2);

        List list2 = new ArrayList();
        list2 = list1;//此时范型被擦除
        list2.add(2);//这里就可以添加整数了
        System.out.println(list2);
    }
}

/** 范型的擦除和转换
 * 范型的擦除:
 * 1):范型编译之后就消失了(范型自动擦除)
 * 2):当把带有范型的集合赋给不带范型的集合，此时范型被擦除(手动擦除)
 */

/** 堆污染
 * 当一个方法既使用范型也使用可变参数，此时容易导致堆污染问题
 * 如 在Array类中的asList方法同时存在范型和可变参数
 * java7之后，@SafeVarargs 抑制堆污染
 */
