package com.lanou.day14.IO5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectIOinput {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("D://upload/stu.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object o = objectInputStream.readObject();
        Student student = (Student) o;
        System.out.println(student);

        objectInputStream.close();
        fileInputStream.close();
    }
}
