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
public class NutzerController {

    private final NutzerService nutzerService;

    @Autowired
    public NutzerController(NutzerService nutzerService) {
        this.nutzerService = nutzerService;
    }

    @GetMapping(Endpoints.REGISTER)
    public ModelAndView showForm(Model model) {
        Nutzer nutzer = new Nutzer();
        model.addAttribute("nutzer", nutzer);
        return new ModelAndView(ViewNames.REGISTER);
    }

    @PostMapping(Endpoints.REGISTER)
    public ModelAndView submitForm(@ModelAttribute("nutzer") Nutzer nutzer) {
        try {
            nutzerService.addNewNutzer(nutzer);
        } catch (IllegalStateException e) {
            return new ModelAndView(ViewNames.REGISTERROR);
        }
        return new ModelAndView(ViewNames.REGISTERFOLGREICH);
    }

    @GetMapping(Endpoints.REGISTERROR)
    public ModelAndView showFormError(Nutzer nutzer) {
        return new ModelAndView(ViewNames.REGISTERROR);
    }


    @GetMapping(path = "/api/getUser")
    public List<Nutzer> getUser() {
        return nutzerService.getUser();
    }


    @DeleteMapping("{nutzerId}")
    public void deleteNutzer(@PathVariable("nutzerId") Long nutzerId) {
        nutzerService.deleteNutzer(nutzerId);

    }

//    public Nutzer getMyProfile(@PathVariable("id") Integer id) {
//        return NUTZER.stream()
//                .filter(nutzer -> id.equals(nutzer.getId()))
//                .findFirst()
//                .orElseThro(() -> new IllegalStateException(
//                        "Nutzer" + id + " does not exists"
//                ));
//    }
}

//    @Autowired
//    Environment environment;
//    @GetMapping("/print")
//    public String printJDBCCreds() {
//        return environment.getProperty("JDBC_DATABASE_URL");
//    }


