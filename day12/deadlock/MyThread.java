package com.lanou.day12.deadlock;

public class MyThread extends Thread{
    private Object o1;
    private Object o2;

    public MyThread(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o1){
            System.out.println("线程1进入第一个锁");
            try {
                o1.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (o2){
                System.out.println("线程1进入第2个锁");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
