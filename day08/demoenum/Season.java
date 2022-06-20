package com.lanou.day08.demoenum;

/*
* 枚举：把一个类所有的对象
* 枚举类型 是一种特殊的类（本质上还是类）。
* 任何枚举类型都继承于 Enum类。所以Enum里面方法都可以使用。
*  一般如果一个类，它的对象数量是有限的，那么这个类就可以定义成 枚举。
*  枚举类型使用 enum来定义。 枚举类型一般用于switch语句。 枚举的值作为case值使用。
* */
public enum Season {
    SPRING,SUMMER,AUTUMN,WINTER;
    public void method(){
        System.out.println("自定义方法");
    }

    static {
        System.out.println("我是静态代码块");
    }
    {
        System.out.println("我是初始化代码块");
    }

    Season() {
    }

    Season(int a) {
        this.a = a;
    }

    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
