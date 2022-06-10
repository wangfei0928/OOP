package com.lanou.day03;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.r = 10;
        c1.x = 3;
        c1.y = 4;

        System.out.println("圆的周长："+c1.perimeter());
        System.out.println("圆的面积："+c1.size());

        Circle c2 = new Circle();
        c2.r = 20;
        c1.x = 4;
        c2.y = 5;

        System.out.println("圆的周长："+c2.perimeter());
        System.out.println("圆的面积："+c2.size());

        System.out.println(c1.intersect(c2));
//        c1.intersect(3,4,4,5,2,4);

    }
}
