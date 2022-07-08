package com.lanou.day10.demoset;

import java.util.*;

/*
* List的主要实现类有3个，ArrayList，LinkedList，Vector。他们都具有List接口中全部的方法。
* 在用法上3个实现类，一模一样。
* 只不过底层实现不同而已。
* ArrayList底层是一个数组，所以ArrayList的特点是  根据下标查找元素速度最快。增、删慢（增加和删除都需要移动已有元素。）
* LinkedList底层是一个双向链表，所以LinkedList的特点是： 增删快（无需移动元素，只需要改变元素的指向即可），根据下标查询元素慢。
* Vector底层实现也是数组，和ArrayList的区别是它的每一个方法实现都加了同步锁（在多线程环境下，
* 多个线程同时访问同一个vector的方法时，会出现等待，不会扰乱vector的执行）。所以Vector是多线程安全的，ArrayList是多线程不安全的。  Vector调用任何一个都需要加锁和解锁，所以很耗时（加锁和解锁需要耗时，加锁期间，其他方法在等待，无法执行）。ArrayList效率高。
* */
public class TestSet {

    public static void main(String[] args) {
        //Set是对数学中集合的抽象，Java中的set自动去重   除此之外，set还是无序的
        //创建一个空集合，集合的初始容量是16，加载因子是0.75
        //说明底层刚开始能够存放16个元素，当存放元素的个数达到16的0.75，12时，在存放第三个元素时，容量翻倍，变为32
        //当再次达到32的0.75时，级24 在存储25的时候，会扩容一倍，以此类推
        Set<String> set = new HashSet<>();
        Set<String> set2 = new HashSet<>(32,0.8f);  //初始容量时32   容量达到80%扩容
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("lanou");
        boolean b = set.add("haha");  //添加元素是否成功
        System.out.println(b);
        System.out.println(set);

        List<String>list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("lanou");
        list.add("hello");
        list.add("数学");
        list.add("蓝鸥");
        System.out.println(list);
        set.addAll(list);
        System.out.println(set);
        Set<String> set1 = new HashSet<>(list);
        System.out.println(set1);
//        set.removeAll(list);
        System.out.println(set);

        System.out.println(set.contains("haha"));

        //不能使用普通的for循环遍历   ---因为set没有下标，无法通过下标获取元素、
        //遍历循环
        for (String str: set){
            System.out.println(str);
        }

        //用迭代器遍历
        Iterator <String> iterator = set.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }

    }
}
