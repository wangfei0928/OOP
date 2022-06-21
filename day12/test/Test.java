package com.lanou.day12.test;

public class Test {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread,"aaa");
        Thread thread1 = new Thread(myThread,"bbb");

        thread.start();
        thread1.start();


    }



}
