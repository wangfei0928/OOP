package com.lanou.day15.reflect;

import java.lang.reflect.Constructor;

public class Test02 {
    public static void main(String[] args) throws Exception {
        Class<?> c = Class.forName("com.lanou.day15.reflect.Student");
        //通过类对象 创建对象 newInstance调用的是默认的构造方法
        Object o = c.newInstance();  //此方式创建的对象就是Object对象
        Student student = (Student) o;

        student.setName("lisi");
        System.out.println(student.getName());

        //指定构造方法创建对象
        Constructor<?> constructor = c.getConstructor(String.class, String.class, Integer.class);
        Object o2 = constructor.newInstance("zhangsan","1234451",18);
        Student student1 = (Student) o2;
        System.out.println(student1);


    }
}
