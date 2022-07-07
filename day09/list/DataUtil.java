package com.lanou.day09.list;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataUtil {

    private DataUtil(){}


    public static Date getDate(int year,int month,int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, day,0,0,0);
        return calendar.getTime();
    }

    public static Date getDate(int year,int month,int day,int hour,int minute,int second) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, day,hour,minute,second);
        return calendar.getTime();
    }
    public static String dateToString(String format,Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }
}
