package com.lanou.day13.demoIO;

import java.io.FileInputStream;
import java.io.IOException;

public class IO03 {
    public static void main(String[] args) throws IOException {
       FileInputStream fileInputStream = new FileInputStream("D:/upload02/abc.txt");

       byte[] buf = new byte[3];

       int len ;
       while ((len = fileInputStream.read(buf))!=-1){ //使用缓存区，
           String s = new String(buf,0,len);
           System.out.print(s);
       }
       /*
       int result = fileInputStream.read(buf);
       System.out.println("读入buff的字节数"+result+",内容是"+ Arrays.toString(buf));

        int result2 = fileInputStream.read(buf);
        System.out.println("读入buff的字节数"+result2+",内容是"+ Arrays.toString(buf));

        int result3 = fileInputStream.read(buf);
        System.out.println("读入buff的字节数"+result3+",内容是"+ Arrays.toString(buf));

        int result4 = fileInputStream.read(buf);
        System.out.println("读入buff的字节数"+result4+",内容是"+ Arrays.toString(buf));
        */

       fileInputStream.close();
    }
}
