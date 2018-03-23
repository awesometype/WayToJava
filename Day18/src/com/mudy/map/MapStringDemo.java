package com.mudy.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mudy on 18/3/22.
 * 统计一个字符串中每个字符出现的次数
 */


public class MapStringDemo {
    public static void main(String[] args) {
        String str = "abcdefgabcdefgabcdefgabcdefgggg";
        char[] arr = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (char c:arr) {
            if (map.containsKey(c)){
                int v = (int)map.get(c) + 1;
                map.put(c,v);
            }else {
                map.put(c,0);

            }

        }
        System.out.println(map);
    }
}
