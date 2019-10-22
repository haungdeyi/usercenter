package com.huangdeyi.distributed.userservice;

import java.io.Serializable;

public class UserServiceResponse implements Serializable {
    private static final long serialVersionUID = -2082579879698114940L;
    //请求的状态：666(成功)、222(失败)
    private String state ;
    //返回的数据
    private Object data;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
