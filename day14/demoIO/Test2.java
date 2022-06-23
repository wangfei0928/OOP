package com.lanou.day14.demoIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D://upload/zm.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream("D://upload/zm2.jpg");

        int len = 0;
        byte bt[] = new byte[1024];
        while ((len=fileInputStream.read(bt))!=-1){
            fileOutputStream.write(bt,0,len);
        }


    }
}
