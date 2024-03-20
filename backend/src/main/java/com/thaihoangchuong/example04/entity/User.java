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
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private java.util.Date created_at;
    @Column(nullable = false)
    private Integer deleted;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String fullname;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String phone_number;
    @Column(nullable = false)
    private java.util.Date updated_at;
    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;
}
