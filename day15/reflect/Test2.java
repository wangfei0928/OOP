package com.lanou.day15.reflect;

import java.lang.reflect.Method;

public class Test2 {

    public static void main(String[] args) throws Exception {

        Class<?> c = Class.forName("com.lanou.day15.reflect.Student");
        Object o = c.newInstance();
        Method method = c.getMethod("fnl", String.class, String.class);
        method.invoke(o,"zhangsan","rrr");

        Method method1 = c.getMethod("cal",int.class,int.class);
        Object r = method1.invoke(o,12,12);
        System.out.println(r);


    }
}
