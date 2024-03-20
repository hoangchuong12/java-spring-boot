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
@Table(name = "Orders")
public class Orders {
        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false, unique = true)
    private String fullname;
    @Column(nullable = false)
    private String note;
    @Column(nullable = false)
    private java.util.Date order_date;
    @Column(nullable = false)
    private String phone_number;
    @Column(nullable = false)
    private Integer status;
    @Column(nullable = false)
    private Integer total_money;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
