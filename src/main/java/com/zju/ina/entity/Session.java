package com.zju.ina.entity;

/**
 * @author 祝广程
 * @version 1.0
 */
public class Session {
    private String sessionID;
    private String venueID;
    private String area;
    private String date;
    private String startTime;
    private String endTime;
    private Double price;
    private int status;

    public Session(String sessionID, String venueID, String area, String date, String startTime, String endTime, Double price, int status) {
        this.sessionID = sessionID;
        this.venueID = venueID;
        this.area = area;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.price = price;
        this.status = status;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public String getVenueID() {
        return venueID;
    }

    public void setVenueID(String venueID) {
        this.venueID = venueID;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Session{" +
                "sessionID='" + sessionID + '\'' +
                ", venueID='" + venueID + '\'' +
                ", area='" + area + '\'' +
                ", date='" + date + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", price=" + price +
                ", status=" + status +
                '}';
    }
}
