package com.lanou.day14.printwriterdemo;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriter01 {

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("D://upload/abc.txt");
        printWriter.print("hello");
        printWriter.print("java");
        printWriter.println("ABCCC");
        printWriter.println("阿斯蒂芬");

        printWriter.append("anc");
        printWriter.append("1233");
        printWriter.flush();
        printWriter.close();
    }
}
