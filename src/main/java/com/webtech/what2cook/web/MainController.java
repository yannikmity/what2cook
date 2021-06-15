package com.webtech.what2cook.web;

import com.webtech.what2cook.config.Endpoints;
import com.webtech.what2cook.config.ViewNames;
import com.webtech.what2cook.persistence.Nutzer;
import com.webtech.what2cook.service.NutzerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@Controller
public class MainController {

    @RequestMapping(path = Endpoints.INDEX)
    public ModelAndView showIndexPage() {
        return new ModelAndView(ViewNames.INDEX);
    }

    @GetMapping(path = Endpoints.LOGIN)
    public ModelAndView showIndexPage1() {
        return new ModelAndView(ViewNames.LOGIN);
    }

    @GetMapping(path = Endpoints.PWVERGESSEN)
    public ModelAndView showIndexPage3() {
        return new ModelAndView(ViewNames.PWVERGESSEN);
    }

}
