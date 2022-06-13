package com.lanou.day05.demoStatic;
/*
* 一旦一个属性是静态的，那么这个属性将不再属于对象（而是由对象共享）,属于类，这个属性只有一份，并不是每个兑现都有一份
* 静态属性的加载实际，随着类的加载而加载，即使没有创建对象，静态属性也可以访问
*
* 一旦一个属性定义成static，那么这个属性将提升等级，变为类的属性，而非对象的属性。
*  你可以通过类去访问，也可以通过对象去访问。
*  只不过这个属性只有一份，无论通过类访问还是通过对象访问，都会引起属性的变化。
*
*在专业术语上， 用static修饰的属性 称为类属性。
* 没有被static修饰的属性，称为对象属性，它是属于实例（对象）的，每个对象都拥有一个属性。
*  你改你的，我的不变。例如：姓名。每个人都有姓名，你改姓名的时候，我的姓名不变。
*
* 一般（通常）情况下， 我们只使用 类名去访问static属性， 不使用对象访问static属性（尽管可以）。
* */
public class A {

    private static int a ;
    private  int b;

    public A() {
    }

    public A(int a,int b) {
        this.a = a;
        this.b = b;
    }

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        A.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }


    @Override
    public String toString() {
        return "A{" +
                "a=" + a +
                ",b=" + b +
                '}';
    }
}
