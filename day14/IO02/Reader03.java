package com.lanou.day14.IO02;

import java.io.FileReader;
import java.io.IOException;

public class Reader03 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("D://upload/abc.txt");
        char [] chars= new char[5];
        int len;
        while ((len=fileReader.read()) != -1){
            String str = new String(chars);
            System.out.println(str);
        }
        fileReader.close();
    }
}
