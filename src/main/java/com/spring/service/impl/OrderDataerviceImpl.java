package com.spring.service.impl;

import com.spring.dao.IOrderData;
import com.spring.dao.impl.OrderDataImpl;
import com.spring.exception.Error;
import com.spring.exception.OrderDataException;
import com.spring.model.OrderData;
import com.spring.service.IOrderDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderDataerviceImpl implements IOrderDataService {
    @Autowired
     OrderDataImpl orderData;

    @Override
    public Integer save(OrderData data) {
        try {
            return orderData.save(data);
        } catch (OrderDataException e) {
            throw new OrderDataException(new Error("data is not saved",500));
        }
    }

    @Override
    public Integer update(OrderData data, Integer id) {
        try {
            return orderData.update(data,id);
        } catch (OrderDataException e) {
            throw new OrderDataException(new Error("data is not updatd",500));
        }
    }

    @Override
    public Integer delete(Integer id) {
        try {
            return orderData.delete(id);
        } catch (OrderDataException e) {
            throw new OrderDataException(new Error("data is not deleted",500));
        }
    }

    @Override
    public List<OrderData> selectAll() {
        return orderData.select();
    }

    @Override
    public OrderData selectById(Integer id) {
        return orderData.selectById(id);
    }
}
