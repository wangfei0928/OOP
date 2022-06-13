package com.lanou.day05.abstractex;

public class TestGraph {

    public static void main(String[] args) {
        Graph circle = new Circle(3);
        System.out.println("圆的周长:"+circle.perimeter());
        System.out.println("圆的面积:"+circle.area());

        Graph rectangle = new Rectangle(3,4);
        System.out.println("长方形周长："+rectangle.perimeter());
        System.out.println("长方形面积："+rectangle.area());

        Graph square = new Square(4);
        System.out.println("长方形周长："+square.perimeter());
        System.out.println("长方形面积："+square.area());
    }
}
