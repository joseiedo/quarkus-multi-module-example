package com.joseiedo.user;

import jakarta.persistence.*;

@Entity
@Table(name = "system_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
