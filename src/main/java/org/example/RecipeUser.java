package org.example;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class RecipeUser {
    @Id
    @GeneratedValue
    Integer id;

    String username;

    String email;

    String password;

    @Enumerated(EnumType.STRING)
    Role role;

    LocalDate dateRegistered;

    RecipeUser(Integer id, String username, String email, String password, Role role, LocalDate dateRegistered) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
        this.dateRegistered = dateRegistered;
    }
}
