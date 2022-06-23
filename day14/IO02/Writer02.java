package com.lanou.day14.IO02;

import java.io.FileWriter;

public class Writer02 {
    public static void main(String[] args) throws Exception{

        FileWriter fileWriter = new FileWriter("D://upload/abc.txt",true);
        String s = "hello zhongbei";
        char[] chars = s.toCharArray();  //把字符串转成字符数组
        fileWriter.write(chars);
        fileWriter.write("\n");   //手动换行

        fileWriter.flush();
        fileWriter.close();
    }
}
