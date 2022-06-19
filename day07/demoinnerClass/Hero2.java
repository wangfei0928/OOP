package com.lanou.day07.demoinnerClass;

public class Hero2 {

    private String name;
    private Integer hp;
    private int armor;

    private static int a = 100;

    public Hero2() {
    }

    public Hero2(String name, Integer hp, int armor) {
        this.name = name;
        this.hp = hp;
        this.armor = armor;
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

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", armor=" + armor +
                '}';
    }

    public static void battleWin(){
        System.out.println("我方取得了胜利");
    }

    /*
    * 静态内部类  敌方水晶
    * 静态内部类，可以独立于外部类对象而使用
    * 在静态内部类中，无法访问外部类中的 非静态属性和非静态方法
    * */
    static class EnemyCrystal{
        public int hp = 10000;
        public void isVictory(){
            if (hp <= 0){
                System.out.println("游戏结束");
            }
        }

        public int getHp() {
            return hp;
        }

        public void setHp(int hp) {
            this.hp = hp;
        }
//        Hero2.name    静态内部类不可以访问外部非静态的方法和变量
        int b = Hero2.a;
        public void test(){
            System.out.println(b);
            battleWin();
        }
    }
}
