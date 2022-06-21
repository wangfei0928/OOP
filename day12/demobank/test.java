package com.lanou.day12.demobank;

public class test {
    public static void main(String[] args) {
        Card card = new Card();
        Runnable runnable = new GetMoney(card);
        Thread laopo = new Thread(runnable,"老婆");
        Thread laogong = new Thread(runnable,"老公");
        laopo.start();
        laogong.start();
    }

}
