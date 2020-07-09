package com.spring.controller;

import com.spring.dao.IOrderData;
import com.spring.model.OrderData;
import com.spring.model.OrderDataItems;
import com.spring.model.OrderItem;
import com.spring.service.IOrderDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class OrderDataConroller {
    @Autowired
    private IOrderDataService data;

    @PostMapping("/orderDetails")
    public ResponseEntity<Integer> saveData(@RequestBody OrderData orderData) {
        Integer i = data.save(orderData);
        return ResponseEntity.ok(i);
    }

    @PutMapping("/orderDetails/{id}")
    public ResponseEntity<Integer> updateData(@RequestBody OrderData orderData, @PathVariable("id") Integer id) {
        Integer i = data.update(orderData, id);
        return ResponseEntity.ok(i);
    }

    @DeleteMapping("/orderDetails/{id}")
    public ResponseEntity<Integer> deleteData(@PathVariable("id") Integer id) {
        Integer i = data.delete(id);
        return ResponseEntity.ok(i);
    }

    @GetMapping("/orderDetails")
    public ResponseEntity<List> getAllData() {
        List<OrderData> orderData = data.selectAll();
        return ResponseEntity.ok(orderData);
    }

    @GetMapping("/orderDetails/{id}")
    public ResponseEntity<OrderDataItems> getById(@PathVariable("id") Integer id) {
        OrderData data1 = data.selectById(id);
        String url = "http://localhost:9091/orderItems/order/"+id;
        OrderItem[] items = restTemplate.getForObject(url, OrderItem[].class);

        OrderDataItems dataItems = new OrderDataItems();

        dataItems.setOrderData(data1);
        dataItems.setItems(Arrays.asList(items));
        return ResponseEntity.ok(dataItems);
    }

    // /orderItems/order/8
    RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/items/{id}")
    public List<OrderItem> getItems(@PathVariable("id") Integer id) {
        List<OrderItem> itemList = new ArrayList<>();
        String url = "http://localhost:9091/orderItems/";
        OrderItem[] items = restTemplate.getForObject(url, OrderItem[].class);
        for (OrderItem item : items) {
            if (item.getOrderId() == id) {
                itemList.add(item);
            }
        }
        return itemList;
    }
}
