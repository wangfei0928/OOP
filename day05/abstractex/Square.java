package com.lanou.day05.abstractex;

public class Square extends Graph{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square() {
    }


    public double getSide() {
        return side;
    }


    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
    @Override
    public double perimeter(){
        return side * 4;
    }

    public double area(){
        return side * side;
    }

}
