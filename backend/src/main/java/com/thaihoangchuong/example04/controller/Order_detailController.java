package com.thaihoangchuong.example04.controller;
import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.thaihoangchuong.example04.entity.Order_detail;
import com.thaihoangchuong.example04.service.Order_detailService;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/order_detail")
@CrossOrigin(origins = "http://localhost:3000")
public class Order_detailController {
    private Order_detailService order_detailService;

    // Create product rest API
    @PostMapping
    public ResponseEntity<Order_detail> createOrders(@RequestBody Order_detail order_detail) {
        Order_detail savedOrder_detail = order_detailService.createOrder_detail(order_detail);
        return new ResponseEntity<>(savedOrder_detail, HttpStatus.CREATED);
    }

    // Get product by id REST API
    // http://localhost:8080/api/products/1
    @GetMapping("{id}")
    public ResponseEntity<Order_detail> getOrder_detailById(@PathVariable("id") Long order_detailId) {
        Order_detail order_detail = order_detailService.getOrder_detailById(order_detailId);
        return new ResponseEntity<>(order_detail, HttpStatus.OK);
    }

    // Get all product REST API
    // http://localhost:8080/api/products
    @GetMapping
    public ResponseEntity<List<Order_detail>> getAllOrder_details() {
        List<Order_detail> order_detail = order_detailService.getAllOrder_details();
        return new ResponseEntity<>(order_detail, HttpStatus.OK);
    }

    // Update product REST API
    // http://localhost:8080/api/galleies/1
    @PutMapping("{id}")
    public ResponseEntity<Order_detail> updateOrder_detail(@PathVariable("id") Long order_detailId, @RequestBody Order_detail order_detail) {
        order_detail.setId(order_detailId);
        Order_detail updateOrder_detail = order_detailService.updateOrder_detail(order_detail);
        return new ResponseEntity<>(updateOrder_detail, HttpStatus.OK);
    }

    // Delete gallery REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteOrder_detail(@PathVariable("id") Long order_detailId) {
        order_detailService.deleteOrder_detail(order_detailId);
        return new ResponseEntity<>("order_detail successfully deleted!", HttpStatus.OK);
    }
}
