package com.zju.ina.controller;

import com.zju.ina.entity.Message;
import com.zju.ina.entity.Session;
import com.zju.ina.mapper.SessionMapper;
import com.zju.ina.mapper.VenueMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class SessionResController {
    @Autowired
    private SessionMapper sessionMapper;

    @GetMapping("/searchSession")
    public Message searchSession(@RequestParam String venueID) {
        List<Session> sessionList = sessionMapper.getSessionsByVenueID(venueID);
        if(sessionList != null && !sessionList.isEmpty()) {
            Map<String, Object> data = new HashMap<>();
            data.put("sessionList", sessionList);
            return new Message("搜索成功", 20000, data);
        } else {
            return new Message("未找到相关时段", 40400);
        }
    }

    @PostMapping("/addSession")
    public Message addSession(Session session) {
        int res = sessionMapper.insertSession(session);
        if(res == 1) {
            return new Message("添加成功", 20000);
        } else {
            return  new Message("添加失败", 40400);
        }
    }
}
