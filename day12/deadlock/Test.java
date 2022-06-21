package com.lanou.day12.deadlock;

public class Test {
    public static void main(String[] args) {
        Object o1  = new Object();
        Object o2  = new Object();

        MyThread myThread = new MyThread(o1,o2);
        MyThread2 myThread2 = new MyThread2(o1,o2);

        myThread.start();
        myThread2.start();
    }
}
