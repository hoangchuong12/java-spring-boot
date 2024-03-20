package com.thaihoangchuong.example04.service;
import java.util.List;
import com.thaihoangchuong.example04.entity.Orders;
public interface OrderService {
    Orders createOrders(Orders orders);

    Orders getOrdersById(Long ordersId);

    List<Orders> getAllOrders();

    Orders updateOrders(Orders orders);

    void deleteOrders(Long ordersId);
}

