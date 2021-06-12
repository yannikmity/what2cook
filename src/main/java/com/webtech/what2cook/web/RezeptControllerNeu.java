package com.webtech.what2cook.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class RezeptControllerNeu {

    private final RezeptService rezeptService;

    @Autowired
    public RezeptControllerNeu(RezeptService rezeptService) {
        this.rezeptService = rezeptService;
    }

    @GetMapping("/api/rezept")
    public ResponseEntity<Void> test() {
        rezeptService.fetch();
        return ResponseEntity.ok().build();
    }
}

