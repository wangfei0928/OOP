package com.lanou.day07.demoString;

import java.util.Random;
import java.util.Scanner;

public class IdentifyingCode {
    public static void main(String[] args) {
        /*
        * 需求：随机生成一个6位的验证码，判断用户从控制台录入的验证码是否正确。
                1.你要生成一个验证码。
                2.获取用户输入的字符串
                3.判断用户输入的是否正确。
        * */
        //定义一个验证码包含允许的字符
        String str = "ABCDEFGHIGKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        String code = "";
        for (int i = 0; i < 6; i++) {
            int index = random.nextInt(str.length());
            char c = str.charAt(index);
            code += c;
        }
        System.out.println(code);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入验证码:");
        String str2 = scanner.next();
        if (str2.equalsIgnoreCase(code)){
            System.out.println("验证成功");
        }else {
            System.out.println("验证失败");
        }


    }
}
