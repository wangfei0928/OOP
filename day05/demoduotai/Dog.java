package com.lanou.day05.demoduotai;

public class Dog extends Animal{

    public Dog() {
    }

    public Dog(String name, Integer age) {
        super(name, age);
    }
    public void eat(){
        System.out.println("狗吃肉");
    }

    public void lookDoor(){
        System.out.println("狗看门");
    }
}
