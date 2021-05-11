package com.webtech.what2cook.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface RezeptRepository extends JpaRepository<Rezept, Long> {

    @Query("SELECT r FROM Rezept r WHERE r.name =?1")
    Optional<Rezept> findRezeptByName(String strMeal);

}
