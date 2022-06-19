package com.lanou.day07.demoinnerClass;

/*
* 一个类中可以包含的成分： 属性（静态和非静态），方法（构造方法，实例方法，静态方法），代码块（初始化代码块，静态代码块），内部类。
* 内部类一共分为4种： 成员内部类 静态内部类 局部内部类 匿名内部类
* 这4种里，匿名内部类是最重要的，也是最常用的。其他几种都不太常用。 我们自己不怎么使用，偶尔会在系统的类中看到。
* 成员内部类： 一个类可以作为另外一个类的成员，像属性和方法一样。
* */
public class test {
    private int a;

    static {

    }
    //类B是成员内部类，
    class B{
        private int a;

        public B() {
        }

        public B(int a) {
            this.a = a;
        }

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }
        class C{

        }
//        static {}内部类不能有静态代码块
    }

}
