package com.mudy.constructor;

import java.lang.reflect.Constructor;

/**
 * Created by mudy on 18/3/26.
 *
 */

class  User{

    public User() {

    }

    public User(String name) {

    }


    private User(String name,int age) {

    }

}


public class GetConstructorDemo {
    public static void main(String[] args) throws Exception{
        Class clazz = User.class;
//        for (Constructor con : clazz.getConstructors()) {//只能获取public修饰的
//            System.out.println(con);
//        }

//        for (Constructor con : clazz.getDeclaredConstructors()) {//获取所有的构造函数
//            System.out.println(con);
//        }

        System.out.println(clazz.getConstructor());//public com.mudy.constructor.User()
        System.out.println(clazz.getConstructor(String.class));//public com.mudy.constructor.User(java.lang.String)
        System.out.println(clazz.getDeclaredConstructor(String.class,int.class));//private com.mudy.constructor.User(java.lang.String,int)

    }
}


