package com.thaihoangchuong.example04.entity;

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
@Table(name = "Order_details")
public class Order_detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Integer num;
    @Column(nullable = false)
    private Integer price;
    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Orders order;
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;
}
