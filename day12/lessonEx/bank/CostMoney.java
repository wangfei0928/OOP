package com.lanou.day12.lessonEx.bank;

public class CostMoney implements Runnable{

    private Bank bank;

    public CostMoney() {
    }

    public CostMoney(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
           getMoney();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized void getMoney(){
        if (bank.getMoney() > 0){
            System.out.println(Thread.currentThread().getName()+"开始取钱");
            bank.cost(100);

        }
    }
}
