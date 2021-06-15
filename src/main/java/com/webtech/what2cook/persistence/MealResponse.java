package com.webtech.what2cook.persistence;

import com.webtech.what2cook.persistence.Rezept;

import java.util.List;

public class MealResponse {

        private List<Meal> meals;

        public MealResponse(List<Meal> meals){
            this.meals = meals;
        }

        public List<Meal> getMeals() {
            return meals;
        }

        public void setMeals(List<Meal> meals) {
            this.meals = meals;
        }
}
