package com.lanou.day06.demointerface;

public interface MyInterface {

    //接口里面可以包含属性，但是必须是public static final
    //接口中 只能包含静态常量， 不能包含普通属性。
//    如果不写 public static final  也会默认添加。
    int a = 10 ;  //static 修饰的属性是以斜体的形式显示。
    public int b = 20;
    public static int c = 30;
    public static final int d = 40;


    //接口不能包含正常类所包含的内容
    //接口不能包含普通方法，只能包含抽象方法
    //方法的默认修饰符是 public abstract

    void print2();
    public void print();
    public abstract void print3();

    /*
    * 实现类不需要实现  默认方法和静态方法----因为 默认方法和静态方法已经有实现体。 如果不满意接口中的默认实现代码，你可以重写。
    * jdk1.8  也就是java8.在jdk1.8（也就是java8）的时候，接口被强化了。除了可以包含静态常量，抽象方法之外，还可以包含  静态方法以及默认方法
    * 为什么 接口 提供默认方法？？
    * 你已经定义好了接口A，让类B,C，D等几十个类实现A接口。
    * 很长一段时间，都没有任何问题，后来因为需要，你给A添加了一个新的方法（抽象方法）。
    * 你会发现，B,C，D等几十个类实现都报错了。 报错的原因是 没有实现全部的抽象方法。解决办法是每个类都实现新增的抽象方法。
    * 但是你会发现有些类，可能就用不到新增的方法，但是也必须得实现新增的方法。
    * 提供默认方法  可以很高效的解决上述问题。真正需要这个新方法的实现类，可以重写默认方法。
    * */
    //静态方法  jdk1.8之后添加了静态方法
    public static void printMethod(){
        System.out.println("jdk1.8之后添加了静态方法");
    }

    //默认方法   jdk1.8之后提供了默认方法
    public default  void method(){
        System.out.println("jdk1.8之后提供了默认方法");
    }
}
