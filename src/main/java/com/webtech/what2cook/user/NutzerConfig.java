package com.webtech.what2cook.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class NutzerConfig {

    @Bean
    CommandLineRunner commandLineRunner(NutzerRepository nutzerRepository) {
        return args -> {
            Nutzer yannik = new Nutzer("Yannik", "Gassmann", "yannik.gassmann@gmail.com");

            Nutzer yannik2 = new Nutzer("Jan", "S###", "jan.###.com");

            nutzerRepository.saveAll(List.of(yannik, yannik2));
        };
    }
}
