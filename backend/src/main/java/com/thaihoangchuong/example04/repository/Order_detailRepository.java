package com.thaihoangchuong.example04.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.thaihoangchuong.example04.entity.Order_detail;
public interface Order_detailRepository extends JpaRepository<Order_detail, Long>{
    
}
