package com.lanou.day07.demoinnerClass;

import java.util.Scanner;

public class Tihuan {
    public static void main(String[] args) {
        replace();
    }
    public static void replace(){
        String [] str1 = {"妈逼","傻逼","婊子","草"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一段文字");
        String print  = scanner.nextLine();
        for (int i =0;i< str1.length;i++){
            print = print.replace(str1[i],"**" );
        }
        System.out.println(print);
    }
}
