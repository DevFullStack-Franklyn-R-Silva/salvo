package com.github.hadesfranklyn.ufal.waterconsumption.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.hadesfranklyn.ufal.waterconsumption.model.TapConsumption;

@Repository
public interface TapConsumptionRepository extends JpaRepository<TapConsumption, Long>{

}
