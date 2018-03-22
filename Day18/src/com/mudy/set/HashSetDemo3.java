package com.mudy.set;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by mudy on 18/3/22.
 */
class Student{
    private int sn;
    private String name;
    private int age;

    public Student(int sn, String name, int age) {
        this.sn = sn;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sn=" + sn +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {//如果学号相等，则认为是相同的，这段代码可以自动生成
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return sn == student.sn;
    }

    @Override
    public int hashCode() {
        return sn;
    }
}

public class HashSetDemo3 {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        set.add(new Student(1,"mudy",20));
        set.add(new Student(1,"mudy1",21));
        set.add(new Student(3,"mudy2",22));
        set.add(new Student(4,"mudy3",23));
        System.out.println(set);
    }
}

/**
 * 如果需要把我们自定义的对象存储到哈希表中，该类型的对象应该覆盖equals和hashCode方法
 * 并在该方法中提供自己的规则
 * 可以使用idea自动生成代码
 */
