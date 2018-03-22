package com.mudy.set;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by mudy on 18/3/22.
 * TreeSet的自然排序
 * 使用的是compareTo方法
 */

class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //重写比较规则
    public int compareTo(Person o) {
        if (age > o.age){
            return 1;
        }else if (age<o.age){
            return -1;
        }else {
            return 0;
        }
    }
}

public class TreeSetDemo2 {
    public static void main(String[] args) {
        Set<Person> set = new TreeSet<>();
        set.add(new Person("mudy1",11));
        set.add(new Person("mudy2",12));
        set.add(new Person("mudy3",13));
        set.add(new Person("mudy4",10));
        System.out.println(set);
    }

}


/**
 * 添加到TreeSet中的对象必须要实现Comparable接口，覆盖其中的compareTo方法
 *
 * 在TreeSet的自然排序中，认为如果两个对象做比较的Compare方法返回的是0，则认为是同一个对象
 */
