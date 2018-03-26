package com.mudy.ClassInstance;

import java.util.Date;

/**
 * Created by mudy on 18/3/26.
 * 获取字节码对象：Class对象
 */
public class ClassInstanceDemo {
    //需求，获取java.util.Date类的字节码对象
    public static void main(String[] args) throws Exception{
        //方式一：使用class属性 类名.class; 用的比较少 
        Class<java.util.Date> clazz = java.util.Date.class;

        //方式二：通过对象的getClass()来获取 用的也比较多
        java.util.Date date = new java.util.Date();
        Class<?> clz2 = date.getClass();

        //方式三：通过class类中的静态方法forName(String className); 这种的方式用的最多
        Class<?> clz3  = Class.forName("java.util.Date");


        System.out.println(clazz);
        System.out.println(clz2);
        System.out.println(clz3);

        /** 注意：同一个类在JVM中只有一份字节码对象，上边的三是一样的
         class java.util.Date
         class java.util.Date
         class java.util.Date
         */

    }
}
