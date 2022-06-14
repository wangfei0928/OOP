package com.lanou.day06.interfaceEX;

public abstract class Hero {

    private String name;  //姓名
    private Integer hp;    //血量
    private Integer armor;  //护甲

    private Integer ap;  //攻击力

    public Hero() {
    }

    public Hero(String name, Integer hp, Integer armor,Integer ap) {
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.ap = ap;
    }

    public Integer getAp() {
        return ap;
    }

    public void setAp(Integer ap) {
        this.ap = ap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getArmor() {
        return armor;
    }

    public void setArmor(Integer armor) {
        this.armor = armor;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", armor=" + armor +
                ", ap=" + ap +
                '}';
    }
}
