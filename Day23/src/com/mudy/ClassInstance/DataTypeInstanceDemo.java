package com.mudy.ClassInstance;

/**
 * Created by mudy on 18/3/26.
 * 8大基本数据类型的实例
 */
public class DataTypeInstanceDemo {
    public static void main(String[] args) {
        /*
        Class intClass = int.class;
        Class boolClass = boolean.class;
        Class voidClass = void.class;
        System.out.println(intClass);//int
        System.out.println(boolClass);//boolean
        System.out.println(voidClass);//void
        System.out.println(Integer.TYPE);//int
        */

        //数组是引用数据类型，数组其实是对象
        int[] arr1 = {1,2,3};
        System.out.println(arr1.getClass());//class [I



    }
}


//integer和int是不同的数据类型

//在8大基本数据类型的包装类中，都有一个常量：TYP，用于返回该包装类对应基本类的字节码对象

//注意：所有的具有相同维数和相同元素数据类型的数组共享同一份字节码，和元素没有关系，比较的是类型

//Class:描述所有的类型，所以class类中应该具有所有类型的相同的方法

//Object:描述所有的对象，所有在object类中应该具有所有对象的共同方法