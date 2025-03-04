package com.zju.ina.service.impl;

import com.zju.ina.entity.Session;
import com.zju.ina.mapper.SessionMapper;
import com.zju.ina.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SessionServiceImpl implements SessionService {
    @Autowired
    private SessionMapper sessionMapper;

    @Override
    public List<Session> getSessionsByVenueID(String VenueID) {
        List<Session> sessionList = sessionMapper.getSessionsByVenueID(VenueID);
        return sessionList;
    }

    @Override
    public int insertSession(Session session) {
        return sessionMapper.insertSession(session);
    }
}
