package com.lanou.day13.IOEx;

import java.io.FileInputStream;
import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("D:/upload02/abc.txt");
            int len ;
            int i = 0;
            int available = fileInputStream.available();
            byte[] bs = new byte[available];

            while ((len = fileInputStream.read()) != -1) {
                System.out.println((char) len);
                bs[i] = (byte) len;
                i++;
            }
            String s = new String(bs, "utf-8");
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fileInputStream.close();
        }
    }
}
