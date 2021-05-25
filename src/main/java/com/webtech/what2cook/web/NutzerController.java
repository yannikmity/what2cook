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

import javax.ws.rs.Path;
import java.util.List;

import static com.webtech.what2cook.config.ApplicationUserRole.NUTZER;

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
        return new ModelAndView(ViewNames.REGISTERFOLGREICH);
    }

    //errorhandling mit controller?
    @GetMapping(Endpoints.REGISTERROR)
    public ModelAndView showFormError(Nutzer nutzer){
        return new ModelAndView(ViewNames.REGISTERROR);
    }


    @GetMapping()
    public String getAllRezepte(){
        return "login";
    }


//    @RequestMapping("api/v1/students")
    @GetMapping(path = "getUser")
    public List<Nutzer> getUser() {
        return nutzerService.getUser();
    }
//    public Nutzer getMyProfile(@PathVariable("id") Integer id) {
//        return NUTZER.stream()
//                .filter(nutzer -> id.equals(nutzer.getId()))
//                .findFirst()
//                .orElseThro(() -> new IllegalStateException(
//                        "Nutzer" + id + " does not exists"
//                ))
//    }

//
//    @PostMapping("post")
//    public void registerNewNutzer(@RequestBody Nutzer nutzer) {
//        nutzerService.addNewNutzer(nutzer);
//    }
//
//    @DeleteMapping("{nutzerId}")
//    public void deleteNutzer(@PathVariable("nutzerId") Long nutzerId) {
//        nutzerService.deleteNutzer(nutzerId);

    }

//    @Autowired
//    Environment environment;
//    @GetMapping("/print")
//    public String printJDBCCreds() {
//        return environment.getProperty("JDBC_DATABASE_URL");
//    }


