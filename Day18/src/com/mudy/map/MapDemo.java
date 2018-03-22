package com.mudy.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by mudy on 18/3/22.
 * Map
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();//key是hashset，是不会记录添加顺序的
        map.put("name1","mudy1");
        map.put("name2","mudy2");
        map.put("name3","mudy3");
        map.put("name4","mudy4");

        System.out.println(map);//{name4=mudy4, name3=mudy3, name2=mudy2, name1=mudy1}
        System.out.println(map.containsKey("name1"));//true
        System.out.println(map.containsValue("mudy5"));//false
        System.out.println(map.get("name2"));//mudy2
//        System.out.println(map.entrySet());
        System.out.println(map.size());
//        map.clear();
//        System.out.println(map);//{}

        System.out.println(map.keySet());//获取所有的key

        //获取map中所有的Entry(key-value)
        Set<Map.Entry<String,String>> set = map.entrySet();
        System.out.println(set);
    }
}
