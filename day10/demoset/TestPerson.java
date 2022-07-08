package com.lanou.day10.demoset;

import java.util.HashSet;
import java.util.Set;
/*
* HashSet去重原理：
* 第一步：遍历已有元素,让每一个元素和 要添加的元素 比较HashCode的值，是否相等，如果相等，进入第二步，如果不相等，则认为不重复
* 第二步：判断元素.equals(要添加元素)的值是否重复，如果是true，则认为重复，如果是false则认为不重复
*
*
* 面试题：
有一堆数据，数量很多，但你是不知道里面是否有重复的数据。你有什么办法判断这堆数据里是否有重复数据？
* 创建一个List，把所有数据存入list中。
然后创建一个Set，把list作为构造方法参数。
如果set的size()和list的size() 值相等 说明没有重复数据，如果二者不同，说明有重复数据。
---之所以不同，是因为数据存入set之后，被去重了，所有size会变小。
*
* HashSet是一个无序元素不重复的容器。
可以添加元素  add(e)   addAll(colletion)
可以删除元素 remove(e)  removeAll(collection)
不能获取元素  没有get方法
可以迭代  iterator()
可以获取元素个数  size()
可以判断是否为空 isEmpty()
*
* ，唯一需要注意的就是   自定义类型，需要添加equals和hashcode方法！
* */
public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("张三",1);
        Person p2 = new Person("李四",22);
        Person p3 = new Person("王五",2);
        Person p4 = new Person("张三",1);
        //HashSet实现去重的原理
        //第一步 查看 元素的hashCode()是否相等，如果不相等，则不认为重复
        //如果相等，进入第二步
        //第二步：
        Set<Person> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.remove(p4);
        System.out.println(set);
    }
}
