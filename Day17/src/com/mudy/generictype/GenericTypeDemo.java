package com.mudy.generictype;

import java.util.ArrayList;
import java.util.List;

public class GenericTypeDemo {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList();
        List<Integer> list2 = new ArrayList();
        List<Object> list3 = new ArrayList<>();
        List<Number> list4 = new ArrayList<>();

//        doWork(list1); //String不是继承number的，所以这里会报错
//        doWork(list2);
//        doWork(list3);
//        doWork(list4);
//
//        doWork2(list1);
//        doWork2(list2);
//        doWork2(list3);
//        doWork2(list4);

    }

    //此时的泛型，必须是number类型或者number类的子类  上限
    private static void doWork(List<? extends Number> list){

    }
    //此时的泛型，必须是number类型或者number类的父类  下限
    private static void  doWork2(List<? super Number> list){

    }
}


/**泛型的通配符和上下限
 * 泛型的通配符:不知道使用什么类型来接受的时候，此时可以使用? ?表示未知，通配符
 *
 * 泛型的上限和下限：用来限定元素的类型必须是X类的子类或相同 X的E父类或相同
 * private static void doWork(List<? extends Number> list)
 *
 *
 *
 */