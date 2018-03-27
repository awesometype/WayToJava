package com.mudy.method;

//import com.sun.org.apache.xpath.internal.operations.String;
import java.lang.String;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by mudy on 18/3/27.
 * 使用反射调用数组参数（可变参数）
 */

class Person2{
    public static void doWork1(int...arr){
        System.out.println("doWork1被调用,"+Arrays.toString(arr));
    }

    public static void doWork2(String...arr){
        System.out.println("doWork2被调用,"+Arrays.toString(arr));
    }

}

public class MethodCallDemo2 {
    public static void main(String[] args) throws Exception{
        //情况1：数组的元素类型是基本类型
        Class clz = Person2.class;
//        Method method = clz.getMethod("doWork1",int[].class);
//        System.out.println(method);
//        int[] param = new int[]{1,2,3,4,5};
//        method.invoke(null,param);


        //情况2：数组的元素类型是引用类型
        Method method = clz.getMethod("doWork2", String[].class);
        method.invoke(null,new Object[]{new String[]{"A","B","C","D"}});//引用数据类型，需要重新包装，

    }
}

/** 使用反射调用数组参数(可变参数)
 * 调用方法的时候，把实际参数统统作为Object数组的元素即可
 * Method对象.invoke(方法底层所属对象,new Object[]{实际参数})
 *
 * method.invoke(null,new Object[]{new String[]{"A","B","C","D"}});
 * method.invoke(null,new Object[]{"mudy",12});//这样也是可以的
 *
 * 如果使用泛型的话，要提高到最高类型，即Object
 */
