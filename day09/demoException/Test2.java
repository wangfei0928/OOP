package com.lanou.day09.demoException;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        System.out.println("请输入1-7的数字:");
        int num = getNum(1,7);
        System.out.println(num);
    }

    public static int getNum(int min,int max){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num >max ||num < min){
            ValueOutOfLimitException exception = new ValueOutOfLimitException(num+"超过了["+min+max+"] 的范围") ;
            throw exception;
        }else {
            return num;
        }

    }
}
