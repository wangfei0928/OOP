package com.lanou.day12.proandcost;

public class Customer implements Runnable{

    private Saler saler;

    public Customer() {
    }

    public Customer(Saler saler) {
        this.saler = saler;
    }

    @Override
    public void run() {
        while (true){
            saler.sellGoods();
        }
    }
}
