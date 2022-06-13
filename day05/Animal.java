package com.lanou.day05;
/*
 * 多态在实际开发种，超级常用！！
 * 父类引用 指向子类对象。
 * 接口 引用指向实现类对象。
 * 多态实现的前提： 1. 有继承或者实现关系  2. 有方法重写  3. 父类引用指向子类对象（或子类的对象赋值给父类的引用）
 * 多态的特点：
 *     1.在继承关系里，子类可以被看做父类对象。   父类 引用 = new  子类();
 *     2.如果子类重写了父类中的方法，通过父类引用调用方法时，会执行子类的方法。
 * 多态会屏蔽子类差异，只能调用父类中的方法（子类的公共方法）。
 *
 * 多态只关注  共性方法（eat）
 * 如果想要使用子类特有的方法， 需要把父类引用强转成子类
 * 引用。Cat c = (Cat) animal;
 * 然后就可以通过子类引用调用子类方法了   c.catchMouse();
 * */
public class Animal {
    int a = 10;
    private String name;
    private Integer age;

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("动物吃东西");
    }
}
