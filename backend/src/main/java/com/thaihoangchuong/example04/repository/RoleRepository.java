package com.thaihoangchuong.example04.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.thaihoangchuong.example04.entity.Role;
public interface RoleRepository extends JpaRepository<Role, Long>{
    
}
