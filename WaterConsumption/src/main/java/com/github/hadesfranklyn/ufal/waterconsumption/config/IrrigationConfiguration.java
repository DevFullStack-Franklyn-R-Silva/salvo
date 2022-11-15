package com.github.hadesfranklyn.ufal.waterconsumption.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
@ConfigurationProperties("water-consumption-service")
public class IrrigationConfiguration {

	private Double irrigationArea;
	private Double appliedBlade;

	public IrrigationConfiguration() {
	}

	public Double getIrrigationArea() {
		return irrigationArea;
	}

	public void setIrrigationArea(Double irrigationArea) {
		this.irrigationArea = irrigationArea;
	}

	public Double getAppliedBlade() {
		return appliedBlade;
	}

	public void setAppliedBlade(Double appliedBlade) {
		this.appliedBlade = appliedBlade;
	}

	
}
