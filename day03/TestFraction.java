package com.lanou.day03;

public class TestFraction {
    public static void main(String[] args) {
        Fraction fraction = new Fraction();
        fraction.printFraction(1,5);
        fraction.setFenzi(1);
        fraction.setFenmu(5);

        Fraction fraction2 = new Fraction();
        fraction2.printFraction(3,10);
        fraction2.setFenzi(3);
        fraction2.setFenmu(10);
        System.out.println(fraction.sum(fraction,fraction2));

        System.out.println(fraction.jianfa(fraction,fraction2));

        System.out.println(fraction.chengfa(fraction,fraction2));
    }

}
