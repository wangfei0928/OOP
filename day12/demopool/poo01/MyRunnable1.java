package com.lanou.day12.demopool.poo01;

public class MyRunnable1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 10 ; i++) {
            System.out.println(Thread.currentThread().getName()+" ===="+i);
        }
    }
}
