package com.lanou.day05.abstractex;

public class Rectangle extends Graph{

    private double x;
    private double y;
    private double side;
    private double side2;

    public Rectangle() {
    }

    public Rectangle(double side, double side2) {
        this.side = side;
        this.side2 = side2;
    }

    public double getSide() {
        return side;
    }


    public void setSide(double side) {
        this.side = side;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "side=" + side +
                ", side2=" + side2 +
                '}';
    }

    public double perimeter(){
        return 2 * ( side + side2);
    }


    public double area(){
        return side * side2;
    }

}
