package com.lanou.day07.demoinnerClass;

public class anonymityClass {
    /*
    * 匿名内部类，实际上就是匿名局部类，它定义在方法或者代码块里
    * 匿名内部类，没有对象名，怎么创建对象呢？
    * */
    public static void main(String[] args) {
        //匿名内部类有一个特殊的语法格式
        //对象和类的定义写一起
        Animal cat = new Cat("花花",2);
        cat.bark();
        cat.eat();

        Animal dog = new Dog("大黄",22);
        dog.eat();
        dog.bark();

        //如果你创建的子类只是为了实现父类中的抽象方法，或者重写父类的方法，那么没有必要单独定义一个类，可以单独
        Animal animal = new Animal("苏西",2) {
            @Override
            public void eat() {
                System.out.println("羊吃草");
            }

            @Override
            public void bark() {
                System.out.println("咩咩咩");
            }
        };
        System.out.println(animal);
        animal.bark();
        animal.eat();

    }
}
