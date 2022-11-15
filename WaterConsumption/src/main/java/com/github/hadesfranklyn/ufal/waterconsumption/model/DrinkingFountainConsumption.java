package com.github.hadesfranklyn.ufal.waterconsumption.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DrinkingFountainConsumption implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// Consumo por aparelho
	private Double drinkingFountain; // bebedouro

	// Consumo médio (per capita) diário por aparelho
	private Double averageDrinkingWaterConsumption;

	private Users numberOfUsers;

	// constructors
	public DrinkingFountainConsumption() {
		super();
	}

	public DrinkingFountainConsumption(Long id, Double drinkingFountain, Double averageDrinkingWaterConsumption,
			Users numberOfUsers) {
		super();
		this.id = id;
		this.drinkingFountain = drinkingFountain;
		this.averageDrinkingWaterConsumption = averageDrinkingWaterConsumption;
		this.numberOfUsers = numberOfUsers;
	}

	// get and set
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getDrinkingFountain() {
		return drinkingFountain;
	}

	public void setDrinkingFountain(Double drinkingFountain) {
		this.drinkingFountain = drinkingFountain;
	}

	public Double getAverageDrinkingWaterConsumption() {
		return averageDrinkingWaterConsumption;
	}

	public void setAverageDrinkingWaterConsumption(Double averageDrinkingWaterConsumption) {
		this.averageDrinkingWaterConsumption = averageDrinkingWaterConsumption;
	}

	public Users getNumberOfUsers() {
		return numberOfUsers;
	}

	public void setNumberOfUsers(Users numberOfUsers) {
		this.numberOfUsers = numberOfUsers;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DrinkingFountainConsumption [id=");
		builder.append(id);
		builder.append(", drinkingFountain=");
		builder.append(drinkingFountain);
		builder.append(", averageDrinkingWaterConsumption=");
		builder.append(averageDrinkingWaterConsumption);
		builder.append(", numberOfUsers=");
		builder.append(numberOfUsers);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DrinkingFountainConsumption other = (DrinkingFountainConsumption) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
