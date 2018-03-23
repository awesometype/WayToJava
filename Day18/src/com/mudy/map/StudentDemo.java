package com.mudy.map;

import java.util.*;

/**
 * Created by mudy on 18/3/23.
 *
 */
public class StudentDemo {
    public static void main(String[] args) {
        //使用set集合存储一个班级学生的名称
        Set<String> names1 = new HashSet<>();
        names1.add("zhang1");
        names1.add("zhang2");
        names1.add("zhang3");
        names1.add("zhang4");

        Set<String> names2 = new HashSet<>();
        names2.add("li1");
        names2.add("li2");
        names2.add("li3");
        names2.add("li4");

        //使用Map来存储多个班级的学生，表示一个学院
        Map<String,Set<String>> map1 = new HashMap<>();
        map1.put("zhangs1",names1);
        map1.put("lis1",names2);

        Map<String,Set<String>> map2 = new HashMap<>();
        map2.put("zhangs2",names1);
        map2.put("lis2",names2);

        //使用list来存储多个学院

        List<Map<String,Set<String>>> list = new ArrayList<>();
        list.add(map1);
        list.add(map2);
        System.out.println(list);//[{zhangs1=[zhang2, zhang3, zhang1, zhang4], lis1=[li2, li1, li4, li3]}, {zhangs2=[zhang2, zhang3, zhang1, zhang4], lis2=[li2, li1, li4, li3]}]


    }
}
