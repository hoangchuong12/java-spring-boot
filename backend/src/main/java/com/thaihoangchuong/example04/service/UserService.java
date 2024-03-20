package com.thaihoangchuong.example04.service;

import java.util.List;
import com.thaihoangchuong.example04.entity.User;
public interface UserService {
    User createUser(User user);

    User getUserById(Long userId);

    List<User> getAllUsers();

    User updateUser(User user);

    void deleteUser(Long userId);
}
