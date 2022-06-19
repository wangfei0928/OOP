package com.lanou.day07.demoinnerClass;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void bark() {
        System.out.println("喵喵喵");
    }
}
