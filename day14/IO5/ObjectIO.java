package com.lanou.day14.IO5;

import java.io.*;

public class ObjectIO {

    public static void main(String[] args) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream("D://upload/stu.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        Student student = new Student("张三",18);
        objectOutputStream.writeObject(student);

        objectOutputStream.flush();
        objectOutputStream.close();
        fileOutputStream.close();
    }
}
