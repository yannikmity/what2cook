package com.webtech.what2cook.web;

import com.webtech.what2cook.persistence.Nutzer;
import com.webtech.what2cook.persistence.Rezept;
import com.webtech.what2cook.service.RezeptService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping
    public List<Rezept> getAllRezepte(){
        return rezeptService.getAllRezepte();
    }

    @PostMapping("post")
    public void registerNewNutzer(@RequestBody Rezept rezept) {
        rezeptService.addRezept(rezept);
    }

}
