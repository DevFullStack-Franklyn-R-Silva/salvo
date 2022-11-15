package com.github.hadesfranklyn.ufal.waterconsumption.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.hadesfranklyn.ufal.waterconsumption.services.DBService;

@Configuration
public class TestConfig {

	@Autowired
	private DBService dbService;

	@Bean
	public boolean instantieteDatabase() throws ParseException {

		dbService.instantieteTestDatabase();
		return true;
	}
	
	
}