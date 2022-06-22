package com.lanou.day13.demoIO;

import java.io.FileOutputStream;
import java.io.IOException;

public class IO05 {

    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("D:/upload02/abc.txt",true);
        fileOutputStream.write(65);

        String s = "你好 世界";
        fileOutputStream.write(s.getBytes());  //可以写多个

        fileOutputStream.flush();//刷新， 本地文件的操作，不添加也没关系，跨网络传输，必须写flush
        fileOutputStream.close();//关流

    }
}
