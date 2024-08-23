package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Tag {

    @Id
    Integer id;

    String name;

    Tag(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
