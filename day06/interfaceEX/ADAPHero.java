package com.lanou.day06.interfaceEX;

public class ADAPHero extends Hero implements AD,AP{

    public ADAPHero() {
    }

    public ADAPHero(String name, Integer hp, Integer armor, Integer ap) {
        super(name, hp, armor, ap);
    }

    @Override
    public void physicsAttack(Hero hero) {
        System.out.println(getName() + "物理攻击"+hero.getName());
        int loseHP = getAp() - hero.getArmor();
        int newHp = hero.getHp() - loseHP;
        if (newHp > 0){
            hero.setHp(newHp);
        }else{
            hero.setHp(0);
            System.out.println(hero.getName()+"该英雄死亡");
        }
    }

    @Override
    public void magicAttack(Hero hero) {
        System.out.println(getName()+"魔法攻击"+hero.getName());
        int loseHP = getAp() - hero.getArmor();
        int newHp = hero.getHp() - loseHP;
        if (newHp > 0){
            hero.setHp(newHp);
        }else{
            hero.setHp(0);
            System.out.println(hero.getName()+"该英雄死亡");
        }
    }
    @Override
    public String toString() {
        return "ADAPHero{" +
                "name='" + getName() + '\'' +
                ", hp=" + getHp() +
                ", armor=" + getArmor() +
                ", ap=" + getAp() +
                '}';
    }
}
