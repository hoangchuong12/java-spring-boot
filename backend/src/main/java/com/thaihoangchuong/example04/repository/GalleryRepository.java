package com.thaihoangchuong.example04.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.thaihoangchuong.example04.entity.Gallery;
public interface GalleryRepository extends JpaRepository<Gallery,Long> {
    
}
