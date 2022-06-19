package com.lanou.day07.demoString;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        /*
         * 需求：已知用户名(zhangsan)、密码(123456)
         * 模拟用户登录 用户从控制台输入用户名和密码，一共三次机会，根据输入情况给定相应的提示
         * */
        int count = 3;   //输入的最大次数
        String username = "zhangsan";
        String password = "123456";
        while (count > 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入用户名:");
            String user = scanner.nextLine();
            System.out.println("请输入密码");
            String psw = scanner.nextLine();
            count--;
            if (user.equals(username) && password.equals(psw)) {
                System.out.println("登录成功");
                break;
            } else {
                System.out.println("用户名或者密码错误。请重新输入(还剩)" + count + "次机会");
            }

        }
        printString();
    }
    public static void printString(){
        System.out.println("请输入一个字符串:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //遍历字符串的每一个字符
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
