package com.spring.dao.impl;

import com.spring.model.OrderData;
import com.spring.utils.OrderDataRowmapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class OrderDataImpl extends AbstractOrderData<OrderData,Integer> {
    private static final String insert_row = "insert into orderdata(customerName,orderDate,shippingAddress,total) values(?,?,?,?)";
    private static final String update_row = "update orderdata set customerName=?,orderDate=?,shippingAddress=?,total=? where id=? ";
    private static final String delete_row = "delete from orderdata where id=?";
    private static final String find_row_by_id = "select * from orderdata where id=?";
    private static final String find_all = "select * from orderdata";
    public OrderDataImpl(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    @Override
    public Integer save(OrderData orderData) {
        return getJdbcTemplate().update(insert_row, new Object[]{orderData.getCustomerName(),orderData.getOrderDate(),orderData.getShippingAddress(),orderData.getTotal()});
    }

    @Override
    public Integer update(OrderData orderData, Integer id) {
        return getJdbcTemplate().update(update_row,new Object[]{orderData.getCustomerName(),orderData.getOrderDate(),orderData.getShippingAddress(),orderData.getTotal(),id});
    }

    @Override
    public Integer delete(Integer id) {
        return getJdbcTemplate().update(delete_row,new Object[]{id});
    }

    @Override
    public List<OrderData> select() {
        return getJdbcTemplate().query(find_all,new OrderDataRowmapper());
    }

    @Override
    public OrderData selectById(Integer id) {
        System.out.println("reading by id: "+id);
        return getJdbcTemplate().queryForObject(find_row_by_id,new OrderDataRowmapper(),new Object[]{id});
    }
}
