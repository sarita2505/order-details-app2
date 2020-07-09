package com.spring.model;

public class OrderItem {
    int id;
    int productCode;
    String productNmae;
    int quantity;
    int orderId;

    public OrderItem() {
    }

    public OrderItem(int productCode, String productname, int quantity, int orderId) {
        this.productCode = productCode;
        this.productNmae = productname;
        this.quantity = quantity;
        this.orderId = orderId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductNmae() {
        return productNmae;
    }

    public void setProductNmae(String productNmae) {
        this.productNmae = productNmae;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", productCode=" + productCode +
                ", productname='" + productNmae + '\'' +
                ", quantity=" + quantity +
                ", orderId=" + orderId +
                '}';
    }
}
