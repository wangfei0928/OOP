package com.lanou.day12.demopool.poo03;

public class MyRunnable3 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 10 ; i++) {
            System.out.println(Thread.currentThread().getName()+" ===="+i);
        }
    }
}
