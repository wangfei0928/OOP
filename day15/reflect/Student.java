package com.lanou.day15.reflect;

public class Student implements A,B{

    private String name;
    private String id;
    private Integer age;

    String address;

    public Student() {
    }

    public Student(String name, String id, Integer age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public Student(String name, String id, Integer age,String address) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                '}';
    }

    public void fnl(String str1,String str2){
        System.out.println("hello");
    }

    public Object cal(int a, int b){
        int i =2;
        System.out.println("eraaa");
        return i;
    }
}
