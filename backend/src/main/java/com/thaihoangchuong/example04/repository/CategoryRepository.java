package com.thaihoangchuong.example04.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.thaihoangchuong.example04.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
