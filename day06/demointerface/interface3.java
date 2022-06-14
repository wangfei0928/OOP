package com.lanou.day06.demointerface;

//实现类可以实现多个接口，接口与接口之间用逗号分隔。
//实现类需要实现所有接口中所有的抽象方法。
/*
* 接口可以继承别的接口，而且可以继承多个接口。  实现类需要实现 接口中所有的抽象方法，还需要实现父接口中所有的抽象方法。
* */
public interface interface3 extends interface1,interface2{

    public void test3();
}
