package com.lanou.day07.demoinnerClass;

public class TestHero2 {

    public static void main(String[] args) {
        //静态内部类可以独立于外部类对象单独使用
        Hero2.EnemyCrystal crystal = new Hero2.EnemyCrystal();
        crystal.setHp(0);
        crystal.isVictory();
        crystal.test();
    }



}
