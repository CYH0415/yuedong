package com.zju.ina.entity;

import java.util.List;

/**
 * @author 祝广程
 * @version 1.0
 */
public class VenueInfo {
    private String venueID;
    private String venueName;
    private String venueAddr;
    private Double score;
    private List<Session> sessions;

    public VenueInfo(String venueID, String venueName, String venueAddr, Double score, List<Session> sessions) {
        this.venueID = venueID;
        this.venueName = venueName;
        this.venueAddr = venueAddr;
        this.score = score;
        this.sessions = sessions;
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

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }

    @Override
    public String toString() {
        return "VenueInfo{" +
                "venueID='" + venueID + '\'' +
                ", venueName='" + venueName + '\'' +
                ", venueAddr='" + venueAddr + '\'' +
                ", score=" + score +
                ", sessions=" + sessions +
                '}';
    }
}
