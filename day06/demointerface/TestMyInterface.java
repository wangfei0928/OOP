package com.lanou.day06.demointerface;

public class TestMyInterface {
    public static void main(String[] args) {

            //因为可以直接使用点语法，所以a是public修饰
            System.out.println(MyInterface.a);  //能够通过类名(接口可以看作一个特殊的类)访问，说明a是static修饰的
//        MyInterface.a = 200;    说明a是常量 不能给a赋值。
            System.out.println(MyInterface.b);
            System.out.println(MyInterface.d);
            System.out.println(MyInterface.c);

            MyInterface myInterface = new MyInterfaceImpl();
            myInterface.method();

            MyInterface.printMethod();   //只能用类名.方法调用静态方法，不能用对象调用静态方法

    }
}
