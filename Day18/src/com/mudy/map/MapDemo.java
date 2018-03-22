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

/** Map的常用实现类
 * HashMap:采用哈希表算法，此时Map中的key不会保证添加的先后顺序，key也不允许重复
 *          key判断重复的标准是:key1和key2是否equals为true并且hashCode相等
 *
 *TreeMap:采用红黑树算法，此时的Map中的key会按照自然顺序或者定制排序进行排序，key也不允许重复
 *          key判断重复的标准是:compareTo/compare的返回值是否为0
 *
 * LinkedHashMap:采用的是链表和哈希表算法，此时Map中的key会保证先后添加的顺序，key不允许重复
 *          key判断重复的标准和HashMap中的key的标准相同
 *
 *
 * Hashtable 采用哈希表算法，是HashMap的前身(类似于Vector是ArrayList的前身)
 * 在集合框架之前，表示映射关系就使用Hashtable
 *
 *  Propertries：Hashtable的子类，此时要求key和value都是String类型
 *
 *
 */
