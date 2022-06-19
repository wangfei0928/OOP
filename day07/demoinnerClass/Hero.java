package com.lanou.day07.demoinnerClass;

public class Hero {
    private String name;
    private Integer hp;
    private int armor;

    private int a = 10;


    public Hero() {
    }

    public Hero(String name, Integer hp, int armor) {
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

    class BattleScore{
        public  int die;
        public int kill;
        public int assit;

        private int a = 100;
        private int aaa;

        public BattleScore() {
        }

        public BattleScore(int die, int kill, int assit) {
            this.die = die;
            this.kill = kill;
            this.assit = assit;
        }

        //获得成就
        public void legendary(){
            if (kill >= 8){
                System.out.println(name + "超神！");
            }else {
                System.out.println(name + "尚未超神");
            }
        }

        public void  test(){
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Hero.this.a);
        }
        @Override
        public String toString() {
            return "BattleScore{" +
                    "die=" + die +
                    ", kill=" + kill +
                    ", assit=" + assit +
                    ", aaa=" + aaa +
                    '}';
        }
    }
}
