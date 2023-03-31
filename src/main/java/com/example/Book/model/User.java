package com.example.Book.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class User {
    private Integer userId;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String Contact;
    private String status;
    private Integer userRoleId;
    private Integer addressId;
    private Address address;
    private UserRole userRole;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
