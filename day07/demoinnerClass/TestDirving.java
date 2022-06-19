package com.lanou.day07.demoinnerClass;

public class TestDirving {

    public static void main(String[] args) {

        //实现类 势必要实现接口中定义的抽象方法，
        //如果一个实现类  仅仅是为了实现某个接口，并没有自己独特的行为，完全可以使用匿名内部类搞定
        Driving driving = new Teacher();
        driving.driver();

        Driving driving1 = new Student();
        driving1.driver();

        Driving driving2 = new Driving() {
            @Override
            public void driver() {
                System.out.println("厨师明天早上采购原材料");
            }
        };
        driving2.driver();
    }
}
