//package com.webtech.what2cook.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//@Configuration
//@EnableWebSecurity
//public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    private final PasswordEncoder passwordEncoder;
//
//    @Autowired
//    public ApplicationSecurityConfig(PasswordEncoder passwordEncoder) {
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .csrf().disable()
//                .authorizeRequests()
//                .antMatchers("/", "/register", "/css/*", "/js/*").permitAll()
//                .antMatchers("management/api/**").hasRole(ApplicationUserRole.NUTZER.name())
//                .antMatchers(HttpMethod.DELETE, "/management/api/**").hasAuthority(ApplicationUserPermission.NUTZER_READ.name())
//                .antMatchers(HttpMethod.POST, "/management/api/**").hasAuthority(ApplicationUserPermission.NUTZER_READ.name())
//                .antMatchers(HttpMethod.PUT, "/management/api/**").hasAuthority(ApplicationUserPermission.NUTZER_READ.name())
//                .antMatchers(HttpMethod.GET,"/management/api/**").hasAnyRole(ApplicationUserRole.ADMIN.name(), ApplicationUserRole.ADMINZWEI.name())
//                .anyRequest()
//                .authenticated()
//                .and()
//                .httpBasic();
//    }
//
//    @Override
//    @Bean
//    protected UserDetailsService userDetailsService() {
//        UserDetails nutzerUser = User.builder()
//                .username("nutzer1")
//                .password(passwordEncoder.encode("simsalabim123"))
//                .roles(ApplicationUserRole.NUTZER.name()) //ROLE_NUTZER
//                .build();
//
//
//        UserDetails adminUser = User.builder()
//                .username("admin1")
//                .password(passwordEncoder.encode("password123"))
//                .roles(ApplicationUserRole.ADMIN.name()) //ROLE_ADMIN
//                .build();
//
//        UserDetails admin2User = User.builder()
//                .username("admin2")
//                .password(passwordEncoder.encode("password123"))
//                .roles(ApplicationUserRole.ADMINZWEI.name()) //ROLE_ADMIN2
//                .build();
//
//        return new InMemoryUserDetailsManager(
//                nutzerUser,
//                adminUser,
//                admin2User
//        );
//    }
//
//}
