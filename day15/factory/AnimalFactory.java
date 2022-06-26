package com.lanou.day15.factory;

import java.lang.reflect.Method;

public class AnimalFactory {
    public Object getAnimalInstance(String msg) throws Exception {
        Class<?> c = Class.forName(msg);
        Object o = c.newInstance();  //创建出来的动物对象
        return o;
    }

    public void doEat(Object o,String msg) throws Exception{
        Class<?> c = Class.forName(msg);
        Method method = c.getMethod("eat");
        method.invoke(o);
    }
}
