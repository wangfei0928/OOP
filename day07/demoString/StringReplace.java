package com.lanou.day07.demoString;

public class StringReplace {

    public static void main(String[] args) {
        String str = "hello world";
        String str2 = str.replace("o","a");
        System.out.println(str);    //String 是不可变字符串 所以内容不会改变
        System.out.println(str2);

        String str3 = "过年了,你妈妈逼逼你结婚了吗?";
        String str4 = str3.replace("妈逼","****");
        System.out.println(str3);
        System.out.println(str4);

        /*
        * 字符串的分割与合并
        * */
        String str5 = "河南省-郑州市-高新区";
        String [] arr = str5.split("-");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String str6 = String.join("-","2022","06","18");
        System.out.println(str6);

        String [] array = {"hello","world","zhongbei","java"};
        String str7 = "hello world 你好,世界";
        String subStr = str7.substring(2);
        System.out.println(subStr);
        String subStr2 = str7.substring(2,14);
        System.out.println(subStr2);
        System.out.println(str7);

        String str8 = "hello WoRld";
        String str9 = str8.toUpperCase();
        System.out.println(str8);
        System.out.println(str9);
        String str10 = str8.toLowerCase();
        System.out.println(str10);

        String str11 ="   hello   world    ";
        System.out.println(str11);
        String str12 = str11.trim();   //去除左右空白
        System.out.println(str12);
    }
}
