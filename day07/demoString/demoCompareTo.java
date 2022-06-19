package com.lanou.day07.demoString;

public class demoCompareTo {
    public static void main(String[] args) {

        String str100 = "hello world";
        String str101 = "hellO";
        int result = str100.compareTo(str101);  //从各自第一个字母开始比起，能比较出来结果，直接比较出来结果，如果相同，比较第二个字符，以此类推
        //结果如果是正值，说明前面的大，如果是负值，后面大。
        //结果是0，说明相等


        System.out.println(result);
        System.out.println(str100.compareToIgnoreCase(str101));

        String str1 = "我爱";
        String str2 = "我的祖国";
        String str3 = str1.concat(str2);
        System.out.println(str3);
        System.out.println(str1);
    }
}
