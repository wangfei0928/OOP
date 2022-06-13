package com.lanou.day05.demoStatic;

public class Test {
    public static void main(String[] args) {
        A aa = new A(10,100);

        System.out.println(aa);

        A bb  = new A(100,20);
        System.out.println(bb);
    }

    /*
    * 在静态方法中，不能直接访问非静态属性，以及非静态方法
    * 静态方法和静态属性一样，会随着类的加载而加载
    * 在对象还没有创建的时候，方法已经被加载到内存中
    * 如果我们此时调用了静态方法，假设静态方法中有实例变量的使用代码
    * */
}
