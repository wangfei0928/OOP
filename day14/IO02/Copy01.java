package com.lanou.day14.IO02;

import java.io.FileReader;
import java.io.FileWriter;

public class Copy01 {
    public static void main(String[] args) throws Exception {
        FileReader fileReader = new FileReader("D://upload/abc.txt");
        FileWriter fileWriter = new FileWriter("D://upload/aaa.txt",true);

        int len;
        while ((len = fileReader.read())!=-1){
            fileWriter.write(len);
        }
        fileWriter.flush();
        fileWriter.close();
        fileReader.close();
    }
}
