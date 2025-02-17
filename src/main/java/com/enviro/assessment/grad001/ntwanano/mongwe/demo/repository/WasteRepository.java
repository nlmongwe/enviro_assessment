package com.enviro.assessment.grad001.ntwanano.mongwe.demo.repository;

import com.enviro.assessment.grad001.ntwanano.mongwe.demo.model.Waste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WasteRepository extends JpaRepository<Waste, Integer> {

    @Query("SELECT w FROM Waste w WHERE w.name = :name")
    Optional<Waste> findWasteByName(String name);

}
