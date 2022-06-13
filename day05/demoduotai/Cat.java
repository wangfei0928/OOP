package com.lanou.day05.demoduotai;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, Integer age) {
        super(name, age);
    }

    public void eat(){
        System.out.println("猫吃鱼");
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
