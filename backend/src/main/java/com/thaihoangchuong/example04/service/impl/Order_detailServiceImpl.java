package com.thaihoangchuong.example04.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.thaihoangchuong.example04.entity.Order_detail;
import com.thaihoangchuong.example04.service.Order_detailService;
import com.thaihoangchuong.example04.repository.Order_detailRepository;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class Order_detailServiceImpl implements Order_detailService {
    private Order_detailRepository order_detailRepository;

    @Override
    public Order_detail createOrder_detail(Order_detail order_detail) {
        return order_detailRepository.save(order_detail);
    }

    @Override
    public Order_detail getOrder_detailById(Long order_detailId) {
        Optional<Order_detail> optionalorders = order_detailRepository.findById(order_detailId);
        return optionalorders.get();
    }

    @Override
    public List<Order_detail> getAllOrder_details() {
        return order_detailRepository.findAll();
    }

    @Override

    public void deleteOrder_detail(Long order_detailId) {
        order_detailRepository.deleteById(order_detailId);
    }

    @Override
    public Order_detail updateOrder_detail(Order_detail order_detail) {
 
       Order_detail existingOrder_detail = order_detailRepository.findById(order_detail.getId()).get();

        existingOrder_detail.setNum(order_detail.getNum());
        existingOrder_detail.setPrice(order_detail.getPrice());
        existingOrder_detail.setOrder(order_detail.getOrder());
        existingOrder_detail.setProduct(order_detail.getProduct());
        Order_detail updatedOrders = order_detailRepository.save(existingOrder_detail);
        return updatedOrders;
    }

}
