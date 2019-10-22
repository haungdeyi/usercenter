package com.huangdeyi.distributed.userservice;

import java.io.Serializable;
import java.rmi.server.UID;
import java.util.UUID;

public class User implements Serializable {
    private static final long serialVersionUID = 9069011708706233493L;
    //唯一标志ID
    private String ID;
    //姓名
    private String username;
    //性别
    private String gender;
    //密码
    private String Password;
    //头像url
    private String pictrue;

    public User(){
        this.ID = UUID.randomUUID().toString();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPictrue() {
        return pictrue;
    }

    public void setPictrue(String pictrue) {
        this.pictrue = pictrue;
    }
}
