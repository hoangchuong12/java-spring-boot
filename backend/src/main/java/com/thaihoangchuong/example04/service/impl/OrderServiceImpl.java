package com.thaihoangchuong.example04.service.impl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.thaihoangchuong.example04.entity.Orders;
import com.thaihoangchuong.example04.service.OrderService;

import com.thaihoangchuong.example04.repository.OrderRepository;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {
    private OrderRepository ordersRepository;

    @Override
    public Orders createOrders(Orders orders) {
        return ordersRepository.save(orders);
    }

    @Override
    public Orders getOrdersById(Long ordersId) {
        Optional<Orders> optionalorders = ordersRepository.findById(ordersId);
        return optionalorders.get();
    }

    @Override
    public List<Orders> getAllOrders() {
        return ordersRepository.findAll();
    }

    @Override
    public Orders updateOrders(Orders orders) {
        Orders existingOrders = ordersRepository.findById(orders.getId()).get();
        existingOrders.setAddress(orders.getAddress());
        existingOrders.setEmail(orders.getEmail());
        existingOrders.setFullname(orders.getFullname());
        existingOrders.setNote(orders.getNote());
        existingOrders.setOrder_date(orders.getOrder_date());
        existingOrders.setPhone_number(orders.getPhone_number());
        existingOrders.setStatus(orders.getStatus());
        existingOrders.setTotal_money(orders.getTotal_money());
        Orders updatedOrders = ordersRepository.save(existingOrders);
        return updatedOrders;
    }

    @Override

    public void deleteOrders(Long ordersId) {
       ordersRepository.deleteById(ordersId);
    }
}
