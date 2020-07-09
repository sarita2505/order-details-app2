package com.spring.utils;

import com.spring.model.OrderData;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderDataRowmapper implements RowMapper<OrderData> {
    @Override
    public OrderData mapRow(ResultSet resultSet, int i) throws SQLException {
        OrderData data=new OrderData();
        data.setId(resultSet.getInt(1));
        data.setCustomerName(resultSet.getString(2));
        data.setOrderDate(resultSet.getDate(3));
        data.setShippingAddress(resultSet.getString(4));
        data.setTotal(resultSet.getDouble(5));
        return data;
    }
}
