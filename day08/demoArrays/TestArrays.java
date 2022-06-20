package com.lanou.day08.demoArrays;

import java.util.Arrays;

public class TestArrays {

    /*
    * 多数工具类都是对外提供静态方法
    * */
    public static void main(String[] args) {


        int arr[] = {36,17,5,8,56,3,9};
        //如果打印一个数组，不需要再写循环了
        String arrStr = Arrays.toString(arr);
        System.out.println(arrStr);

        double arr2[] = {36.4,17.2,5.1,8.4,56.6,3.8,9.1};
        System.out.println(Arrays.toString(arr2));

//        Arrays.sort(arr); //排序
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr,1,4);  //[1,4)
        System.out.println(Arrays.toString(arr));

        //折半查找，要求数组必须有序
        int index = Arrays.binarySearch(arr,5);
        System.out.println(index);

        int index2 = Arrays.binarySearch(arr,2,6,17);
        System.out.println(index2);

        int [] arr3 = Arrays.copyOf(arr,10);   //数组拷贝
        System.out.println(Arrays.toString(arr3));

        int [] arr4 = Arrays.copyOfRange(arr,2,6);
        System.out.println(Arrays.toString(arr4));

        System.out.println(Arrays.equals(arr,arr4));

        int [] array = new int[10];
//        Arrays.fill(array,100);
        System.out.println(Arrays.toString(array));

        Arrays.fill(array,2,7,100);
        System.out.println(Arrays.toString(array));
    }
}
