package com.zju.ina.entity;

/**
 * @author 祝广程
 * @version 1.0
 */
public class Venue {
    private String venueID;
    private String venueName;
    private String venueAddr;
    private Double score;

    public Venue(String venueID, String venueName, String venueAddr, Double score) {
        this.venueID = venueID;
        this.venueName = venueName;
        this.venueAddr = venueAddr;
        this.score = score;
    }

    public String getVenueID() {
        return venueID;
    }

    public void setVenueID(String venueID) {
        this.venueID = venueID;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getVenueAddr() {
        return venueAddr;
    }

    public void setVenueAddr(String venueAddr) {
        this.venueAddr = venueAddr;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Venue{" +
                "venueID='" + venueID + '\'' +
                ", venueName='" + venueName + '\'' +
                ", venueAddr='" + venueAddr + '\'' +
                ", score=" + score +
                '}';
    }
}
