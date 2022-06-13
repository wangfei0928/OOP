package com.lanou.day05.demoblock;

public class Student {

    private String name;
    private Integer age;

    static {
        System.out.println("我是静态代码块呵呵");
    }

    {
        System.out.println("我是初始化代码块");
    }
    {
        System.out.println("hello");
    }
    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
        System.out.println("构造");
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void study(){
        System.out.println("好好学习！");
    }
}
