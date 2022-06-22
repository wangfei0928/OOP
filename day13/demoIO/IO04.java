package com.lanou.day13.demoIO;

import java.io.FileInputStream;
import java.io.IOException;

public class IO04 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:/upload02/abc.txt");
        byte[] buff = new byte[15];
        int start = 0;
        int len = 0;
        while ((len = fileInputStream.read(buff,start,3))!=-1){
            System.out.println();
        }
        /*int read = fileInputStream.read(buff, 3, 3);
        System.out.println("返回值是："+read+"buff的内容是"+ Arrays.toString(buff));

        int read2 = fileInputStream.read(buff, 3, 3);
        System.out.println("返回值是："+read2+"buff的内容是"+ Arrays.toString(buff));

        int read3 = fileInputStream.read(buff, 3, 3);
        System.out.println("返回值是："+read3+"buff的内容是"+ Arrays.toString(buff));

        int read4 = fileInputStream.read(buff, 3, 3);
        System.out.println("返回值是："+read4+"buff的内容是"+ Arrays.toString(buff));*/
    }



}
