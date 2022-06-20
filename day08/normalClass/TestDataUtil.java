package com.lanou.day08.normalClass;

import java.util.Date;

public class TestDataUtil {
    public static void main(String[] args) {
        Date date = DataUtil.getDate(2021,8,15);
        System.out.println(date);

        Date date2 = DataUtil.getDate(2008,8,8,8,0,8);
        System.out.println(date2);
    }
}
