package com.lanou.day08.demoPackageClass;

public class test {
    public static void main(String[] args) {
        //包装类：8种基本数据类型对应的类类型
        //byte short int long     float double char boolean
        //基本数据类型有缺陷，后面学习集合框架，不能存储基本数据类型
        //对应关系
        //基本数据类型             类类型
        // byte                  Byte
        // int                   Integer
        // short                 Short
        // long                  Long
        // boolean              Boolean
        //  float               Float
        // double               Double
        //  char                Character


//        Int i = new Int(100);
//        System.out.println(i);
//        System.out.println(Int.MAX_VALUE);
//        System.out.println(Int.Min_VALUE);

        /*
         * 自动装箱和自动拆箱
         * 自动装箱   基本数据类型---->对象类型  无需写任何代码，自动完成
         * */
        Integer integer = 100;     //自动装箱   编译器的功能  在底层，编译器会把代码补全 系统还原成正常写法
        Integer integer1 = new Integer(100);    //正常写法

        //自动拆箱      对象类型 --->还原成基本类型
        int x = integer1;
        System.out.println(x+10);

        Integer  y = integer + 20;      //先把integer拆箱 int 100   100+20 =120  装箱  Integer
        //有了自动拆箱和自动装箱，可以认为他们为同一类型

        //类型转换
        //基本数据类型  和  包装类的转换
        //自动装箱和自动拆箱

        //基本数据类型和  String字符串累心的转换
        //基本数据类型---->String
        int m = 100;
        String strM = Integer.toString(m);
        System.out.println(strM);
        String strM2 = ""+m;   //推荐
        System.out.println(strM2);

        //如何把字符串变成基本数据类型
        //String --->基本数据类型   超级重点
        int m2 = Integer.parseInt(strM2);
        System.out.println(m2/2);

        String str = "3.1415";
        double d1 = Double.parseDouble(str);
        float f = Float.parseFloat(str);
        System.out.println(d1+1);

        //包装类和String的互转
        //包装类---->String
        Integer num = 100;
        String strNum = num.toString();
        System.out.println(strNum+100);

//        String--->Integer
        Integer num2 = new Integer(strNum);
        System.out.println(num2+2);

        Integer num3 = Integer.valueOf(strNum);
        System.out.println(num3+2);

    }
}
