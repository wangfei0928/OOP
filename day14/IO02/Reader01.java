package com.lanou.day14.IO02;

import java.io.FileReader;
import java.io.IOException;

public class Reader01 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("D://upload/abc.txt");

        int len = 0;
        while ((len = fileReader.read())!=-1){
            System.out.println((char)len);
        }
//        int res = fileReader.read();
//        System.out.println((char)res);
//
//        int res2 = fileReader.read();
//        System.out.println(res2);
//
//        int res3 = fileReader.read();
//        System.out.println(res3);
//
//        fileReader.close();
    }
}
