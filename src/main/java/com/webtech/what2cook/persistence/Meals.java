package com.webtech.what2cook.persistence;

import com.webtech.what2cook.persistence.Rezept;

import java.util.List;

public class Meals {
    //Lombock?

    private List<Rezept> meals;

    public List<Rezept> getMeals() {
        return meals;
    }

    public void setMeals(List<Rezept> meals) {
        this.meals = meals;
    }
}
