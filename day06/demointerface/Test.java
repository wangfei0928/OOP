package com.lanou.day06.demointerface;

public class Test {

    public static void main(String[] args) {
        //正常使用
        Cook cook = new Cook();
        cook.driver();
        cook.cook();

        Programer programer = new Programer();
        programer.driver();
        programer.writeCode();
        programer.repairBug();

        Driving driving = new Cook();
        driving.driver();
//        driving.cook();   //多态会隐藏子类的独特功能   driving类型是Driving,检查Driving，找不到cook()方法。
    }


}
