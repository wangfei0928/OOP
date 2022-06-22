package com.lanou.day13.demofile;

import java.io.File;
import java.io.IOException;

public class File03 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/upload02/abc.txt");
        if (!file.exists()){
            file.createNewFile();  //创建文件
        }
        long length =  file.length();
        System.out.println(length);
        System.out.println(file.getName());

        System.out.println(file.isFile());//是否是一个文件
        System.out.println(file.isDirectory());  //是否是一个目录
    }
}
