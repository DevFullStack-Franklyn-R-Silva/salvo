package com.github.hadesfranklyn.ufal.waterconsumption.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ToiletConsumption implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// Consumo por aparelho
	private Double toilet; // vaso

	// Consumo médio (per capita) diário por aparelho;
	private Double averageConsumptionOfTheToilet;

	private Users numberOfUsers;

	// constructors
	public ToiletConsumption() {
		super();
	}

	public ToiletConsumption(Long id, Double toilet, Double averageConsumptionOfTheToilet, Users numberOfUsers) {
		super();
		this.id = id;
		this.toilet = toilet;
		this.averageConsumptionOfTheToilet = averageConsumptionOfTheToilet;
		this.numberOfUsers = numberOfUsers;
	}

	// get and set
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getToilet() {
		return toilet;
	}

	public void setToilet(Double toilet) {
		this.toilet = toilet;
	}

	public Double getAverageConsumptionOfTheToilet() {
		return averageConsumptionOfTheToilet;
	}

	public void setAverageConsumptionOfTheToilet(Double averageConsumptionOfTheToilet) {
		this.averageConsumptionOfTheToilet = averageConsumptionOfTheToilet;
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
		builder.append("ToiletConsumption [id=");
		builder.append(id);
		builder.append(", toilet=");
		builder.append(toilet);
		builder.append(", averageConsumptionOfTheToilet=");
		builder.append(averageConsumptionOfTheToilet);
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
		ToiletConsumption other = (ToiletConsumption) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
