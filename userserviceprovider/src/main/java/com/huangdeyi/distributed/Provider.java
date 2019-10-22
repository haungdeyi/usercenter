package com.huangdeyi.distributed;

import com.huangdeyi.distributed.userservice.UserService;
import com.huangdeyi.distributed.userservice.UserServiceRequest;
import com.huangdeyi.distributed.userservice.UserServiceResponse;
import org.springframework.stereotype.Service;

@Service("userservice-provider")
public class Provider implements UserService {
    public UserServiceResponse registered(UserServiceRequest request) {
        return null;
    }

    public UserServiceResponse destory(UserServiceRequest request) {
        return null;
    }

    public UserServiceResponse updated(UserServiceRequest request) {
        return null;
    }

    //用户登录的具体业务逻辑
    public UserServiceResponse login(UserServiceRequest request) {
        System.out.println(request.getParams() + ":悄悄来过");
        UserServiceResponse response = new UserServiceResponse();
        response.setState("666");
        response.setData("hello 呀：" + request.getParams());
        return  response;
    }

    public UserServiceResponse logout(UserServiceRequest request) {
        return null;
    }
}
