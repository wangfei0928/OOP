package com.lanou.day12.lessonEx.bank;

public class Bank {
    private int money = 500;

    public Bank(){}
    public Bank(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void cost(int m){
        money -= m;
    }
}
