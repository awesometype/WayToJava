package com.mudy.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by mudy on 18/3/22.
 * TreeSet的定制排序
 *
 * 使用的是compare方法
 */

class Person2{
    protected String name;
    protected int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

public class TreeSetDemo3 {
    public static void main(String[] args) {
        Set<Person2> set = new TreeSet<>(new NameLengthComarator());//将比较器在构造方法中传进去
        set.add(new Person2("mudy",12));
        set.add(new Person2("xiaoming",13));
        set.add(new Person2("ha",14));
        set.add(new Person2("woli",15));
        set.add(new Person2("memed",16));
        System.out.println(set);
    }
}

//名字长度比较器
class NameLengthComarator implements Comparator<Person2>{
    @Override
    public int compare(Person2 o1, Person2 o2) {
        if (o1.name.length() > o2.name.length()){
            return 1;
        }else if(o1.name.length() < o2.name.length()){
            return -1;
        }else {//名字的长度相等，则根据年龄来排
            if (o1.age > o2.age){
                return 1;
            }else if (o1.age < o2.age){
                return -1;
            }else {
                return 0;
            }
        }
    }
}

/**
 * TreeSet的定制排序
 */
