package com.lanou.day12.lessonEx.ticket;

public class Station implements Runnable{


     private int  ticketNum = 100;

    public Station() {
    }

    public Station(int ticketNum) {
        this.ticketNum = ticketNum;
    }

    @Override
    public void run() {
        while (true){
            synchronized ("aa"){
                if (ticketNum > 0 ){
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + (100-ticketNum+1) + "张票");
                    ticketNum--;
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }else {
                    System.out.println("票已卖光！");
                    break;
                }
            }

        }
    }
}
