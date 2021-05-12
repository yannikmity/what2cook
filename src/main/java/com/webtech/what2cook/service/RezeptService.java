package com.webtech.what2cook.service;

import com.webtech.what2cook.persistence.Nutzer;
import com.webtech.what2cook.persistence.NutzerRepository;
import com.webtech.what2cook.persistence.Rezept;
import com.webtech.what2cook.persistence.RezeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RezeptService {

    private final RezeptRepository rezeptRepository;

    @Autowired
    public RezeptService(RezeptRepository rezeptRepository) {
        this.rezeptRepository = rezeptRepository;
    }

    public List<Rezept> getAllRezepte() {

        return rezeptRepository.findAll();

    }

    public void addRezept(Rezept rezept){
        Optional<Rezept> rezeptByName = rezeptRepository.findRezeptByName(rezept.getStrMeal());
        if (rezeptByName.isPresent()){
            throw new IllegalStateException("Rezept already exists");
        }
    }

    //RequestBody für Rezept
}
