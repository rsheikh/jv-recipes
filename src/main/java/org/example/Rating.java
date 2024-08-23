package org.example;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Rating {

    @Id
    @GeneratedValue
    Long id;

    Integer value;

    LocalDate dateRated;

    @ManyToOne(fetch = FetchType.LAZY)
    Recipe associatedRecipe;

    @ManyToOne(fetch = FetchType.LAZY)
    RecipeUser rater;


}
