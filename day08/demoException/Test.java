package com.lanou.day08.demoException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        /*
        * Java中所有的顶层异常和错误的顶层父类是Throwable
        * 所有的错误  都直接或者间接继承Error类
        *  比较严重的事情，称为错误。多数错误都不是我们程序产生的。
        *  对于错误我们不需要解决，也解决不了。 如果虚拟机出错了，只能重装JDK。改代码修复不好。
        *
        * 所有的异常  都直接或者间接继承Exception类
        * 异常多数情况下，都是我们代码不严谨产生的。
        * 异常需要我们处理。
        * 异常分为两大类：
        * 1. 运行期异常：能正常编译，但是运行的时候会报错
        * 2. 非运行期(编译器期)异常：  没有走到运行那一步，异常不处理，将导致源文件无法编译
        * */

        /*
        * 编译器异常，
        * 处理异常有两种方式：
        * 方式一： 在异常所在的方法名后边 通过throws 异常类名进行声明性抛出
        *         所谓的声明性抛出，就是告诉调用的地方，我内部有异常没有处理
        * 方式二：  处理异常，把有可能出现异常代码写在try代码块里，catch代码块里写对应的处理代码
        *          如果try代码块里没有出现异常，那么catch代码块里不执行
        *          无论是否出现异常，finally代码块都会执行
        *
        * 运行期异常不需要捕获，如果运行期异常和非运行期异常 都需要捕获，你会发现，你的代码到处都是try..catch..finally代码段
        * 实际开发中，运行期异常我们不通过try..catch捕获。
        * 编译器异常一定要处理（要么抛出，要么try..catch），如果不处理，程序无法编译，无法运行。
        * */
        try {
            myException();
            int a = 10;
            int b = a/0;
        }catch (Exception exception){
            exception.printStackTrace();
            System.out.println(exception);
            System.out.println("出现异常了");
        }
        finally {
            System.out.println("无论是否出现异常，都会执行");
        }



    }

    public static void myException() throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = "2022-06-16 17:58:00";
        Date date = simpleDateFormat.parse(str);
        System.out.println(date);
    }
}
