package com.lanou.day09.list;

import java.util.Date;
import java.util.Objects;

/*
* 飞机票类
* */
public class Ticket {

    private String fromPlace;   //出发地
    private String toPlace;    //到达地
    private Integer price;    //价钱
    private Date date;       //出发时间

    public Ticket() {
    }

    public Ticket(String fromPlace, String toPlace, Integer price, Date date) {
        this.fromPlace = fromPlace;
        this.toPlace = toPlace;
        this.price = price;
        this.date = date;
    }

    public String getFromPlace() {
        return fromPlace;
    }

    public void setFromPlace(String fromPlace) {
        this.fromPlace = fromPlace;
    }

    public String getToPlace() {
        return toPlace;
    }

    public void setToPlace(String toPlace) {
        this.toPlace = toPlace;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "fromPlace='" + fromPlace + '\'' +
                ", toPlace='" + toPlace + '\'' +
                ", price=" + price +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(fromPlace, ticket.fromPlace) && Objects.equals(toPlace, ticket.toPlace) && Objects.equals(price, ticket.price) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromPlace, toPlace, price, date);
    }
}
