package com.huangdeyi.distributed.userservice;

public interface UserService {
    //注册用户
    public UserServiceResponse registered(UserServiceRequest request);

    //注销用户
    public UserServiceResponse destory(UserServiceRequest request);

    //更新用户信息
    public UserServiceResponse updated(UserServiceRequest request);

    //用户登录
    public UserServiceResponse login(UserServiceRequest request);

    //退出登录
    public UserServiceResponse logout(UserServiceRequest request);
}
