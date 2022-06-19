package com.lanou.day07.demoinnerClass;

public class LocalityClass {

    public static void main(String[] args) {

        /*
        * 局部内部类和局部变量类似,定义在方法的内部、称为局部内部类
        * 局部内部类的作用域和局部变量类似，出了方法，就不能使用
        * 局部内部类就像是方法里的一个局部变量一样，不能有public、protected、private、以及static修饰的
        * */
        int x = 100;

        class AAA{
            private int a ;
            private  int b;

            public AAA() {
            }

            public AAA(int a, int b) {
                this.a = a;
                this.b = b;
            }

            public int getA() {
                return a;
            }

            public void setA(int a) {
                this.a = a;
            }

            public int getB() {
                return b;
            }

            public void setB(int b) {
                this.b = b;
            }

            @Override
            public String toString() {
                return "AAA{" +
                        "a=" + a +
                        ", b=" + b +
                        '}';
            }

            public void test(){
                System.out.println(a);
                System.out.println(x);
            }
        }
        AAA aaa = new AAA(10,20);
        aaa.test();
        System.out.println(aaa);

    }
    public static void method(){
//        AAA aaa = new AAA();
    }
}
