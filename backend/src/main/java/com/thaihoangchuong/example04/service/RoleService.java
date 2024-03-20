package com.thaihoangchuong.example04.service;

import java.util.List;
import com.thaihoangchuong.example04.entity.Role;
public interface RoleService {
    Role createRole(Role role);

    Role getRoleById(Long roleId);

    List<Role> getAllRoles();

    Role updateRole(Role role);

    void deleteRole(Long roleId);
}
