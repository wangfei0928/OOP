package com.lanou.day08.demoObject;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("张三",22);
        Person p2 = new Person("张三",22);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p1));
        System.out.println(p1 == p1);
        System.out.println( p1 == p2);
    }
}
