package com.lanou.day09.demoException;

/*
* 自定义运行时异常  异常类需要继承于RuntimeException
* 创建自定义异常类，只有2个作用。
作用一：  有一个独特的异常类名。
作用二：  可以自定义错误提示信息。 new 异常对象的时候，给出message
*
* 如何自定义异常？
一、自定义运行期异常
（1）创建一个类继承于 RuntimeException
（2）提供构造方法
（3）在需要抛出异常的地方，new一个自定义异常对象
（4）使用throw关键字 抛出异常
二、自定义检查性（编译期）异常
（1）创建一个类继承于 Exception
（2）提供构造方法
（3）在需要抛出异常的地方，new一个自定义异常对象
（4）使用throw关键字 抛出异常
（5）在throw关键字所在的方法名后面添加 throws 自定义异常类名
* */
public class ValueOutOfLimitException extends RuntimeException{

    public ValueOutOfLimitException() {
    }

    public ValueOutOfLimitException(String message) {
        super(message);
    }
}
