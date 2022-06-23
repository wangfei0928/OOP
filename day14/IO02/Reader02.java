package com.lanou.day14.IO02;

import java.io.FileReader;
import java.io.IOException;

public class Reader02 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("D://upload/abc.txt");
        char[] buff = new char[3];
        int len ;
        while ((len = fileReader.read()) != -1) {
            String str = new String(buff,0,len);
            System.out.println(str);
        }
        fileReader.close();
    }
}
