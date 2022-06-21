package com.lanou.day12.test;

public class MyThread implements Runnable{

    @Override
    public  synchronized void run() {
        for (int i = 0; i <= 10; i++) {
            if (i ==3 ){
                try {
                    wait();  //java.lang.IllegalMonitorStateException  单独使用  异常
                             //wait 和 notify 必须要用在 同步代码中
                             //notify 和 notifyall 区别
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            notify();
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
