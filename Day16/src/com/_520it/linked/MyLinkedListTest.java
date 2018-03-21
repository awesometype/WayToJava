package com._520it.linked;

import java.util.LinkedList;

/**
 * Created by mudy on 18/3/21.
 */
public class MyLinkedListTest {
    public static void main(String[] args) {

//        LinkedList
        MyLinkedList link = new MyLinkedList();
        link.addLast(1);
        link.addLast(3);
        link.addLast(5);
        link.addLast(7);
        link.addLast(9);
        link.addLast(11);
        link.removeEle(1);
        link.change(11,99);
        System.out.println(link.search(3));
        System.out.println(link);

//        try {
//            throw
//        }catch (){
//
//        }
    }
}
/**对LinkdLisr操作的性能分析

 * 1):增加操作:双向链表乐意直接获取自己的第一个和最后一个节点
 * 如果新增的元素在第一个或者最后一个位置，那么操作只有一次

 * 2):删除操作
 * 如果删除第一个元素，操作一次
 * 如果删除最后一个元素，也是操作一次
 * 如果删除中间的元素：
 *      找到元素节点平均操作:(1+N)/2次
 *      找到节点之后做删除操作1次

 * 3):查询操作
 *      平均：(N+1)/2次
 *
 * 4:修改操作
 *      平均：(N+1)/2 次 ＋ 1次
 */

/** 基于数组的列表和基于链表的列表的性能对比:
 * ArrayList：查询，更改较快，新增和删除比较慢。
 *
 *  LinkedList：查询，更改较慢，新增和删除较快。
 */

