package com.zju.ina.service.impl;

import com.zju.ina.entity.Session;
import com.zju.ina.entity.Venue;
import com.zju.ina.entity.VenueInfo;
import com.zju.ina.mapper.SessionMapper;
import com.zju.ina.mapper.VenueMapper;
import com.zju.ina.service.VenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VenueServiceImpl implements VenueService {

    @Autowired
    private VenueMapper venueMapper;

    @Autowired
    private SessionMapper sessionMapper;

    @Override
    public VenueInfo getVenueInfoByVenueID(String venueID) {
        // 查询场馆基本信息
        Venue venue = venueMapper.getVenueByVenueID(venueID);
        if (venue == null) {
            return null;
        }
        System.out.println("venueID:" + venueID);
        // 查询该场馆的所有场次信息
        List<Session> sessions = sessionMapper.getSessionsByVenueID(venueID);

        // 封装成 VenueInfo 对象
        VenueInfo venueInfo = new VenueInfo(
                venue.getVenueID(),
                venue.getVenueName(),
                venue.getVenueAddr(),
                venue.getScore(),
                sessions
        );

        return venueInfo;
    }

    public List<Venue> searchVenues(String searchInfo) {
        // 调用 Mapper 查询模糊匹配的场馆信息
        return venueMapper.searchVenues(searchInfo);
    }
}