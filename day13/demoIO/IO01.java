package com.lanou.day13.demoIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IO01 {

    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("D:/upload02/abc.txt");
           int byteNumber = fileInputStream.available();
            System.out.println("文件的字节数"+byteNumber);
            /* int result = fileInputStream.read();
            System.out.println((char) result);
            int result2 = fileInputStream.read();
            System.out.println((char) result2);
            int result3 = fileInputStream.read();
            System.out.println((char) result3);
            int result4 = fileInputStream.read();
            System.out.println(result4);*/
            int len ;
            byte[] bs = new byte[9];
            int i = 0;
            while ((len = fileInputStream.read())!=-1){
                System.out.println((char) len);
                bs[i] = (byte) len;
                i++;
            }

            //怎么处理汉字
            String s = new String(bs,"utf-8");
            System.out.println(s);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
