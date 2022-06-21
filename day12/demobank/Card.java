package com.lanou.day12.demobank;

public class Card {

    private int money = 500;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void cost(int m){
        money = money - m;
    }

}
