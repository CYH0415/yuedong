package com.zju.ina.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 祝广程
 * @version 1.0
 */
public class Message {
    private String msg;
    private Integer code;
    private Map<String, Object> data = new HashMap<>();

    public Message() {
    }

    public Message(String msg, Integer code) {
        this.msg = msg;
        this.code = code;
    }

    public Message(String msg, Integer code, Map<String, Object> data) {
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Message{" +
                "msg='" + msg + '\'' +
                ", code=" + code +
                ", data=" + data +
                '}';
    }
}
