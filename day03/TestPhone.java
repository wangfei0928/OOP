package com.lanou.day03;

public class TestPhone {
    public static void main(String[] args) {
        Phone phone = new Phone();  //1. 在栈区开辟一个地址， 2. 在堆区开辟一个地址 3. 给堆区赋初始值， 4.相等
        phone.brand = "IPhone 13 Pro Max";
        phone.color = "深空灰";
        phone.price = "8999";
        System.out.println(phone.brand);

        phone.call();
    }
}
