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
        System.out.println("η«επ");
    }

    public void catchMouse(){
        System.out.println("η«ζθιΌ ");
    }
}
