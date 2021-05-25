package com.webtech.what2cook.persistence;

import com.webtech.what2cook.persistence.Nutzer;
import com.webtech.what2cook.persistence.NutzerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class NutzerConfig {
    @Bean
    CommandLineRunner commandLineRunner(NutzerRepository nutzerRepository) {
        return args -> {
            Nutzer nutzer1 = new Nutzer("nutzer1", "nachname1", "nummer1@test.com");
            Nutzer nutzer2 = new Nutzer("nutzer2", "nachname2", "nummer2@test.com");
            nutzerRepository.saveAll(List.of(nutzer1, nutzer2));
        };
    }
}
