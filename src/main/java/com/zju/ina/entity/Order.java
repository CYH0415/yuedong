package com.zju.ina.entity;

/**
 * @author 祝广程
 * @version 1.0
 */
public class Order {
    private String orderID;
    private String openID;
    private String venueID;
    private String sessionID;
    private Double money;
    private int status;
    private String time;

    public Order(String orderID, String openID, String venueID, String sessionID, Double money, int status, String time) {
        this.orderID = orderID;
        this.openID = openID;
        this.venueID = venueID;
        this.sessionID = sessionID;
        this.money = money;
        this.status = status;
        this.time = time;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getOpenID() {
        return openID;
    }

    public void setOpenID(String openID) {
        this.openID = openID;
    }

    public String getVenueID() {
        return venueID;
    }

    public void setVenueID(String venueID) {
        this.venueID = venueID;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID='" + orderID + '\'' +
                ", openID='" + openID + '\'' +
                ", venueID='" + venueID + '\'' +
                ", sessionID='" + sessionID + '\'' +
                ", money=" + money +
                ", status=" + status +
                ", time='" + time + '\'' +
                '}';
    }
}
