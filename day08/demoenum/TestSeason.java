package com.lanou.day08.demoenum;

public class TestSeason {
    public static void main(String[] args) {
        //枚举类型不能new对象，是因为它所有的对象都已经提前定义好了
        Season season = Season.SPRING;
        Season season1 = Season.AUTUMN;
        System.out.println(season);
        //分支结构 switch语句中的变量  可以是整数、char、String、枚举

        System.out.println(season.compareTo(season1));
        System.out.println(season.equals(season1));
        System.out.println(season.name());
        System.out.println(season1.ordinal());
        season.method();
        season.setA(100);
        System.out.println(season.getA());

        switch (season){
            case SPRING:
                System.out.println("春天去洛阳看牡丹");
                break;
            case AUTUMN:
                System.out.println("去避暑");
                break;
            case SUMMER:
                System.out.println("去北京香山看枫叶");
                break;
            case WINTER:
                System.out.println("去海南");
                break;
        }
    }
}
