package com.thaihoangchuong.example04.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.thaihoangchuong.example04.entity.Orders;
public interface OrderRepository extends JpaRepository<Orders, Long> {
    
}
