package com.lanou.day13.demofile;

import java.io.File;

public class File02 {
    public static void main(String[] args) {
        File file = new File("D:/upload");

        //得到文件夹下所有的文件和文件夹的名称
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-------------");

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
