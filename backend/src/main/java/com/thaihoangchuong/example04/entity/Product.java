package com.thaihoangchuong.example04.entity;

import java.sql.Date;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Products")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
	@UpdateTimestamp
    private Date created_at;
    @Column(nullable = false)
    private Integer deleted;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private Integer discount;
    @Column(nullable = false)
    private double price;
    @Column(nullable = false)
    private String thumbnail;
    @Column()
	@UpdateTimestamp
    private Date updated_at;
    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
}