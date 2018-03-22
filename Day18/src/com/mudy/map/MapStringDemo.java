package com.mudy.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mudy on 18/3/22.
 */


public class MapStringDemo {
    public static void main(String[] args) {
        String str = "abcdefgabcdefgabcdefgabcdefgggg";
        char[] arr = str.toCharArray();
        Map map = new HashMap();
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
