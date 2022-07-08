package com.lanou.day10.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("one","hello");
        map.put("two","world");
        map.put("three","java");
        map.put("four","lanou");
        System.out.println(map);

        //遍历方式一: 找到所有的key 通过遍历key,找到所有的value
        Set<String> keySet = map.keySet();
        for (String key:keySet){
            String value = map.get(key);
            System.out.println(key+"----"+value);
        }

        //方式二：找到所有的键值对对象，遍历键值对对象，从键值对对象里获取Key和Value
        Set<Map.Entry<String,String>> entries = map.entrySet();
        for (Map.Entry<String,String>entry:entries){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key:"+key+"===== value:"+value);
        }

        //方法三  ： 获取所有的key,获取所有的value
        Set<String> keys = map.keySet();
        for (String key: keys){
            System.out.println(key);
        }
        Collection<String> values = map.values();
        for (String value :values){
            System.out.println(value);
        }
    }
}
