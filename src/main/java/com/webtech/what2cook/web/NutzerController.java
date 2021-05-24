package com.webtech.what2cook.web;


import com.webtech.what2cook.config.Endpoints;
import com.webtech.what2cook.config.ViewNames;
import com.webtech.what2cook.persistence.Nutzer;
import com.webtech.what2cook.service.NutzerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@Controller
//@RequestMapping(path = "nutzer")
public class NutzerController {

    private final NutzerService nutzerService;

    @Autowired
    public NutzerController(NutzerService nutzerService) {
        this.nutzerService = nutzerService;
    }

    @GetMapping(Endpoints.REGISTER)
    public ModelAndView showForm(Model model){
        Nutzer nutzer = new Nutzer();
        model.addAttribute("nutzer", nutzer);
        return new ModelAndView(ViewNames.REGISTER);
    }
    @PostMapping(Endpoints.REGISTER)
    public ModelAndView submitForm(@ModelAttribute("nutzer") Nutzer nutzer) {
        nutzerService.addNewNutzer(nutzer);
        System.out.println(nutzer);
        return new ModelAndView(ViewNames.REGISTERFOLGREICH);
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
