package com.webtech.what2cook.web;


import com.webtech.what2cook.persistence.Nutzer;
import com.webtech.what2cook.service.NutzerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@RequestMapping(path = "nutzer")
public class NutzerController {

    private final NutzerService nutzerService;

    @Autowired
    public NutzerController(NutzerService nutzerService) {
        this.nutzerService = nutzerService;
    }

    @GetMapping()
    public String getAllRezepte(){
        return "login";
    }


    @GetMapping("getUser")
    public List<Nutzer> getUser() {
        return nutzerService.getUser();
    }

    @PostMapping("post")
    public void registerNewNutzer(@RequestBody Nutzer nutzer) {
        nutzerService.addNewNutzer(nutzer);
    }

    @DeleteMapping("{nutzerId}")
    public void deleteNutzer(@PathVariable("nutzerId") Long nutzerId) {
        nutzerService.deleteNutzer(nutzerId);

    }

//    @Autowired
//    Environment environment;
//    @GetMapping("/print")
//    public String printJDBCCreds() {
//        return environment.getProperty("JDBC_DATABASE_URL");
//    }



}
