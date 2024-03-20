package com.thaihoangchuong.example04.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.thaihoangchuong.example04.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
@Query("SELECT p FROM Product p WHERE p.category.id = :categoryId ORDER BY p.created_at DESC")
List<Product> findLatestProductsInCategory(Long categoryId, Pageable pageable);
Page<Product> findProductsByCategoryId(Long categoryId, Pageable pageable);
}
