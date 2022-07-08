package com.lanou.day10.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestPerson {

    public static void main(String[] args) {
        Person p1 = new Person("张三",17);
        Person p2 = new Person("李四",19);
        Person p3 = new Person("王五",28);
        Person p4 = new Person("赵六",29);
        Person p5 = new Person("田七",40);
        Map<String,Person> map = new HashMap<>();
        map.put("zs",p1);
        map.put("ls",p2);
        map.put("ww",p3);
        map.put("zl",p4);
        System.out.println(map);
        map.put("zl",p5);
        System.out.println(map);

        for (String key:map.keySet()){
            System.out.println(map.get(key));
        }

        List<Person> list1 = new ArrayList<>();
        list1.add(p1);
        list1.add(p4);

        List<Person> list2 = new ArrayList<>();
        list2.add(p2);

        List<Person> list3 = new ArrayList<>();
        list3.add(p3);

        Map<String,List<Person>> map1 = new HashMap<>();
        map1.put("Z",list1);
        map1.put("L",list2);
        map1.put("W",list3);
        System.out.println(map1);
    }
}
