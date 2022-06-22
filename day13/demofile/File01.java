package com.lanou.day13.demofile;

import java.io.File;

/*
* 假设自己是JVM，进入是输入，出去是输出
* 先学文件，后学IO
* */
public class File01 {

    public static void main(String[] args) {
        File file = new File("D:/upload02/AAA");
//        file.mkdir();   //创建此抽象路径名指定的目录。  只能创建一级目录
        System.out.println(file);
        boolean isEx = file.exists();
        String parent = file.getParent();
        System.out.println(parent);
        if (!isEx){
            file.mkdirs();   //可以创建一级或多级目录
        }else {
//            file.delete();
        }
        System.out.println(isEx);
    }
}
