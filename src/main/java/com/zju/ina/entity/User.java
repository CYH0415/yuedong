package com.zju.ina.entity;

/**
 * @author 祝广程
 * @version 1.0
 */
public class User {
    private String openID;
    private String username;
    private int sex;
    private String phone;

    public User(String openID, String username, int sex, String phone) {
        this.openID = openID;
        this.username = username;
        this.sex = sex;
        this.phone = phone;
    }

    public String getOpenID() {
        return openID;
    }

    public void setOpenID(String openID) {
        this.openID = openID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "openID='" + openID + '\'' +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", phone='" + phone + '\'' +
                '}';
    }
}
