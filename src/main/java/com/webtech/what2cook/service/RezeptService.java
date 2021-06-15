package com.webtech.what2cook.service;

import com.webtech.what2cook.persistence.Nutzer;
import com.webtech.what2cook.persistence.NutzerRepository;
import com.webtech.what2cook.persistence.Rezept;
import com.webtech.what2cook.persistence.RezeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

//@Service
public class RezeptService {

    private final RezeptRepository rezeptRepository;
//    private final RestTemplate restTemplate;

//    @Autowired
    public RezeptService(RezeptRepository rezeptRepository) {
        this.rezeptRepository = rezeptRepository;
    }
//    public RezeptService(RestTemplate restTemplate) {
//        this.restTemplate = restTemplate;
//    }
//    private static final String API_URL = "https://www.themealdb.com/api/json/v1/1/random.php";
//
//
//
//        public void fetch(){
//
//        ResponseEntity<MealResponse> entity = restTemplate.getForEntity(API_URL, MealResponse.class);
//
//        MealResponse mealResponse = entity.getBody();
//
//        System.out.println(mealResponse.getMeals().get(0).getIdMeal());
//        System.out.println(mealResponse.getMeals().get(0).getStrMeal());
//        System.out.println(mealResponse.getMeals().get(0).getStrDrinkAlternate());
//        System.out.println(mealResponse.getMeals().get(0).getStrCategory());
//        System.out.println(mealResponse.getMeals().get(0).getStrArea());
//        System.out.println(mealResponse.getMeals().get(0).getStrInstructions());
//        System.out.println(mealResponse.getMeals().get(0).getStrMealThumb());
//        System.out.println(mealResponse.getMeals().get(0).getStrTags());
//        System.out.println(mealResponse.getMeals().get(0).getStrYoutube());
//        System.out.println(mealResponse.getMeals().get(0).getStrIngredient1());
//        System.out.println(mealResponse.getMeals().get(0).getStrIngredient2());
//
//        }

    public List<Rezept> getAllRezepte() {

        return rezeptRepository.findAll();

    }

    public void addRezept(Rezept rezept){
        Optional<Rezept> rezeptByName = rezeptRepository.findRezeptByName(rezept.getStrMeal());
        if (rezeptByName.isPresent()){
            throw new IllegalStateException("Rezept already exists");
        }
    }

}
