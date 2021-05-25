package com.webtech.what2cook.config;

import org.apache.tomcat.util.descriptor.LocalResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;

import java.util.Locale;

public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController(Endpoints.INDEX).setViewName(ViewNames.INDEX);
        registry.addViewController(Endpoints.LOGIN).setViewName(ViewNames.LOGIN);
        registry.addViewController(Endpoints.REGISTER).setViewName(ViewNames.REGISTER);
        registry.addViewController(Endpoints.REGISTERFOLGREICH).setViewName(ViewNames.REGISTER);
        registry.addViewController(Endpoints.PWVERGESSEN).setViewName(ViewNames.PWVERGESSEN);
    }

    @Bean
    LocaleResolver localResolver(){
        return new FixedLocaleResolver(Locale.GERMAN);
    }

}
