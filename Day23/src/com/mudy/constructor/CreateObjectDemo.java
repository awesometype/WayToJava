package com.mudy.constructor;

import java.lang.reflect.Constructor;

/**
 * Created by mudy on 18/3/27.
 * 使用反射调用构造器---创建对象
 */
class  Person{

    public Person() {
        System.out.println("无参构造器");

    }

    public Person(String name) {
        System.out.println("构造器"+name);
    }


    private Person(String name,int age) {
        System.out.println("构造器"+name+"age="+age);
    }

}

public class CreateObjectDemo {
    public static void main(String[] args) throws Exception{
        Class<Person> claz = Person.class;//获取类的字节码

//        Constructor con = claz.getConstructor();//获取构造器
//        con.newInstance();//创建实例 无参构造器


//        Constructor con = claz.getConstructor(String.class);//获取构造器
//        con.newInstance("mudy");//创建实例  构造器mudy


        Constructor con = claz.getDeclaredConstructor(String.class,int.class);
        con.setAccessible(true);//设置当前构造器可以被访问 否则会报错 IllegalAccessException
        con.newInstance("mudy",12);//不能访问person的使用private修饰的构造器
    }
}

/** 构造器最大的作用就是创建对象
 * 为什么 使用反射创建对象，而不直接来new呢？
 * 在框架中，提供给我们的都是字符串
 *
 * 使用反射创建对象的步骤
 * 1：找到构造器所在类的字节码对象
 * 2：获取构造器对象
 * 3：使用反射创建对象
 *
 *
 */


/**
 * 如果一个类中的构造器是外界可以直接访问，同时没有参数，那么可以直接使用class类中的newInsance方法创建对象
 */
