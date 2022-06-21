package com.lanou.day12.lessonEx.ticket;

public class Test {
    public static void main(String[] args) {
        Runnable station = new Station();
        Thread t1 = new Thread(station,"窗口一");
        Thread t2 = new Thread(station,"窗口二");
        Thread t3 = new Thread(station,"窗口三");
        t1.start();
        t2.start();
        t3.start();
    }
}
