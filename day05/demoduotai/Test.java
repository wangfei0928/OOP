package com.lanou.day05.demoduotai;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("张三",22);
        Cat cat = new Cat("花花",1);
        person.raisePet(cat);

        Animal dog = new Dog("大黄",2);
        person.raisePet(dog);
    }
}
