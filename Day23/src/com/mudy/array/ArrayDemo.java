package com.mudy.array;

import java.lang.reflect.Array;

/**
 * Created by mudy on 18/3/27.
 *
 */
public class ArrayDemo {
    public static void main(String[] args) {
        Object arr = new int[]{1,2,3,4,5};

        //获取arr数组中索引为2的元素
        int res = Array.getInt(arr,2);
        System.out.println(res);

        //设置arr数组中所有为2的新元素
        Array.set(arr,2,6);
        System.out.println(Array.get(arr,2));
    }
}

// TODO: 18/3/27 11实现任意类型数组的拷贝操作