package com.lanou.day06.interfaceEX;

public class TestHero {
    public static void main(String[] args) {

        ADHero maChao = new ADHero("马超",1000,200,350);
        APHero yaDianNa = new APHero("雅典娜",700,210,380);
        maChao.physicsAttack(yaDianNa);
        System.out.println(yaDianNa);
        yaDianNa.magicAttack(maChao);
        System.out.println(maChao);


        ADAPHero liBai = new ADAPHero("李白",800,205,360);
        liBai.magicAttack(yaDianNa);
        System.out.println(yaDianNa);
        liBai.physicsAttack(yaDianNa);
        System.out.println(yaDianNa);

        maChao.physicsAttack(yaDianNa);
        System.out.println(yaDianNa);
        yaDianNa.magicAttack(maChao);
        System.out.println(maChao);

        liBai.magicAttack(yaDianNa);
        System.out.println(yaDianNa);
        liBai.physicsAttack(yaDianNa);
        System.out.println(yaDianNa);
    }
}
