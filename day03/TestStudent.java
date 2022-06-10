package com.lanou.day03;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "崔晓康";
        student.age = 20;

        System.out.println(student.name);
        System.out.println(student.age);
        student.doHomework();
        student.study();
    }
}
