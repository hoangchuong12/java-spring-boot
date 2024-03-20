package com.thaihoangchuong.example04.controller;

import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.thaihoangchuong.example04.entity.Orders;
import com.thaihoangchuong.example04.service.OrderService;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/orders")
@CrossOrigin(origins = "http://localhost:3000")
public class OrderController {
     private OrderService ordersService;

    // Create product rest API
    @PostMapping
    public ResponseEntity<Orders> createOrders(@RequestBody Orders orders) {
        Orders savedOrders = ordersService.createOrders(orders);
        return new ResponseEntity<>(savedOrders, HttpStatus.CREATED);
    }

    // Get product by id REST API
    // http://localhost:8080/api/products/1
    @GetMapping("{id}")
    public ResponseEntity<Orders> getOrdersById(@PathVariable("id") Long ordersId) {
        Orders orders = ordersService.getOrdersById(ordersId);
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    // Get all product REST API
    // http://localhost:8080/api/products
    @GetMapping
    public ResponseEntity<List<Orders>> getAllOrders() {
        List<Orders> orders = ordersService.getAllOrders();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    // Update product REST API
    // http://localhost:8080/api/galleies/1
    @PutMapping("{id}")
    public ResponseEntity<Orders> updateOrders(@PathVariable("id") Long ordersId, @RequestBody Orders orders) {
        orders.setId(ordersId);
        Orders updateOrders = ordersService.updateOrders(orders);
        return new ResponseEntity<>(updateOrders, HttpStatus.OK);
    }

    // Delete gallery REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteOrders(@PathVariable("id") Long ordersId) {
        ordersService.deleteOrders(ordersId);
        return new ResponseEntity<>("orders successfully deleted!", HttpStatus.OK);
    }
}
