package com.lanou.day08.demostringbuilder;

public class demoStringBuilder {

    public static void main(String[] args) {

        //所谓的可变，指的是内容可以发生变化，(增、删、改、替换)

        //创建了一个空的字符串，初始容量为16  有一个字符组，容量为16，里面什么也没有，
        //初始的容量只是刚刚开始的容量，随着字符串的增加而增加，容量会翻倍的增长。  16--32-->63-->128
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder);
        stringBuilder.append("hello word!").append("java is best");
        System.out.println(stringBuilder);

        stringBuilder.insert(5,"我是一个爱学习的好学生").append(3.14);
        System.out.println(stringBuilder);

        stringBuilder.deleteCharAt(3);
        System.out.println(stringBuilder);

        stringBuilder.delete(3,6);
        System.out.println(stringBuilder);    //3 到6  不含6   【start,end ）

        stringBuilder.setCharAt(2,'中');
        System.out.println(stringBuilder);

        //String -> StringBuilder
        StringBuilder sb = new StringBuilder(stringBuilder);
        System.out.println(sb.append("哈哈"));
        System.out.println(sb.toString());


        StringBuilder str1 = new StringBuilder("hello world");
        StringBuilder str2 = new StringBuilder("hello World");
        String st1 = str1.toString();
        String st2 = str2.toString();
        System.out.println(str1==str2);
        System.out.println(st1.equals(st2));
        System.out.println(st1.equalsIgnoreCase(st2));


    }
}
