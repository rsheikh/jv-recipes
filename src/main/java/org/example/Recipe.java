package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Recipe {
    @Id
    @GeneratedValue
    Long id;

    String title;
    String description;
    String instructions;
    Integer preparationTime;
    Integer cookingTime;
    Integer servings;
    Integer difficultyLevel;

//    Set<Rating> rating;

}
