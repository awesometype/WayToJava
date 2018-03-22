package com.mudy.set;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by mudy on 18/3/22.
 * 演示hashset
 */
public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set =  new HashSet<>();
        set.add("X");
        set.add("a");
        set.add("f");
        set.add("e");
        set.add("c");
        System.out.println(set);//跟添加的顺序没有关系

        Set<String> set2 = new HashSet<>();
        set2.add("1");
        set2.add("2");
        set.addAll(set2);
        System.out.println(set);

    }
}

/** Set是Collection子接口，模拟了数学上的集合的概念
 * set集合存储特点:
 * 1):不允许元素重复
 * 2):不会记录元素的先后添加顺序
 *
 * set只包含了Collection继承的方法，不过set无法记住添加的顺序，不允许包含重复的元素
 * 当试图添加两个相同的元素的时候，添加操作失败，add()方法返回false
 * set判断两个对象是否相等用equals，而不是使用==。
 */


/**
 * HashSet是set接口最常用的实现类，底层采用了哈希表(散列表)算法
 *
 * 其底层其实也是一个数组，存在的意义是提高查询速度 插入速度也比较快，适用于少量数据的插入操作
 */

/** 在HashSet中如果判断两个对象是否相同问题
 * 1):两个对象的equals比较相等 返回true则说明是相同对象
 * 2):两个对象的hashCode方法返回值相等
 * 对象的hashCode值，决定了在哈希表中的存储位置
 * 二者缺一不可
 * 当往HashSet集合中添加新的对象的时候，先会判断该对象和集合中对象的hashCode值
 *          1):不等:直接把该新的对象存储发哦hashCode指定的位置
 *          2):相等:在继续判断新对象和集合对象中的equals
 *              1):true  则视为同一个对象，则不保存在哈希表中
 *              2):false 这种的非常麻烦，，存储在之前对象同槽位的链表上(拒绝)
 * 存储在哈希表中的对象，都应该覆盖equals方法和hashCode方法，并且保证equals相等的时候，hashCode也应该相等。
 */

/**
 * 底层是map
 * 相同算法的set底层用的是相同算法的map
 * 把set的集合对象作为map的key，再使用一个Object常量作为value
 *
 */
