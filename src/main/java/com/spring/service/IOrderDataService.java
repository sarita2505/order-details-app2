package com.spring.service;

import com.spring.model.OrderData;

import java.util.List;

public interface IOrderDataService {
    Integer save(OrderData data);
    Integer update(OrderData data,Integer id);
    Integer delete(Integer id);
    List<OrderData> selectAll();
    OrderData selectById(Integer id);
}
