package com.huangdeyi.distributed.dao;

import com.huangdeyi.distributed.domain.IdCard;
import com.huangdeyi.distributed.domain.User;
import org.springframework.stereotype.Repository;

//由mybatis框架扫描生成动态代理对象并放入spring容器中
@Repository
public interface UsercenterDao {

    public User getUser(String id);

    public User getUserByJoin(String id);

    //查找用户的IdCard
    public IdCard getUserIdCard(String userid);

    //测试使用mycat操作数据库
    public User getUserByMycat(String userId);
}
