package com.zju.ina.service;

import com.zju.ina.entity.Venue;
import com.zju.ina.entity.VenueInfo;

import java.util.List;

public interface VenueService {
    VenueInfo getVenueInfoByVenueID(String venueID);
    List<Venue> searchVenues(String searchInfo);
}