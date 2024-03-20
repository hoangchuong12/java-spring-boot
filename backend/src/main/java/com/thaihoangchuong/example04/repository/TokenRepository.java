package com.thaihoangchuong.example04.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.thaihoangchuong.example04.entity.Token;
public interface TokenRepository extends JpaRepository<Token, Long>{
    
}
