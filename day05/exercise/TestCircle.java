package com.lanou.day05.exercise;

public class TestCircle {
    public static void main(String[] args) {

        Circle circle = new Circle(0,0,3);
        System.out.println(circle.perimeter());
        System.out.println(circle.area());

        System.out.println(circle.intersect(new Circle(3,3,4)));

    }
}
