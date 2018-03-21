package com.mudy.VectorDemo;

import java.util.Date;
import java.util.Vector;

/**
 * Created by mudy on 18/3/21.
 */
public class VectorDemo {
    public static void main(String[] args) {
//        testRemove();
        testUpdate();
    }

    /** 对于删除操作，如果我的元素的类型是int类型的，那么怎么保证跟删除对应索引上的元素不是冲突的
     * remove("B");//删除找到的第一个目标，并返回删除的元素
     * remove(index);
     * removeAll(v2);//删除v1中所有的在v2中的元素
     * v1.retainAll(v2) 在v1中仅保留在v2中包含的元素 [B,B]
     */
    private static void  testRemove(){
        Vector v1 = new Vector(5);
//        v1.add(1);
//        v1.add(3);
//        v1.add(5);
//        v1.add(7);
//        v1.remove("3");
////        v1.remove(3);
        v1.add("A");
        v1.add("B");
        v1.add("C");
        v1.add("B");
//        v1.remove("B");//删除找到的第一个目标
        Vector v2 = new Vector(5);
        v2.add("B");
//        v1.removeAll(v2);//删除v1中所有的在v2中的元素
//        System.out.println(v1);//[A, C]

        System.out.println(v1.retainAll(v2));
        System.out.println(v1);
    }

    /**
     *
     */
    private static void testAdd(){
        Vector v = new Vector(5);
        v.addElement("mudy");
//        v.addElement(new Date());
        v.addElement(4);//在java5之前，必须对基本数据类型手动装箱Integer.valueOf(4) 可以修改编译级别

        v.add(2,"huy");//这里不能越界
        System.out.println(v);

        Vector v2 = new Vector(5);
        v2.add(1);
        v2.add(2);
        v2.add(3);
        v2.add(v);//[1, 2, 3, [mudy, 4, huy]]
//        v2.addAll(v);//[1, 2, 3, mudy, 4, huy]
        System.out.println(v2);
    }

    /**修改
     * v1.set(1,"b"); 返回的oldValue表示被替换掉的元素
     */
    private static void testUpdate(){
        Vector v1 = new Vector();
        v1.add("A");
        v1.add("B");
        v1.add("C");
        v1.set(1,"b");
        System.out.println(v1);
    }

}

/** 集合类中存储的对象，存储的是对象的引用，而不是对象本身
 StringBuilder sb = new StringBuilder("ABC");
 v.addElement(sb);
 System.out.println(v);    [ABC]

 sb.append("mudy");
 System.out.println(v);    [ABCmudy]
 */
