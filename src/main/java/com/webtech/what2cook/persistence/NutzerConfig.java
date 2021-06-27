package com.webtech.what2cook.persistence;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class NutzerConfig {
    @Bean
    CommandLineRunner commandLineRunner(NutzerRepository nutzerRepository) {
        return args -> {
            Nutzer nutzer1 = new Nutzer("nutzer1", "nachname1", "nutzer1@test.de", "nutzer1@test.de");
            Nutzer nutzer2 = new Nutzer("nutzer2", "nachname2", "nutzer2@test.de", "nutzer2@test.de");
            nutzerRepository.saveAll(List.of(nutzer1, nutzer2));
        };
    }
}
