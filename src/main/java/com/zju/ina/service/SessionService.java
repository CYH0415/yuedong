package com.zju.ina.service;

import com.zju.ina.entity.Session;

import java.util.List;

public interface SessionService {
    List<Session> getSessionsByVenueID(String VenueID);
    int insertSession(Session session);
}