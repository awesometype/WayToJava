package com.mudy.set;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by mudy on 18/3/22.
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<Integer> lhs = new LinkedHashSet();//范型不能是基本数据类型
        lhs.add(1);
        lhs.add(1);
        lhs.add(2);
        lhs.add(3);
        lhs.add(4);
        lhs.add(2);
        System.out.println(lhs);//[1, 2, 3, 4]
    }
}


/**
 * list接口：允许元素重复，记录先后添加顺序
 * set接口：不允许元素重复，不记录元素添加的顺序
 * 需求：实现一个list，要求，不允许元素重复，并且记录元素的添加顺序
 *      使用LinkedHashSet
 *      底层采用哈希表和链表算法
 *         哈希表来保证唯一性,此时就是HashSet,在哈希表中元素没有先后顺序
 *         链表来记录添加顺序
 */

/**
 *
 *
 *
 */
