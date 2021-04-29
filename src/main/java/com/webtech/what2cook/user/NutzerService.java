package com.webtech.what2cook.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NutzerService {

    private final NutzerRepository nutzerRepository;

    @Autowired
    public NutzerService(NutzerRepository nutzerRepository) {
        this.nutzerRepository = nutzerRepository;
    }

    public List<Nutzer> getUser (){
        return nutzerRepository.findAll();
    }

    public void addNewNutzer(Nutzer nutzer) {
        Optional<Nutzer> nutzerByEmail = nutzerRepository.findNutzerByEmail(nutzer.getEmail());
        if (nutzerByEmail.isPresent()){
            throw new IllegalStateException("email taken");
        }

        nutzerRepository.save(nutzer);
    }

    public void deleteNutzer(Nutzer nutzer){

    }
}
