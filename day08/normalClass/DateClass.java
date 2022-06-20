package com.lanou.day08.normalClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/*
* Date类仅仅代表一个特定时间（包含年月日时分秒）。
* Calendar类可以设置以及获取时间（精细化控制）。
* SimpleDateFormat 实现String和Date的相互转换。
* */
public class DateClass {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);

        long timestamp = date.getTime();
        System.out.println(timestamp);

        Date date1 = new Date(1577689879789l);
        System.out.println(date1);
        System.out.println(date.after(date1));
        System.out.println(date.before(date1));

        /*
        * Date类创建一个指定时间，很麻烦。你得知道 指定的时间距离1970年1月1日0点0分0秒的毫秒数。否则创建不了。
        * 但是Calendar可以精确创建一个时间。Calendar的作用可以更精细化的控制时间。甚至可以包含时区
        * */
        Calendar calendar = Calendar.getInstance();
        //可以通过calendar操作时间
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);
        int day = calendar.get(Calendar.DATE);
        System.out.println(day);
        int hour = calendar.get(Calendar.HOUR);
        System.out.println(hour);
        long min = calendar.get(Calendar.MINUTE);
        System.out.println(min);
        long second =  calendar.get(Calendar.SECOND);
        System.out.println(second);


        //simpleDateFormat作用是实现字符串和日期的转换
        Date now = new Date();
        //y表示年  M表示月  d表示日、H表示小时、 m 分 s秒
        SimpleDateFormat simpleDateFormat =  new SimpleDateFormat("yyyy-MM-dd HH:mm-ss");
        SimpleDateFormat simpleDateFormat2 =  new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String dateStr = simpleDateFormat.format(now);
        String dateStr2 = simpleDateFormat2.format(now);
        System.out.println(dateStr);
        System.out.println(dateStr2);
        String str = "2022年06月16日 10时59分43秒";
        Date date2 = simpleDateFormat2.parse(str);
        System.out.println(date2);

    }



}
