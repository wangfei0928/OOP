package com.lanou.day06.demointerface;

public class Programer implements Driving{
    @Override
    public void driver() {
        System.out.println("程序员开车去旅游");
    }
    public void writeCode(){
        System.out.println("程序员敲代码");
    }
    public void repairBug(){
        System.out.println("程序员改BUG");
    }
}
