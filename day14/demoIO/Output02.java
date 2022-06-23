package com.lanou.day14.demoIO;

import java.io.FileOutputStream;
import java.io.IOException;

public class Output02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D://upload/abc.txt");
        byte [] buff = {65,66,67,68,69,70};
        fileOutputStream.write(buff,2,2);
        fileOutputStream.flush();
        fileOutputStream.close();
    }
}
