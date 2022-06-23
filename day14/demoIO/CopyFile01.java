package com.lanou.day14.demoIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile01 {
    public static void main(String[] args) throws IOException {
        //输入流是不会创建文件的
        FileInputStream fileInputStream = new FileInputStream("D://upload/zm.jpg");
        //输出流如果没有文件，会帮我们创建文件,如果有，就会使用
        FileOutputStream fileOutputStream = new FileOutputStream("D://upload/zm2.jpg");

        long start = System.currentTimeMillis();
        int len ;
        while ((len=fileInputStream.read())!=-1){
            fileOutputStream.write(len);
        }

        long end = System.currentTimeMillis();
        System.out.println("运行时间:"+(end-start));
        fileOutputStream.flush();
        fileOutputStream.close();
        fileInputStream.close();
    }
}
