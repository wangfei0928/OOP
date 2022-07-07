package com.lanou.day09.list;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {

        /*
        * ArrayList他的底层是一个数组，并且这个数组的大小可以改变
        * */
        //List是有序列表(有序容器),有下标的概念
        List<String> list = new ArrayList<>();
//        List list1 = new ArrayList();     不写<>可以存放任何任意类型的元素
        list.add("hello");
        list.add("world");
        list.add("lanou");
        list.add("zhansan");
        System.out.println(list);
        boolean b = list.add("lisi");
        System.out.println(b);
        System.out.println(list);

        list.remove("lisi");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
//        list.clear();
//        System.out.println(list);

        Person person = new Person("张三",20);
        System.out.println(person);

        List<String> list1 = new ArrayList<>();
        list1.addAll(list);
        System.out.println(list1);
        System.out.println(list.size());

        System.out.println(list.contains("hello"));
        System.out.println(list.contains("hah"));
        System.out.println(list.isEmpty());

        list.add("hello");
        System.out.println(list.indexOf("lanou"));
        System.out.println(list.indexOf("hello"));   //如果有多个相同的元素类型，只返回第一个
        System.out.println(list.lastIndexOf("hello"));   //返回最后一个hello
        System.out.println("---------------");
        System.out.println(list);
        List<String> subList = list.subList(0,3);   //包含0 但不包含3

        System.out.println(subList);

        Object[] arr =  list.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        List<String> list2 = new ArrayList<>(list);
        System.out.println(list2);

    }
}
