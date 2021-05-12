package com.webtech.what2cook.web;

import com.webtech.what2cook.persistence.Nutzer;
import com.webtech.what2cook.persistence.Rezept;
import com.webtech.what2cook.service.RezeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rezept")
public class RezeptController {

    private final RezeptService rezeptService;

    @Autowired
    public RezeptController(RezeptService rezeptService){
        this.rezeptService = rezeptService;
    }

    @GetMapping("thymeleaf")
    String getAllRezepte(@org.jetbrains.annotations.NotNull Model model){
        String s = "hallo";

        return "rezept123";
    }

//    @PostMapping("post")
//    public void registerNewNutzer(@RequestBody Rezept rezept) {
//        rezeptService.addRezept(rezept);
//    }

}
