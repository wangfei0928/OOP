package com.lanou.day14.demoIO;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D://upload/abc.txt",true);
        String str = "I Love you";
        fileOutputStream.write(str.getBytes());
        fileOutputStream.flush();
        fileOutputStream.close();

    }
}
