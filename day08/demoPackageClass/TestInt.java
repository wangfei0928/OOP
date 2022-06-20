package com.lanou.day08.demoPackageClass;

public class TestInt {
    public static void main(String[] args) {
        Int i = new Int(100);
        System.out.println(i);
        System.out.println(Int.MAX_VALUE);
        System.out.println(Int.Min_VALUE);
        System.out.println(i.byteValue());
        System.out.println(i.value());
        System.out.println(i.shortValue());
        System.out.println(i.longValue());

        Int b = new Int(20);
        System.out.println(i.compareTo(b));
    }
}
