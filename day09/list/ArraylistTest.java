package com.lanou.day09.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArraylistTest {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("lisi");
        list.add("王五");
        list.add("zhaoliu");

        System.out.println(list);
        //方法一：普通的for循环
        for (int i = 0;i<list.size();i++){
            System.out.print(list.get(i)+" ");

        }
        System.out.println();
        System.out.println("---------------------");
        //方法二:迭代器遍历
        //1.  通过list获取迭代器对象
        Iterator<String> iterator = list.iterator();
        iterator.next();
        iterator.remove();  //删除当前位置的元素
        System.out.println(list);
        // 2. 通过while循环遍历元素   迭代器本身除了能找到元素外，还可以删除元素
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }

        System.out.println("---------------------");
        //方法三:增强for循环
        //增强for循环是迭代器遍历的简化写法，本质上是迭代器的遍历
        for(String str:list){   //冒号左侧：每次循环找到的元素  冒号右侧  需要遍历的列表
            System.out.println(str);
        }
        System.out.println("---------------------");
        ListIterator<String> listIterator = list.listIterator();
//        System.out.println(listIterator.hasNext());
//        System.out.println(listIterator.next());
//        listIterator.next();
//        System.out.println(listIterator.hasPrevious());

        while (listIterator.hasNext()){
            String name = listIterator.next();
            if (name.equals("lisi")){
                listIterator.set("哈哈");
            }
        }
        System.out.println(list);
    }
}
