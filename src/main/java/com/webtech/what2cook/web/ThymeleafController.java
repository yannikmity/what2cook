package com.webtech.what2cook.web;

import com.webtech.what2cook.config.Endpoints;
import com.webtech.what2cook.config.ViewNames;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThymeleafController {

    @GetMapping(path = Endpoints.INDEX)
    public ModelAndView showIndexPage() {
        return new ModelAndView(ViewNames.INDEX);
    }

    @GetMapping(path = Endpoints.LOGIN)
    public ModelAndView showIndexPage1() {
        return new ModelAndView(ViewNames.LOGIN);
    }

    @GetMapping(path = Endpoints.REGISTER)
    public ModelAndView showIndexPage2() {
        return new ModelAndView(ViewNames.REGISTER);
    }

    @GetMapping(path = Endpoints.PWVERGESSEN)
    public ModelAndView showIndexPage3() {
        return new ModelAndView(ViewNames.PWVERGESSEN);
    }

}
