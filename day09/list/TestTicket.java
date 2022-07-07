package com.lanou.day09.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestTicket {

    public static void main(String[] args) {
        List<Ticket> list = new ArrayList<>();
        Ticket ticket = new Ticket("上海","北京",688,DataUtil.getDate(2022,6,17,9,18,0));
        Ticket ticket1 = new Ticket("上海","北京",788,DataUtil.getDate(2022,6,17,10,30,0));
        Ticket ticket2 = new Ticket("上海","北京",720,DataUtil.getDate(2022,6,17,9,40,0));
        Ticket ticket3 = new Ticket("上海","北京",688,DataUtil.getDate(2022,6,17,10,10,0));

        list.add(ticket);
        list.add(ticket1);
        list.add(ticket2);
        list.add(ticket3);
        System.out.println(list);

        list.sort(new Comparator<Ticket>() {
            @Override
            public int compare(Ticket o1, Ticket o2) {
                return o1.getPrice() - o2.getPrice();//按价钱排序 升序
            }
        });
        //按价钱排序 升序
        System.out.println(list);

        list.sort(new Comparator<Ticket>() {
            @Override
            public int compare(Ticket o1, Ticket o2) {
                return o2.getPrice() - o1.getPrice();//按价钱排序 降序
            }
        });
        //按价钱排序 降序
        System.out.println(list);

        list.sort(new Comparator<Ticket>() {
            @Override
            public int compare(Ticket o1, Ticket o2) {
                return o1.getDate().compareTo(o2.getDate());  //按照时间升序
            }
        });
        System.out.println(list);//按照时间升序

        list.sort(new Comparator<Ticket>() {
            @Override
            public int compare(Ticket o1, Ticket o2) {
                return o2.getDate().compareTo(o1.getDate());  //按照时间降序
            }
        });
        System.out.println(list);//按照时间降序


        //按照价钱升序，价钱相同时，按照时间升序
        list.sort(new Comparator<Ticket>() {
            @Override
            public int compare(Ticket o1, Ticket o2) {
                int price1 = o1.getPrice();
                int price2 = o2.getPrice();
                if (price1 == price2){
                    return o1.getDate().compareTo(o2.getDate());
                }else {
                    return price1 - price2;
                }
            }
        });
        System.out.println("---"+list);


        System.out.println(list.contains(ticket1));
        Ticket ticket4 = new Ticket("上海","北京",688,DataUtil.getDate(2022,6,17,9,18,0));
        System.out.println(list.contains(ticket4));
        System.out.println(ticket1.equals(ticket2));
    }
}
