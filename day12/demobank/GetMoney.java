package com.lanou.day12.demobank;

public class GetMoney implements Runnable{

    private Card card;


    public GetMoney(){}

    public GetMoney(Card card) {
        this.card = card;
    }

    @Override
    public void run() {
/*
* JDK 1.4之前，直接加重量级锁
* 偏向锁：只有一个线程  只加上一个轻量级锁
* 轻量级锁： 两个线程， T1,T2,  while(true){}
* 重量级锁：直接让程序挂起，  1. 程序比较多 2.执行的同步的代码时间比较长
* */
        //假设每次取100元
        while (true){
            synchronized (card){
                if (card.getMoney() >= 100){
                    System.out.println(Thread.currentThread().getName()+"开始取钱");
                    card.cost(100);
                    System.out.println(Thread.currentThread().getName()+"取钱成功");
                }else {
                    System.out.println(Thread.currentThread().getName()+"余额不足，取钱失败");
                    break;
                }
            }

        }

    }
}
