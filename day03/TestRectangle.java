package com.lanou.day03;

public class TestRectangle {
    /*
    *  定义一个 矩形类,包括一个点(左上角的点)和宽度,高度(点可以借助上题定义的点类).
    *  提供如下方法: 计算矩形面积的方法,计算矩形周长的方法,计算矩形是否相交的方法（面试题）.
    *  计算矩形中心点的方法(返回值是一个点).
    * */

    public static void main(String[] args) {
        Point p1 = new Point();
        Rectangle rectangle = new Rectangle();
        p1.setX(0);
        p1.setY(0);
        Point p2 = new Point();
        p2.setX(4);
        p2.setY(6);
        int width = p2.getX() - p1.getX();
        int height = p2.getY() - p1.getY();


        Point p3 = new Point();
        Rectangle rectangle2 = new Rectangle();
        p1.setX(4);
        p1.setY(6);
        Point p4 = new Point();
        p2.setX(4);
        p2.setY(6);
        int width2 = p2.getX() - p1.getX();
        int height2 = p2.getY() - p1.getY();

        System.out.println("矩形的周长:" + rectangle.perimeter(width,height));
        System.out.println("矩形的面积:" + rectangle.area(width,height));
        rectangle.findCenter(width,height,p1.getX(),p1.getY());

        double centerX1 = width / 2 + p1.getX();
        double centerY1 = height / 2 + p1.getY();

        double centerX2 = width / 2 + p2.getX();
        double centerY2 = height / 2 + p2.getY();

        double dx = Math.abs(centerX1 - centerX2);
        double dy = Math.abs(centerY1 - centerY2);

        if (dx < width/2+width2/2 || dy < height/2 + height2/2){
            System.out.println("两个矩形相交");
        }else {
            System.out.println("不相交");
        }
    }



}
