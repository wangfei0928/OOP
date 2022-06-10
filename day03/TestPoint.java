package com.lanou.day03;

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point();
        point.setX(10);
        point.setY(20);
        point.printPoint();

        Point point2 = new Point();
        point2.setX(13);
        point2.setY(24);
        System.out.println("两点之间的坐标:"+point.distance(point2));
    }
}
