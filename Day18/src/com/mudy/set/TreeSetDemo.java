package com.mudy.set;

import java.util.TreeSet;

/**
 * Created by mudy on 18/3/22.
 *
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("B");//必须是同一种类型，因为内部要排序
        set.add("D");
        set.add("E");
        set.add("C");
        set.add("F");
        System.out.println(set.first());
        System.out.println(set.headSet("C"));//[A, B] 严格小于C
        System.out.println(set.tailSet("C"));//[C, D, E, F]
    }
}


/**
 *
 *              set接口
 *                |
 *                |
 *          SortedSet接口
 *           可排序的集合
 *                ｜
 *                ｜
 *          NavigableSet
 *       可导航的集合(做范围查询)
 *                ｜
 *                ｜
 *             TreeSet类
 *              红黑树算法
 *
 */

/**
 * TreeSet集合底层采用红黑树算法，会对存储的元素默认使用自然排序(从小到大)
 * 注意:必须保证TreeSet集合中的元素对象是相同的数据类型，否则报错   就可以使用范型来进行约束,保证了数据的安全
 */

/**TreeSet的排序规则
 *
 * 自然排序:从小到大
 * 要求TreeSet集合中的元素得实现java.lang.Comparable接口
 *
 *
 * java.lang.Comparable接口
 *  覆盖compareTo(Object o)方法，在该方法中编写比较规则
 *
 *
 * 定制排序:
 *
 */
