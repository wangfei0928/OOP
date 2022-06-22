package com.lanou.day13.demofile;

import java.io.File;

public class File04 {
    public static void main(String[] args) {
        File file = new File("D:/upload02");
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getName()+"是文件吗"+file1.isFile());
        }
    }
}
