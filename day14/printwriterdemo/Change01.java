package com.lanou.day14.printwriterdemo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
* 字节流和字符流的转换
*
* */
public class Change01 {
    public static void main(String[] args) throws Exception {
        //字节流
        FileInputStream fileInputStream = new FileInputStream("D://upload/abc.txt");
        //将字节流转换为字符流
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        //字符流再使用装饰者装饰一下，可以按行读取
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line ;
        while ((line = bufferedReader.readLine())!=null){
            System.out.println(line);
        }
        bufferedReader.close();
        inputStreamReader.close();
        fileInputStream.close();

    }

}
