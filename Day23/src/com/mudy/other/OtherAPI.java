package com.mudy.other;

import java.lang.reflect.Modifier;

/**
 * Created by mudy on 18/3/27.
 *
 */



abstract public class OtherAPI {
    public static void main(String[] args) {
        Class claz = OtherAPI.class;
        System.out.println(claz.getModifiers());
        String str =  Modifier.toString(1025);
        System.out.println(str);

        //类的名称
        System.out.println(OtherAPI.class.getName());//com.mudy.other.OtherAPI
        System.out.println(OtherAPI.class.getSimpleName());//OtherAPI
        System.out.println(OtherAPI.class.getPackage());//package com.mudy.other
    }
}


/** 操作反射其他的API
 * Class类中的：
 * int getModifiers():获得修饰符
 * String fetName():返回类的全限定名
 * Package getPackage():获得该类的包
 * String getSimpleName():获得类的简单名字
 *
 * Class getSuperClass() 获得类的父类
 * boolean isArray() 判断该Class实例是否是数组
 * boolean isEnum() 判断该Class实例是否是枚举
 *
 */