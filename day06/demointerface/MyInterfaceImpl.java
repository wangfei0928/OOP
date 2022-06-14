package com.lanou.day06.demointerface;

public class MyInterfaceImpl implements MyInterface{

    @Override
    public void print() {
        System.out.println("我重写了print方法");
    }

    @Override
    public void print3() {
        System.out.println("我重写了print3方法");
    }

    @Override
    public void print2() {
        System.out.println("我重写了print2方法");
    }

    @Override
    public void method() {
        System.out.println("我重写了默认方法");
    }


}
