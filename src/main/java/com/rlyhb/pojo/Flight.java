package com.rlyhb.pojo;

import java.sql.Date;
import java.sql.Time;

public class Flight {
    private String fid;//航班号
    private String origin;//出发地
    private String destination;//目的地
    private Date bDate;//出发日期
    private String bTime;//出发时间
    private Integer seatCount;//座位数
    private String price;//价格
    private float fsr=0;//满座率

    public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getbDate() {
        return bDate;
    }

    public void setbDate(Date bDate) {
        this.bDate = bDate;
    }

    public String getbTime() {
        return bTime;
    }

    public void setbTime(String bTime) {
        this.bTime = bTime;
    }

    public Integer getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(Integer seatCount) {
        this.seatCount = seatCount;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public float getFsr() {
        return fsr;
    }

    public void setFsr(float fsr) {
        this.fsr = fsr;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "fid='" + fid + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", bDate=" + bDate +
                ", bTime='" + bTime + '\'' +
                ", seatCount=" + seatCount +
                ", price='" + price + '\'' +
                ", fsr=" + fsr +
                '}';
    }
}
