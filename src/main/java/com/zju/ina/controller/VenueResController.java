package com.zju.ina.controller;

import com.zju.ina.entity.Message;
import com.zju.ina.entity.Venue;
import com.zju.ina.entity.VenueInfo;
import com.zju.ina.mapper.OrderMapper;
import com.zju.ina.mapper.SessionMapper;
import com.zju.ina.mapper.UserMapper;
import com.zju.ina.mapper.VenueMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.zju.ina.service.VenueService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 祝广程
 * @version 1.0
 */
@RestController
@CrossOrigin(origins = "*")
public class VenueResController {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private VenueMapper venueMapper;
    @Autowired
    private SessionMapper sessionMapper;
    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private VenueService venueService;

    @GetMapping("/searchVenues")
    public Message searchVenues(@RequestParam String searchInfo) {
        List<Venue> venueList = venueService.searchVenues(searchInfo);
        if (venueList != null && !venueList.isEmpty()) {
            Map<String, Object> data = new HashMap<>();
            data.put("relatedVenues", venueList);
            return new Message("场馆搜索成功", 20000, data);
        } else {
            return new Message("未找到相关场馆", 40400);
        }
    }

    @GetMapping("/getVenueInfo")
    public Message getVenueInfo(@RequestParam String venueID) {
        VenueInfo venueInfo = venueService.getVenueInfoByVenueID(venueID);
        if (venueInfo != null) {
            Map<String, Object> data = new HashMap<>();
            data.put("venueInfo", venueInfo);
            return new Message("场馆信息获取成功", 20000, data);
        } else {
            return new Message("场馆信息未找到", 40400);
        }
    }

//    @PostMapping("/newOrder")
//    public Message newOrder(String openID, String venueID, String sessionID, String money) {
//        //        返回示例（order是一个Order对象）
////        return new Message("新建订单成功", 20000)
////                .data("order", order);
//    }
//
//    @PostMapping("/payOrder")
//    public Message payOrder() {
//        // 相关参数请参考Java实现小程序微信支付文档/博客
//    }
}
