package com.lanou.day10.demoset;


import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {

        Set<Teacher> set = new TreeSet<>();
        Teacher t1 = new Teacher("zhangsan",14,16000);
        Teacher t2 = new Teacher("lisi",43,12888);
        Teacher t3 = new Teacher("wangwu",32,13000);
        Teacher t4 = new Teacher("zhaoliu",66,10000);

        set.add(t1);
        set.add(t2);
        set.add(t3);
        set.add(t4);
        System.out.println(set);
    }
}
