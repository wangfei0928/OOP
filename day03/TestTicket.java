package com.lanou.day03;

import java.util.Date;

public class TestTicket {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        ticket.setDepartureStation("中北大学");
        ticket.setArrivalStation("前程似锦站");
        ticket.setStartTime(new Date());
        ticket.setIdentityId("1111111111111111111");
        ticket.setSeatId(006);
        ticket.setTrainNum(666);
        ticket.printTicket();

    }
}
