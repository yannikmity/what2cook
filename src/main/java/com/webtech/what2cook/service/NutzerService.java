package com.webtech.what2cook.service;

import com.webtech.what2cook.config.Endpoints;
import com.webtech.what2cook.config.ViewNames;
import com.webtech.what2cook.persistence.Nutzer;
import com.webtech.what2cook.persistence.NutzerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class NutzerService {

    @Autowired
    private final NutzerRepository nutzerRepository;


    public NutzerService(NutzerRepository nutzerRepository) {
        this.nutzerRepository = nutzerRepository;
    }

    public List<Nutzer> findAll(String userEmail) {

        var iterator = nutzerRepository.findAll();

        var nutzers = new ArrayList<Nutzer>();
        for (Nutzer n : iterator) {
            if(n.getOwner()!=null && n.getOwner().equals(userEmail)) nutzers.add(n);
        }

        return nutzers;
    }

//    public List<Nutzer> getUser (){
//        return nutzerRepository.findAll();
//    }

    public void addNewNutzer(Nutzer nutzer) {

        Optional<Nutzer> nutzerByEmail = nutzerRepository.findNutzerByEmail(nutzer.getEmail());
        if (nutzerByEmail.isPresent()){

            throw new IllegalStateException("email taken");
        }
        nutzerRepository.save(nutzer);
    }

    public void deleteNutzer(Long nutzerId){
        boolean exists = nutzerRepository.existsById(nutzerId);
        if(!exists){
            throw new IllegalStateException("nutzer mit id"+"existiert nicht");
        }
        nutzerRepository.deleteById(nutzerId);

    }
}
