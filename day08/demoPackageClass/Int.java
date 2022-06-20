package com.lanou.day08.demoPackageClass;

public class Int {

    public static final int MAX_VALUE = (int)(Math.pow(2,666666));
    public static final int Min_VALUE = (int)(-Math.pow(2,31));
     int i ;

    public Int() {
    }

    public Int(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Int{" +
                "i=" + i +
                '}';
    }

    public byte byteValue(){
        return (byte)i;
    }
    public int  value(){
        return i;
    }

    public short shortValue(){
        return (short)i;
    }
    public long longValue(){
        return i;
    }

    public static int max(int a,int b){
        return  a>b? a:b;
    }
    public static int min(int a,int b){
        return   a<b? a:b;
    }
    public static int sum(int a,int b){
        return   a+b;
    }
    public int compareTo(Int b){
        if (i > b.value()){
            return 1;
        }else if (i < b.value()){
            return -1;
        }else {
            return 0;
        }
    }

}
