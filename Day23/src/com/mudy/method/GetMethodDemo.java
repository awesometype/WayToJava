package com.mudy.method;

import java.lang.reflect.Method;

/**
 * Created by mudy on 18/3/27.
 * 使用反射获取类中的方法
 */

class User{
    public void doWork(){

    }

    public static void doWork(String name){

    }

    private String doWork(String name,int age){
        return name;
    }
}


public class GetMethodDemo {
    public static void main(String[] args) throws Exception{
//        getAll();

        getOne();//获取指定的方法
    }

    private static void getOne() throws Exception{
        //需求，获取doWork()
        Class<?>  claz = User.class;
//        Method mt =  claz.getMethod("doWork",String.class); //参数分别表示函数名和参数字节码类型
        Method mt = claz.getDeclaredMethod("doWork",String.class,int.class);//private java.lang.String com.mudy.method.User.doWork(java.lang.String,int)
        System.out.println(mt);

    }

    private static void getAll(){
        Class<?> claz = User.class;
//        Method[] res =  claz.getMethods();
        Method[] res = claz.getDeclaredMethods();
        System.out.println(res.length);
        for(Method mt : res){
            System.out.println(mt);
        }
    }
}

/**
 * claz.getMethods(); 获取包括自身 和 继承过来的所有的public方法
 *
 * claz.getDeclaredMethods();获取自身类中的所有的方法（不包括继承的，和访问权限无关）
 */
