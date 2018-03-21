package com.mudy.ArrayListDemo;

import java.util.ArrayList;

/**
 * Created by mudy on 18/3/21.
 */
public class ArrayListDemo {
//    ArrayList
}

/** ArrayList类是Java集合框架出现之后用来取代Vector类的
 * 二者底层原理都是基于数组的算法 一摸一样
 * Vector:所有的方法都使用了synchronized修饰符       线程安全，但是性能较低
 * ArrayList:所有的方法都没有使用synchronized修饰符  线程不安全，但是性能较高
 * 即使以后在多线程环境下，我们也不使用Vector，
 * 使用: ArrayList list = Collections.synchronizedList(new ArrayList(...))
 * 常用方法参照Vector类
 *
 *
 *
 *
 *
 */