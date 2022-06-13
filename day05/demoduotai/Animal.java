package com.lanou.day05.demoduotai;

public class Animal {
    public String name; //姓名
    public Integer age;  //年龄

    public Animal() {
    }

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    //父类中的方法为了多态而存在，这个方法 一般空实现
    public void eat(){}
}
