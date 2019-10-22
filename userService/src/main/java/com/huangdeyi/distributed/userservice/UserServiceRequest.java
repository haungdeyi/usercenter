package com.huangdeyi.distributed.userservice;

import java.io.Serializable;

public class UserServiceRequest implements Serializable {
    private static final long serialVersionUID = -2712792666877056033L;
    //请求参数
    private Object params;

    public Object getParams() {
        return params;
    }
    public void setParams(Object params) {
        this.params = params;
    }
}
