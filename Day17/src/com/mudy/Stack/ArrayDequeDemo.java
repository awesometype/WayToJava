package com.mudy.Stack;

import java.util.ArrayDeque;

/**
 * Created by mudy on 18/3/21.
 */
public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque(5);
        ad.push("A");
        ad.push("B");
        ad.push("C");
        ad.push("D");
        ad.push("E");
        ad.push("F");
        ad.push("G");
        System.out.println(ad);
//        System.out.println(ad.poll());
        System.out.println(ad.pop());
        System.out.println(ad);
    }
}
