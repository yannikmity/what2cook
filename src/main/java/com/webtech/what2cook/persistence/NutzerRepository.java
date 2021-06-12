package com.webtech.what2cook.persistence;

import com.webtech.what2cook.persistence.Nutzer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NutzerRepository extends JpaRepository<Nutzer, Long> {

    @Query("SELECT n FROM Nutzer n WHERE n.email =?1")
    Optional<Nutzer> findNutzerByEmail(String email);

}
