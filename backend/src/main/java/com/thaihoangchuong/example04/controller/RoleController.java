package com.thaihoangchuong.example04.controller;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.thaihoangchuong.example04.entity.Role;
import com.thaihoangchuong.example04.service.RoleService;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/roles")
@CrossOrigin(origins = "http://localhost:3000")
public class RoleController {
    private RoleService roleService;

    // Create Role rest API
    @PostMapping
    public ResponseEntity<Role> createRole(@RequestBody Role role) {
        Role savedRole = roleService.createRole(role);
        return new ResponseEntity<>(savedRole, HttpStatus.CREATED);
    }

    // Get Role by id REST API
    // http://localhost:8080/api/Roles/1
    @GetMapping("{id}")
    public ResponseEntity<Role> getRoleById(@PathVariable("id") Long roleId) {
        Role role = roleService.getRoleById(roleId);
        return new ResponseEntity<>(role, HttpStatus.OK);
    }

    // Get all Role REST API
    // http://localhost:8080/api/Roles
    @GetMapping
    public ResponseEntity<List<Role>> getAllRoles() {
        List<Role> roles = roleService.getAllRoles();
        return new ResponseEntity<>(roles, HttpStatus.OK);
    }

    // Update Role REST API
    // http://localhost:8080/api/Roles/1
    @PutMapping("{id}")
    public ResponseEntity<Role> updateRole(@PathVariable("id") Long roleId, @RequestBody Role role) {
        role.setId(roleId);
        Role updateRole = roleService.updateRole(role);
        return new ResponseEntity<>(updateRole, HttpStatus.OK);
    }

    // Delete Role REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteRole(@PathVariable("id") Long roleId) {
        roleService.deleteRole(roleId);
        return new ResponseEntity<>("Role successfully deleted!", HttpStatus.OK);
    }
}
