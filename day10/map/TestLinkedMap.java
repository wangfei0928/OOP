package com.lanou.day10.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestLinkedMap {

    public static void main(String[] args) {
        //LinkedHashMap继承HashMap
        Map<String,String> map = new LinkedHashMap<>();
        map.put("one","张三");
        map.put("aa","王五");
        map.put("bb","李四");
        map.put("c","赵六");
        System.out.println(map);
        System.out.println(map.get("aa"));

        Map<String,String> map2 = new TreeMap<>();
        map.put("one","张三");
        map.put("aa","王五");
        map.put("bb","李四");
        map.put("c","赵六");
        System.out.println(map);
        System.out.println(map.get("aa"));

        //如果想让键值对降序排列
        //比较器排序
        Map<String,String> map3 = new TreeMap<>();
        map.put("one","张三");
        map.put("aa","王五");
        map.put("bb","李四");
        map.put("c","赵六");
        System.out.println(map);
        System.out.println(map.get("aa"));




    }
}
