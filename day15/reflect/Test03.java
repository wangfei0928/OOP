package com.lanou.day15.reflect;

import java.lang.reflect.Field;

public class Test03 {
    public static void main(String[] args) throws Exception {

        //通过反射，给属性赋值
        Class<?> c = Class.forName("com.lanou.day15.reflect.Student");
        Object o = c.newInstance();

        Field field = c.getDeclaredField("address");//得到要处理的属性
//        field.setAccessible(true);
        field.set(o,"China");//给o这个对象的field属性 赋"China"值
        Student student = (Student) o;
        Object o1 = field.get(o);//获取o对象中的  field属性的值
        System.out.println(o1);
        System.out.println(student.getAddress());

        Field name = c.getDeclaredField("name");

        //private 出当前对象，反射也不能操作
        name.setAccessible(true);  //获取权限
        name.set(o,"zhangsan");
        Object o2 = name.get(o);
        Student student1 = (Student) o;
        System.out.println(student1.getName());
        System.out.println(o2);
    }
}
