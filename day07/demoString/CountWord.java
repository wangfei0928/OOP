package com.lanou.day07.demoString;

import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        int small = 0;
        int big = 0;
        int num = 0;
        System.out.println("请输入一个串字符:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                small++;
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                big++;
            }else if (str.charAt(i) >='0' && str.charAt(i) <= '9'){
                num++;
            }
        }
        System.out.println("小写字母个数:" + small);
        System.out.println("大写字母个数:" + big);
        System.out.println("数字的个数:" + num);
    }
}
