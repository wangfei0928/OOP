package com.lanou.day12.proandcost;

public class Producter implements Runnable{

    private Saler saler;

    public Producter() {
    }

    public Producter(Saler saler) {
        this.saler = saler;
    }

    @Override
    public void run() {
        while (true){
            saler.stockGoods();   //每次生产一个
        }
    }
}
