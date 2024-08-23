package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
class Category {

    @Id
    Integer id;

    String name;

    Category(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
