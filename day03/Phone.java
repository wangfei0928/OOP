package com.lanou.day03;

/*
* Java是纯面向对象的编程语言。
* 任何代码都需要写到类里面。
* 类：具有相同特征（属性）和行为（方法）的事物的抽象。
* 类是抽象的,类是一个概念。在java中，类本质上是一个类型（引用类型）。
* java提供了一种语法，允许你创建自己的类。
*  对象：对象是类的具体体现，是类的实例。它是具体的
* 类就是对事物的定义  类的作用是 作为一种数据类型。  类用于创建对象。
* OOP--面向对象编程。
* POP--面向过程编程。
*
* 一个java文件可以有多个类，但只能有一个public类，而且文件名必须和public修饰类的文件名相同
* 之所以只能有一个public类，是因为一个文件只能有一个文件名。
* 一般情况下，一个文件只有一个类
*
* 属性还可以叫成员变量，也可以叫实例变量。  类名  大驼峰法命名
+ 属性有默认值
* 整数（byte,short,int,long） 默认值是0
* 小数（float, double） 默认值是0.0
* 布尔类型（boolean） 默认值是false
* char默认值值是 '0'
* 引用类型（例如，数组，String，等）默认值是null
*
* 实例变量（属性)： 在类中方法外的变量
* 局部变量
 * */

public class Phone {

    String brand;   //品牌
    String color;   //颜色
    String price;   //价格

    public void call(){
        System.out.println("打电话");
    }
    public void sentMsg(){
        System.out.println("发信息");
    }

}
