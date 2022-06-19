package com.lanou.day07.demoString;
/*
* 在实际开发中 ，都是判断字符串内容是否相等，所以 使用equals(xx)或者equalsIgnoreCase(xx)方法
* */
public class string1 {
    public static void main(String[] args) {
        //任何用双引号引起来的
        String str = "hello";
        System.out.println("world");

        //创建一个空字符串
//        String str1 = new String();
        String str1 = "";    //上面的一行代码用这行代替
        System.out.println(str1 );

        byte[] arr = new byte[]{65,66,67,68};
        //通过字节数组创建字符串，一般在IO流中(读取以及写入文件),文件是二进制的
        //读出来之后，会读出是一个byte数组中，我们可以通过下面的方法把文件内容以字符串的形式呈现。
        String str2 = new String(arr);
        String str3 = new String(arr,1,2);
        System.out.println(str2);
        System.out.println(str3);


        char[] chs = {'a','b','c','d','e'};
        String str4 = new String(chs);  //str1存的是堆区地址
        String str5 = new String(chs);  //str2存的也是堆区地址
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str4 == str5);   //false

        String str6 = "abc";
        String str7 = "abc";
        System.out.println(str6 == str7);   //true

        String str8 = "hel";
        String str9 = "lo";
        String str10 = "hello张三";
        String str11 = str8 + str9;
        System.out.println(str10 == str11);  //false
        System.out.println(str11.length());
        System.out.println(str10.charAt(6));

        String str12 = "hello world";
        System.out.println(str12.contains("orld"));
        System.out.println(str12.startsWith("hel"));
        System.out.println(str12.startsWith("llo",2));
        System.out.println(str12.endsWith("orld"));






    }


}
