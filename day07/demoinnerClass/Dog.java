package com.lanou.day07.demoinnerClass;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    @Override
    public void bark() {
        System.out.println("汪汪叫");
    }
}
