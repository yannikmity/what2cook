package com.webtech.what2cook.web;


import com.webtech.what2cook.persistence.Nutzer;
import com.webtech.what2cook.persistence.NutzerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;
import java.util.List;

@RestController
@Controller
@RequestMapping("management/api/v1/nutzer")

public class NutzerManagementController {
    NutzerRepository nutzerRepository;

    @GetMapping
    public String getAllNutzer(Model model) {

        model.addAttribute("nutzer", nutzerRepository.findAll());
        return "getUser";

    }

    @PostMapping
    public void registerNewNutzer(@RequestBody Nutzer nutzer){
        System.out.println(nutzer);
    }

    @DeleteMapping(path = "{id}")
    public void deleteNutzer(@PathVariable("id") Long id) {
        System.out.println(id);
    }

    @PutMapping(path= "{id}")
    public void updateNutzer(@PathVariable("id") Long id, @RequestBody Nutzer nutzer) {
        System.out.println(String.format("%s %s", nutzer, nutzer));
    }
}
