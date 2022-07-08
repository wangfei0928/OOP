package com.lanou.day10.demoset;

import java.util.LinkedHashSet;
import java.util.Set;
/*
* LinkedHashSet是HashSet的子类。 说明LinkedHashSet具有HashSet全部的方法。
* LinkedHashSet可以维持添加的顺序。先添加的在前面，后添加的在后面。
*
* HashSet使用次数比LinkedHashSet更频繁。 原因是：即使LinkedHashSet能保持添加顺序，也取不出来数据，没有get方法。
* 在开发种如果需要保持添加顺序，请选择LinkedHashSet ， 如果不需要保持添加顺序，使用HashSet.
* */
public class TestPersonLink {
        public static void main(String[] args) {
            Person p1 = new Person("张三",1);
            Person p2 = new Person("李四",22);
            Person p3 = new Person("王五",2);
            Person p4 = new Person("张三",1);
            //HashSet实现去重的原理
            //第一步 查看 元素的hashCode()是否相等，如果不相等，则不认为重复
            //如果相等，进入第二步
            //第二步：
            Set<Person> set = new LinkedHashSet<>();
            set.add(p1);
            set.add(p2);
            set.add(p3);
            set.add(p4);
//        System.out.println(b);
//            set.remove(p4);
            System.out.println(set);
        }
}
