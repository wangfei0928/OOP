package com.lanou.day10.map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {

        //HashMap底层实现是哈希表
        //构造一个空的HashMap 默认初始值是16，默认负载因子是0.75
        Map<String, Integer> map = new HashMap<>();
        System.out.println(map);
        map.put("one",1000);
        map.put("two",2000);
        map.put("three",3000);
        map.put("four",4000);
        map.put("five",5000);
        System.out.println(map);

        map.put("one",100);
        System.out.println(map);

        Map<String,Integer>map1 = new HashMap<>(map);
        System.out.println(map1);

        Map<String,Integer>map2 = new HashMap<>();
        map2.put("one",10086);
        map2.put("five",500);
        map2.put("six",666);
        System.out.println(map2);
        map2.putAll(map1);
        System.out.println(map2);

        Integer v = map2.remove("five");  //remove删除键值对，只需要写对String就可以
        System.out.println(map2);

        Integer value = map.get("two");
        System.out.println(value);

        Integer value2 = map.get("eight");  //不存在返回null
        System.out.println(value2);

        Integer value3 = map.getOrDefault("eight",222);  //不存在返回 默认值
        System.out.println(value3);

        System.out.println(map2.containsKey("nine"));
        System.out.println(map2.containsValue(100));
    }
}
