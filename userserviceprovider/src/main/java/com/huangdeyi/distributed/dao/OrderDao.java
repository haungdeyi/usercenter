package com.huangdeyi.distributed.dao;

import com.huangdeyi.distributed.domain.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDao {
    //根据id查询用户订单
    public List<Order> getOrderByUserId(String userId);
}
