package com.lanou.day12.lessonEx.bank;

public class TestBank {

    public static void main(String[] args) {

        Bank bank = new Bank();
        Runnable runnable = new CostMoney(bank);

        Thread laopo = new Thread(runnable,"老婆");
        Thread laogong = new Thread(runnable,"老公");

        laopo.start();
        laogong.start();
    }


}
