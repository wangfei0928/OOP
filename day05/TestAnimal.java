package com.lanou.day05;

public class TestAnimal {
    public static void main(String[] args) {
        //父类引用指向子类对象
        Animal animal1 = new Cat("小猫",2);  //虽然子类当作父类来看，但是子类仍然使用自身的方法
        animal1.eat();   //猫吃🐟
        System.out.println(animal1.a);  //输出10；
//        System.out.println(animal1.b);   不能打印b  因为animal中没有b属性
        //为什么 调用方法的时候，是子类的方法， 但是属性确是父类的属性呢？
        //属性不是方法， 没有重写的概念。   所以  点语法访问的是父类的属性  实际开发种，不会出现  父类子类具有同名属性的情况
//        animal1.catchMouse();   无法调用，因为animal1 的类型是Animal，所以编译器认为animal1是Animal类型，会检查Animal中是否有catchMouse方法
        System.out.println(animal1);

        Animal animal2 = new Dot("大狗",3);
        animal2.eat();
        System.out.println(animal2);
    }
}
