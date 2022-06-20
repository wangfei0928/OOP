package com.lanou.day08.demostringbuilder;

public class demoStringBuffer {
    /*
    * StringBuilder 和 StringBuffer 功能一模一样 区别在于： StringBuffer在多线程环境下是安全的。 StringBuilder在多线程下不安全。
    * StringBuffer因为是线程安全的所以，在字符串调用任何一个方法时候的都会加锁，用完之后解锁。
    * 例如：有一个StringBuffer sb ; 线程A在 执行sb.delete(3.10); 线程B在执行sb.append("hello");
    * 二者不会产生混乱。 无论是先执行delete还是先执行append，另外一个都处于等待状态。
    * StringBuilder是线程不安全的，在字符串调用方法的时候，不会加锁。 例如：有一个StringBuilder sb; 线程A在 执行sb.delete(3.10); 线程B在执行sb.append("hello"); 二者会产生混乱。
    *  最终解决可以是出乎意料的。不是先删除后拼接，也不是先拼接后删除，而一边删除一边拼接。
    * 实际开发中，几乎不会出现 多个线程同时使用一个变量的情况！
    * 在实际开发中，我们使用String更多一些，98%的情况下都使用String,偶尔用StringBuilder，几乎不用StringBuffer
    * */
}
