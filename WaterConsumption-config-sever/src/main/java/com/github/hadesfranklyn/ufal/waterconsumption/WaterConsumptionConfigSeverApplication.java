package com.github.hadesfranklyn.ufal.waterconsumption;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class WaterConsumptionConfigSeverApplication {

	public static void main(String[] args) {
		SpringApplication.run(WaterConsumptionConfigSeverApplication.class, args);
	}

}
