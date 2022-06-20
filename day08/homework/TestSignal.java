package com.lanou.day08.homework;

import java.util.Scanner;

public class TestSignal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入信号灯(RED,GREEN,YELLOW)");
        Signal signal = Signal.valueOf(scanner.next());

        switch (signal){
            case RED:
                System.out.println("红灯停");
                break;
            case GREEN:
                System.out.println("绿灯行");
                break;
            case YELLOW:
                System.out.println("黄灯亮了等一等");
                break;
        }
    }
}
