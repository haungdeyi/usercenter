package com.huangdeyi.distributed.domain;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.util.List;

@Alias("user")
public class User implements Serializable {
    private static final long serialVersionUID = -7155840542175235221L;
    private String id;
    private String username;
    private String password;
    private Gender gender;
    //idCard
    private IdCard idCard;
    //订单
    private List<Order> orderList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public IdCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IdCard idCard) {
        this.idCard = idCard;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
