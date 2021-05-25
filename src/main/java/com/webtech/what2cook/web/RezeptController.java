package com.webtech.what2cook.web;

import com.webtech.what2cook.config.Endpoints;
import com.webtech.what2cook.persistence.Nutzer;
//import com.webtech.what2cook.persistence.Rezept;
import com.webtech.what2cook.persistence.Rezept;
import com.webtech.what2cook.service.RezeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
@RestController
@RequestMapping()
public class RezeptController {

    private final RezeptService rezeptService;

    @Autowired
    public RezeptController(RezeptService rezeptService){
        this.rezeptService = rezeptService;
    }

    @PostMapping("/createRezept")
    public ModelAndView createRezept(Rezept rezept){

        return new ModelAndView(Endpoints.CREATEREZEPT);
    }

//    @PostMapping("post")
//    public void registerNewNutzer(@RequestBody Rezept rezept) {
//        rezeptService.addRezept(rezept);
//    }

}
