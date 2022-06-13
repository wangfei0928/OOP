package com.lanou.day05.exercise;

/*
* 定义一个圆类(Circle), 圆包含属性坐标x,y半径r和PI,圆可以计算面积,可以计算周长,可以计算与另外一个圆是否相交.
    要求: 圆类不能被其他类继承.PI定义成静态常量.
* */
public final class Circle {

    private double x;
    private double y;
    private double r;
    public static final double PI = Math.PI;

    public Circle() {
    }

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
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
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                '}';
    }
    public double perimeter(){
        return 2*PI*r;
    }

    public double area(){
        return PI*r*r;
    }

    public boolean intersect(Circle circle){
        boolean intersect = false;
        double dx = x - circle.getX();
        double dy = y - circle.getY();
        double d = Math.sqrt(dx*dx+dy*dy);
        if (d < r+ circle.getR()){
            intersect = true;
        }
        return intersect;
    }
}
