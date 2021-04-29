package com.webtech.what2cook.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/nutzer")
public class NutzerController {

    private final NutzerService nutzerService;

    @Autowired
    public NutzerController(NutzerService nutzerService) {
        this.nutzerService = nutzerService;
    }

    @GetMapping
    public List<Nutzer> getUser(){
        return nutzerService.getUser();
    }

    @PostMapping
    public void registerNewNutzer(@RequestBody Nutzer nutzer){
        nutzerService.addNewNutzer(nutzer);
    }


    @DeleteMapping
    public void deleteNutzer(@RequestBody Nutzer nutzer) {
        nutzerService.deleteNutzer(nutzer);
    }
    @Autowired
    Environment environment;
    @GetMapping("/print")
    public String printJDBCCreds(){
        return environment.getProperty("JDBC_DATABASE_URL");

    }


}
