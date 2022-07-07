package com.lanou.day09.demoException;

public class mianshi {
    public static void main(String[] args) {
//        int result = test1();
//        int result = test2();
//        int result = test3();
        int result = test4();
        System.out.println(result);
    }

    private static int test4() {
        int i = 1;
        try{
            i++;
            System.out.println("try block,i="+i);
            return i;
        }catch (Exception e){
            i++;
            System.out.println("catch block,i="+i);
            return i;
        }finally {
            i++;
            System.out.println("finally block,i = "+i);
            return i;
        }

    }

    private static int test3() {
        int i = 1;
        try{
            i++;
            System.out.println("try block,i="+i);
            return i;
        }catch (Exception e){
            i--;
            System.out.println("catch block,i="+i);
            return i;
        }finally {
            i = 10;
            System.out.println("finally block,i = "+i);
        }

    }

    private static int test2() {
        int i = 1;
        try{
            i++;
            throw  new Exception();
        }catch (Exception e){
            i--;
            System.out.println("catch block i=" +i);
        }finally {
            i = 10;
            System.out.println("finally block i= "+i);
        }
        return i;
    }

    private static int test1() {
        int i = 1;
        try{
            i++;
            System.out.println("try block,i="+i);
        }catch (Exception e){
            i--;
            System.out.println("catch block,i="+i);
        }finally {
            i = 10;
            System.out.println("finally block,i = "+i);
        }
        return i;
    }
}
