package com.huangdeyi.distributed.domain;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Alias("order")
public class Order implements Serializable {
    private static final long serialVersionUID = -7006023296285786083L;
    private String id;
    private String name;
    private Double price;
    //不能这样关联到一的一方，
    //private User user;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

   /* public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }*/
}
