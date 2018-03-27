package com.mudy.method;

import java.lang.reflect.Method;

/**
 * Created by mudy on 18/3/27.
 * 使用反射调用方法
 */

class Person{
    public void doWork(){
        System.out.println("无参函数");
    }

    public static void doWork(String name){
        System.out.println("Person.doWork");
        System.out.println("name = [" + name + "]");
    }

    private String doWork(String name,int age){
        System.out.println("name = [" + name + "], age = [" + age + "]");
        return name;
    }
}

public class MethodCallDemo {
    public static void main(String[] args) throws Exception{
        //1
        Class claz = Person.class;
        //2
        Method mt =  claz.getMethod("doWork",String.class);
//        //3 使用反射调用方法
        mt.invoke(null,"mudya"); //调用静态方法的时候，将第一个参数设置为null就行 ，静态方法根本就不需要对象，所以传啥都行


//        Method mt = claz.getDeclaredMethod("doWork",String.class,int.class);
//        mt.setAccessible(true);
//        Object res = mt.invoke(claz.newInstance(),"mudy",12);//mudy
//        System.out.println(res);
//
//
//        Object obj = new java.util.Date();
//        Method method = obj.getClass().getMethod("toLocaleString");
//        Object localStr = method.invoke(obj);
//        System.out.println(localStr);
    }
}


/** 如何使用反射调用方法
 * 1：获取方法所在类的字节码对象
 * 2：获取方法对象
 * 3：使用反射调用方法
 *
 *
 *
 */

/** 在Method类中有方法
 * public Object invoke(Object obj,Object... args):表示调用当前Method所表示的方法
 * 参数：obj表示被调用方法底层所属对象 args：表示调用方法是传递的实际参数
 *
 *
 *
 */
