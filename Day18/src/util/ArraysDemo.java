package util;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mudy on 18/3/23.
 */
public class ArraysDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A","B","C","D","E");
        /** 通过Arrays.asList方法得到的List对象的长度是固定的，不能增，也不能减
         * 原因是因为:asList方法返回的ArrayList对象，不是java.util.ArrayList而是Array类中的内部类对象
         *
         */
        System.out.println(list);

//        List<Integer> list1 = Arrays.asList(1，2，3，4，5);
//
//        int[] arr = {1,2,3,4};
//        List<int[]> list2 = Arrays.asList(arr);//会出错 这里直接将数组当作了一个对象
    }

}

// TODO: 18/3/23  数组与集合的区别

/** 数组与集合对象的区别
 *
 *
 *
 */


