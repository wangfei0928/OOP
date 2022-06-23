package com.lanou.day14.IO5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestFileInputStream {
    public static void main(String args[]) throws FileNotFoundException {
        FileInputStream fin = new FileInputStream("test.txt");
        try{
            System.out.println( fin.read() );
            fin.close();
        }catch(Exception e){}
    }
}
