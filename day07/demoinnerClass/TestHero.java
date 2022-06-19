package com.lanou.day07.demoinnerClass;

public class TestHero {
    public static void main(String[] args) {
        Hero hero = new Hero("马超",1000,500);
        System.out.println(hero);
        Hero.BattleScore score = hero.new BattleScore(10,2,4);
        Hero.BattleScore score1 = new Hero("张飞",100,200).new BattleScore(5,1,1);
        score.kill = 101;
        score.assit = 66;
        System.out.println(score);
        System.out.println(score1);
        score.test();
    }
}
