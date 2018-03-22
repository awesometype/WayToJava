package com.mudy.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by mudy on 18/3/22.
 */
public class ForeachDemo {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//
//        for (int i :arr) {
//            System.out.println(i);
//        }

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        Iterator it = list.iterator();
        while (it.hasNext()){
            Object ele = it.next();
            if (ele.equals("B")){
                it.remove();//注意这里不能使用list.remove(); 使用it.remove()表示迭代到哪一个就删除那一个
            }
        }
        System.out.println(list.toString());//[A, C, D, E]
//        for (String item:list) {
//            System.out.println(item);
//        }
    }
}


/** 深入分析for-each和迭代器
 * 1):foreach可以操作数组：底层依然采用for循环+索引来获取数组元素
 * 2):foreach可以操作Iterable的实例 底层其实采用的是迭代器
 public static void main(String[] args) {
 List<String> list = new ArrayList();
 list.add("A");
 list.add("B");
 list.add("C");
 list.add("D");
 list.add("E");
 Iterator var2 = list.iterator();

 while(var2.hasNext()) {
 String item = (String)var2.next();
 System.out.println(item);
 }

 }
 *
 */

/** 当需要边迭代集合元素，边删除指定的元素时，此时只能使用迭代器
 * 并发修改异常 ConcurrentModificationException
 *
 * 当使用迭代器的时候，在当前线程A中，会单独创建一个新的线程B
 * B线程每次都会 检查两个线程中元素的数量，如果不等则报 并发修改异常 ConcurrentModificationException
 *
 */

/** 如何避免并发修改异常呢，
 * 不要使用集合对象的删除方法
 * 在Collection接口中存在删除指定元素的方法，remove（）
 * 该方法只能从集合中删除元素，不能把迭代器中的指定元素也删除
 * 王道在于，使用Iterator中的remove方法，该方法会从两个线程中同时移除被删除的元素，保证两个线程的同步
 * foreach拿不到迭代器对象，所以不能使用foreach
 *
 */
