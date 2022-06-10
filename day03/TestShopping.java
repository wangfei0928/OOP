package com.lanou.day03;

public class TestShopping {
    public static void main(String[] args) {
        Shopping shopping = new Shopping();
        shopping.setShoppingId(001);
        shopping.setShoppingName("大礼包");
        shopping.setNewPrice(100);
        shopping.setOldPrice(80);
        shopping.setDescription("大礼包很大");
        shopping.printShopping();
    }
}
