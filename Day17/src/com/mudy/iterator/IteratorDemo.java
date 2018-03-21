package com.mudy.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by mudy on 18/3/21.
 */
public class IteratorDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        //方式1:for循环
//        for (int i = 0; i < list.size(); i++) {
//            Object ele = list.get(i);
//            System.out.println(ele);
//        }

        //方式2:增强for循环
//        for (Object item:list) {
//            System.out.println(item);
//        }

        //方式3:使用迭代器Iterator 1.2才出现的
        /**Iterator对象.next（）
         * 1):获取指针下的一个元素
         * 2):把指针向下移动一栏
         */
//        Iterator it = list.iterator();//返回一个迭代器对象
//        while (it.hasNext()){
////            System.out.println(it.next());
//        }

        //比较建议使用的
        //方式4:使用for循环来操作迭代器 Iterator 一种装逼的方式 比while的性能要高一点，
        for (Iterator it2 = list.iterator(); it2.hasNext() ;) {
            System.out.println(it2.next());
        }

        /**
         * ListIterator 不怎么使用的
         */

        //方式5 比较古老的enumeration



    }
}

/** 集合的迭代操作
 * 把集合中的元素一个一个的取出来
 *
 */

/**迭代器对象
 * Iterator：迭代器对象，只能从上往下迭代
 *  hasNext(): 判断当前指针是否有下一个元素
 *  next() 获取指针下的一个元素，并且移动指针
 *
 *  ListIterator 是Iterator接口的子接口，支持双向迭代
 *
 *  Enumeration：古老的迭代对象,现在已经被Iterator取代了,适用于veator
 */
