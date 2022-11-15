package com.github.hadesfranklyn.ufal.waterconsumption.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.hadesfranklyn.ufal.waterconsumption.model.UrinalConsumption;

@Repository
public interface UrinalConsumptionRepository extends JpaRepository<UrinalConsumption, Long>{

}
