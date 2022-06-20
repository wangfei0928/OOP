package com.lanou.day08.normalClass;

public class MathClass {
    public static void main(String[] args) {
        double x = 3.02;
        double y = Math.ceil(x);
        double z = Math.floor(x);
        int n = (int)y;
        System.out.println(n);
        System.out.println(z);

        //一个房间住两个人，一共13人，需要几间
        int a  = 13;
        int count = a % 2 ==0? a/2:a/2+1;
        System.out.println(count);

        double b = 13.4;
        int c = (int)Math.ceil(b);
        System.out.println(c);

        System.out.println(Math.pow(10,3));

        System.out.println(Math.random());//[0.0~1.0)
        System.out.println(Math.random()*100);//[0.0~1.0)





    }
}
