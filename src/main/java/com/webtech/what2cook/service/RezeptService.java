package com.webtech.what2cook.service;

import com.webtech.what2cook.persistence.MealResponse;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RezeptService {

    private final RestTemplate restTemplate;


    private static final String API_URL = "https://www.themealdb.com/api/json/v1/1/random.php";

    public RezeptService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }
    public String getJSON() {
        String url = "https://www.themealdb.com/api/json/v1/1/random.php";
        return this.restTemplate.getForObject(url, String.class);
    }

    public void fetch(){
        ResponseEntity<MealResponse> entity = restTemplate.getForEntity(API_URL, MealResponse.class);

        MealResponse mealResponse = entity.getBody();

        System.out.println(mealResponse.getMeals().get(0).getIdMeal());
        System.out.println(mealResponse.getMeals().get(0).getStrMeal());
        System.out.println(mealResponse.getMeals().get(0).getStrDrinkAlternate());
        System.out.println(mealResponse.getMeals().get(0).getStrCategory());
        System.out.println(mealResponse.getMeals().get(0).getStrArea());
        System.out.println(mealResponse.getMeals().get(0).getStrInstructions());
        System.out.println(mealResponse.getMeals().get(0).getStrMealThumb());
        System.out.println(mealResponse.getMeals().get(0).getStrTags());
        System.out.println(mealResponse.getMeals().get(0).getStrYoutube());
        System.out.println(mealResponse.getMeals().get(0).getStrIngredient1());
        System.out.println(mealResponse.getMeals().get(0).getStrIngredient2());
    }
}
