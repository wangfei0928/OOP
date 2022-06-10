package com.lanou.day03;

public class Rectangle {

    double width ;
    double height;

    //周长
    public double perimeter(double width,double height){
        return (width + height) * 2;
    }
    //面积
    public double area(double width,double height){
        return width * height;
    }

    //中心点坐标
    public void findCenter(double width,double height,double startX,double startY){
        double centerX = width / 2 + startX;
        double centerY = height / 2 + startY;
        System.out.println("中心点的坐标为:"+centerX+","+centerY);
    }

}
