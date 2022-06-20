package com.lanou.day08.demoObject;

public class Person {
    private String name;
    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
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
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*
    * 如何判断2个person相等呢？
    * 需要我们自己下定义，如果我们认为，名字和年龄都相等， 则认为相等
    * */
    @Override
    public boolean equals(Object obj) {
        Person p = (Person) obj;
        String name2 = p.getName();
        int age2 = p.age;
        if (this.name.equals(name2) && this.age.equals(age2)){
            return  true;
        }else {
            return false;
        }
    }
}
