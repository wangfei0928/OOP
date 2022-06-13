package com.lanou.day05.abstractex;

public  class Circle extends Graph{


    private double r;
    public static final double PI = Math.PI;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }


    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
    public double perimeter(){
        return 2*PI*r;
    }

    public double area(){
        return PI*r*r;
    }

}
