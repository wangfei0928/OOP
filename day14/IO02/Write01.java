package com.lanou.day14.IO02;

import java.io.FileWriter;
import java.io.IOException;

public class Write01 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("D://upload/abc.txt",true);
        fileWriter.write("你好世界");
        fileWriter.flush();
        fileWriter.close();
    }
}
