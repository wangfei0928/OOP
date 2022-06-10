package com.lanou.day03;

public class Circle {
    //定义半径
     int x;   //x坐标
     int y;   //y坐标
    double r;   //半径

    public double perimeter(){
        return 2 * r *Math.PI;
    }
    public double size(){
        return Math.PI * r *r;
    }
    /*
    *  判断当前圆是否和另外一个圆相交
    * */
    public boolean intersect(Circle circle){
        boolean intersect = false;
        double dx = x - circle.x;
        double dy = y - circle.y;
        double d = Math.sqrt(x*x+y*y);
        if (d < r+ circle.r){
            intersect = true;
        }
        return intersect;
    }
    /*
    public void intersect(int x1,int y1,int x2,int y2,int circleR1,int circleR2){
        //判断圆是否相交 半径和等于圆心距 相切
        // 半径和 小于圆心距 相离
        // 半径和大于圆心距 相交
        //圆心距 + 小圆半径 小于大圆半径 是包含关系否则相交

        //求两点距离 既是圆心距
        double d = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));

        if (circleR1 + circleR2 < d){
            System.out.println("两圆相离");
        }
        if (circleR1 + circleR2 == d){
            System.out.println("两圆相切");
        }
        if (circleR1 + circleR2 > d){
            System.out.println("两圆相交");
        }

    }
    */

}
