package com.huangdeyi.distributed.domain;

import org.apache.ibatis.type.Alias;

import java.util.List;

@Alias("user")
public class User {
    private String username;
    private String password;
    private Gender gender;
    //订单
    private List<Order> orderList;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
