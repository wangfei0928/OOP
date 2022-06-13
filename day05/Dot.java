package com.lanou.day05;

public class Dot extends Animal{
    public Dot() {
    }

    public Dot(String name, Integer age) {
        super(name, age);
    }
    public void eat(){
        System.out.println("狗吃肉");
    }

    public void lookDoor(){
        System.out.println("狗看门");
    }
}
