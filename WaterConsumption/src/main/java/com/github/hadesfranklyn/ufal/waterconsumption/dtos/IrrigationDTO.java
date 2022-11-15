package com.github.hadesfranklyn.ufal.waterconsumption.dtos;

import java.io.Serializable;

import com.github.hadesfranklyn.ufal.waterconsumption.model.Irrigation;

public class IrrigationDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private Double irrigationArea;
	private Double appliedBlade;

	public IrrigationDTO() {
	}

	public IrrigationDTO(Long id, Double irrigationArea, Double appliedBlade) {
		this.id = id;
		this.irrigationArea = irrigationArea;
		this.appliedBlade = appliedBlade;
	}
	
	public IrrigationDTO(Irrigation irrigation) {
		this.id = irrigation.getId();
		this.irrigationArea = irrigation.getIrrigationArea();
		this.appliedBlade = irrigation.getAppliedBlade();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
