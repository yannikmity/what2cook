package com.webtech.what2cook.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.client.oidc.web.logout.OidcClientInitiatedLogoutSuccessHandler;
//import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
//import org.springframework.security.web.access.AccessDeniedHandler;
//
//import java.net.URI;
//
//
//@Configuration
//@EnableWebSecurity
//class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    ClientRegistrationRepository clientRegistrationRepository;
//
//    OidcClientInitiatedLogoutSuccessHandler oidcClientInitiatedLogoutSuccessHandler(){
//        OidcClientInitiatedLogoutSuccessHandler successHandler = new OidcClientInitiatedLogoutSuccessHandler(clientRegistrationRepository);
//        successHandler.setPostLogoutRedirectUri(URI.create("https://what2cook-yangoe.herokuapp.com/"));
//        //successHandler.setPostLogoutRedirectUri(URI.create("http://localhost:8080"));
//        //nur eins von beiden funktioniert und wir benötigen die Herokuadresse
//        return successHandler;
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception{
//        http.authorizeRequests()
//
//                //allow anonymous acces to the root page
//                .antMatchers(Endpoints.MEINEREZEPTE).permitAll()
//                .antMatchers(
//                        "/css/**",
//                        "/img/**",
//                        "/js/**").permitAll();
//
//
//                //all other requests
//                .anyRequest().authenticated().and().exceptionHandling().accessDeniedHandler(new CustomAccessDeniedHandler())
//
//
//                //Rp-initiated logout
//                .and().logout().logoutSuccessHandler(oidcClientInitiatedLogoutSuccessHandler());
//    }
//
//    @Bean
//    public AccessDeniedHandler accessDeniedHandler(){
//        return new CustomAccessDeniedHandler();
//    }
//}
