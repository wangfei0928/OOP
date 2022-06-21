package com.lanou.day12.proandcost;

public class Test {
    public static void main(String[] args) {

        Saler saler = new Saler();

        Customer customer = new Customer(saler);
        Producter producter = new Producter(saler);

        Thread t1 = new Thread(customer,"客户");
        Thread t2 = new Thread(producter,"厂家");

        t1.start();
        t2.start();

    }
}
