package com.lanou.day06.demointerface;

//接口只有方法声明，定义完之后，是为了被类实现
    //类实现接口使用implements关键字来实现接口

public class Cook implements Driving{
    @Override
    public void driver() {
        System.out.println("厨师每天开车去买菜");
    }

    public void cook(){
        System.out.println("厨师做饭");
    }
}
