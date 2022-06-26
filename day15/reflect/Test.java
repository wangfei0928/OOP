package com.lanou.day15.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Student student = new Student();
        //有了对象，如何获取对象的信息
        //在运行程序时，得到类的所有信息
        //获取类的三种方式
        //第一种
//        Class c1 = student.getClass();
        //第二种
//        Class c2 = Student.class;
        //第三种  最常用，因为此方式传的是一个字符串   比较灵活
        Class c = Class.forName("com.lanou.day15.reflect.Student");

        //Filed记录类中的属性信息
        Field field[] = c.getDeclaredFields();  //获取属性
        for (Field field1 : field) {
            System.out.println(field1.getName()+"--"+field1.getType().getName());
        }
        System.out.println("------------------------------------");

        Field field1 = c.getDeclaredField("name");  //获取指定的属性信息
        System.out.println(field1.getName()+"--"+field1.getType().getName());
        System.out.println("------------------------------------");
        Method[] declaredMethods = c.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName()+"-"+declaredMethod.getReturnType().getName()+"--"+declaredMethod.getModifiers());
        }

        System.out.println("------------------------------------");
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName()+"-"+declaredMethod.getReturnType().getName()+"--"+declaredMethod.getModifiers());
            Class<?>[] parameterTypes = declaredMethod.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println(parameterType);
            }
            System.out.println();

        }

        System.out.println("------------------------------------");

        /*
        * 父类信息
        * */
        Class superclass = c.getSuperclass();
        System.out.println("父类的信息是"+superclass.getName());

        //接口信息
        Class[] interfaces = c.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println("接口信息："+anInterface.getName());
        }

        //构造方法
        Constructor[] constructors = c.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName()+"参数数量"+constructor.getParameterCount());
        }

    }

}
