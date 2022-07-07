package com.lanou.day09.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortTest {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("lanou");
        list.add("zhangsan");
        list.add("lisi");
        System.out.println(list);

       /* MyComparator comparator = new MyComparator();
        list.sort(comparator);
        System.out.println(list);*/

        //匿名内部类   匿名类的语法，类的创建和对象的创建同时进行    父类 对象= new 父类（）{重写父类方法，或者实现抽象方法}
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list);

//        MyComparator2 comparator2 = new MyComparator2();
//        list.sort(comparator2);

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
        System.out.println(list);
    }
}
