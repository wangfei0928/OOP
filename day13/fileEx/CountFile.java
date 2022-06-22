package com.lanou.day13.fileEx;

import java.io.File;

public class CountFile {
    private static int nun = 0;
    public static void main(String[] args) {
        File file = new File("D:/upload");
        countFile(file);
        System.out.println(nun);
    }

    public static void countFile(File file){
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()){
                nun++;
            }else {
                countFile(file1);
            }
        }
    }

}
