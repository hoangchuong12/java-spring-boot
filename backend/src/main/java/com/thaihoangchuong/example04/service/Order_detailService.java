package com.thaihoangchuong.example04.service;
import java.util.List;
import com.thaihoangchuong.example04.entity.Order_detail;
public interface Order_detailService {
    Order_detail createOrder_detail(Order_detail orders);

    Order_detail getOrder_detailById(Long ordersId);

    List<Order_detail> getAllOrder_details();

    Order_detail updateOrder_detail(Order_detail order_detailId);

    void deleteOrder_detail(Long ordersId);
}

