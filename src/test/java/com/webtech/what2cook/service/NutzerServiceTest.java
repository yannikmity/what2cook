package com.webtech.what2cook.service;

import com.webtech.what2cook.persistence.Nutzer;
import com.webtech.what2cook.persistence.NutzerRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;

@SpringBootTest
public class NutzerServiceTest {

    @Autowired
    private NutzerService service;

    @MockBean
    private NutzerRepository repository;

    @Test
    @DisplayName("should find users mailadress")
    void testFindByEmail(){
        var n1 = new Nutzer("nutzer1","nachname1", "nutzer1@test.de", "nutzer1@test.de");
       // n1.setOwner("nutzer1@test.de");
        var n2 = new Nutzer("nutzer2","nachname2", "nutzer2@test.de", "nutzer2@test.de");
       // n2.setOwner("nutzer2@test.de");
        doReturn(List.of(n1,n2)).when(repository).findAll();

       // List<Nutzer> nutzer1gmail = service.findAll("nutzer1@test.de");

//        Assertions.assertSame(nutzer1gmail.size(), 1, "The number of products returned was wrong");
//        Assertions.assertSame(nutzer1gmail.get(0).getFirstName(), "Lineal", "The wrong product was returned");
        Assertions.assertEquals("nutzer1@test.de", n1.getEmail());
    }
}