package com.lanou.day03;

public class Point {
    /*
    * 定义一个 点 类.包含x坐标和y坐标. 提供一个打印点的坐标的方法, 以及一个计算当前点和另外一个点距离的方法.
    * */
    private int x;
    private int y;

    public void printPoint(){
        System.out.println("该点的坐标为：(" + x +"," + y +")");
    }

    public double distance(Point point){
        int dx = x - point.getX();
        int dy = y - point.getY();
        double distance = Math.sqrt(dx * dx + dy * dy);
        return distance;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
