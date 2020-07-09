package com.spring.model;

import java.sql.Date;
import java.sql.Timestamp;

public class OrderData {
    int id;
    String customerName;
    //your date format should be yyyy-mm-dd
    Date orderDate;
    String shippingAddress;
    Double total;

    public OrderData() {
    }

    public OrderData(String customerName, Date orderdate, String shippingAddress, Double total) {
        this.customerName = customerName;
        this.orderDate = orderdate;
        this.shippingAddress = shippingAddress;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "OrderData{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", orderDate=" + orderDate +
                ", shippingAddress='" + shippingAddress + '\'' +
                ", total=" + total +
                '}';
    }
}
