package com.zju.ina.controller;

import com.zju.ina.entity.Message;
import com.zju.ina.mapper.OrderMapper;
import com.zju.ina.mapper.SessionMapper;
import com.zju.ina.mapper.UserMapper;
import com.zju.ina.mapper.VenueMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/searchVenues")
    public Message searchVenues(String searchInfo) {
//        返回示例（venueList是一个Venue对象组成的数组）
//        return new Message("场馆搜索成功", 20000)
//                .data("venues", venueList);
    }

    @GetMapping("/getVenueInfo")
    public Message getVenueInfo(String venueID) {
        //        返回示例（venueInfo是一个VenueInfo对象）
//        return new Message("场馆信息获取成功", 20000)
//                .data("venueInfo", venueInfo);
    }

    @PostMapping("/newOrder")
    public Message newOrder(String openID, String venueID, String sessionID, String money) {
        //        返回示例（order是一个Order对象）
//        return new Message("新建订单成功", 20000)
//                .data("order", order);
    }

    @PostMapping("/payOrder")
    public Message payOrder() {
        // 相关参数请参考Java实现小程序微信支付文档/博客
    }
}
