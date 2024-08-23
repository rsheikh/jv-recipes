package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Optional;

@Entity
public class Ingredient {

    @Id
    Integer id;

    String name;

    Integer quantity;

    String unitOfMeasurement;

    Ingredient(Integer id, String name, Integer quantity, String unitOfMeasurement) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.unitOfMeasurement = unitOfMeasurement;
    }
}
