package com.lanou.day03;

import java.util.Date;

public class Ticket {
    /*
    * 定义一个火车票类,包含 出发站,到达站,出发时间,身份证号,票价,座位号,车次等信息, 并为这个类提供一个打印火车票信息的方法
    * */
    private String departureStation;
    private String arrivalStation;
    private Date startTime;
    private String identityId;
    private double price;
    private Integer seatId;
    private Integer trainNum;

    public void printTicket(){

        System.out.println("出发站"+departureStation);
        System.out.println("到达站"+arrivalStation);
        System.out.println("出发时间"+startTime);
        System.out.println("身份证号"+identityId);
        System.out.println("票价"+price);
        System.out.println("座位号"+seatId);
        System.out.println("车次"+trainNum);


    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(String arrivalStation) {
        this.arrivalStation = arrivalStation;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getIdentityId() {
        return identityId;
    }

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getSeatId() {
        return seatId;
    }

    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }

    public Integer getTrainNum() {
        return trainNum;
    }

    public void setTrainNum(Integer trainNum) {
        this.trainNum = trainNum;
    }
}
