package com.lanou.day05;

public class Cat extends Animal{

    int a = 100;
    int b = 20;
    public Cat() {
    }

    public Cat(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("猫吃🐟");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
