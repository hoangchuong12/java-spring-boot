package com.thaihoangchuong.example04.service;

import java.util.List;
import com.thaihoangchuong.example04.entity.Product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface ProductService {
    public Product createProduct(Product Product);
    public Product getProductById(Long ProductId);
    public Page<Product> getAllProducts(Pageable pageable);
    public Product updateProduct(Product Product);
    public void deleteProduct(Long ProductId);
    public List<Product> getProductsByCondition(String title, Long category);
    public List<Product> getLatestProductsInCategory(Long categoryId, int pageSize);
    public Page<Product> getProductsByCategoryId(Long categoryId, Pageable pageable);
}
