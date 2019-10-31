package com.huangdeyi.distributed.dao;

import com.huangdeyi.distributed.domain.User;
import org.springframework.stereotype.Repository;

//由mybatis框架扫描生成动态代理对象并放入spring容器中
@Repository
public interface usercenterDao {

    public User getUser(String id);
}
