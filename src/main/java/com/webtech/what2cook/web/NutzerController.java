package com.webtech.what2cook.web;

import com.webtech.what2cook.config.Endpoints;
import com.webtech.what2cook.config.ViewNames;
import com.webtech.what2cook.persistence.Nutzer;
import com.webtech.what2cook.service.NutzerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import javax.ws.rs.Path;
import java.util.List;
//import static com.webtech.what2cook.config.ApplicationUserRole.NUTZER;

@RestController
@Controller
public class NutzerController {

    private final NutzerService nutzerService;

    @Autowired
    public NutzerController(NutzerService nutzerService) {
        this.nutzerService = nutzerService;
    }

    @GetMapping(Endpoints.REGISTER)
    public ModelAndView showForm(@AuthenticationPrincipal OidcUser user, Model model) {
        Nutzer nutzer = new Nutzer();
        model.addAttribute("nutzer", nutzer);
        return new ModelAndView(ViewNames.REGISTER);
    }

    @PostMapping(Endpoints.REGISTER)
    public ModelAndView submitForm(@AuthenticationPrincipal OidcUser user, @ModelAttribute Nutzer nutzer, Model model) {
        try {
            nutzer.setOwner(user.getEmail());
            nutzerService.addNewNutzer(nutzer);
            model.addAttribute("nutzer", nutzer);
        } catch (IllegalStateException e) {
            return new ModelAndView(ViewNames.REGISTERROR);
        }
        return new ModelAndView(ViewNames.REGISTERFOLGREICH);
    }

    @GetMapping(Endpoints.REGISTERROR)
    public ModelAndView showFormError(Nutzer nutzer) {
        return new ModelAndView(ViewNames.REGISTERROR);
    }


//    @GetMapping(path = "/api/getUser")
//    public List<Nutzer> getUser() {
//        return nutzerService.getUser();
//    }


    @DeleteMapping("{nutzerId}")
    public void deleteNutzer(@PathVariable("nutzerId") Long nutzerId) {
        nutzerService.deleteNutzer(nutzerId);

    }


    //Nur als test hinzugef??gt, da man bei der securityconfig mindestens ein pfad braucht, wo man auch ungeloggt rein darf.
//    @GetMapping(Endpoints.MEINEREZEPTE)
//    public ModelAndView showFood(@AuthenticationPrincipal OidcUser user, Model model) {;
//        return new ModelAndView(ViewNames.MEINEREZEPTE);
//    }

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


