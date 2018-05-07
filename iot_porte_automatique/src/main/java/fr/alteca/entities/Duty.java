package fr.alteca.entities;

import java.io.Serializable;

/**
 * {@link Duty} Correspond au droit soit en écriture_lecture ou soit en lecture seulement
 * @author arekla
 *
 */
public class Duty implements Serializable{
	private static final long serialVersionUID = 1L;

	private int dutyId;
	private String dutyType;
	
	public Duty() {
		super();
	}

	public Duty(String dutyType) {
		super();
		this.dutyType = dutyType;
	}

	public int getDutyId() {
		return dutyId;
	}

	public void setDutyId(int dutyId) {
		this.dutyId = dutyId;
	}

	public String getDutyType() {
		return dutyType;
	}

	public void setDutyType(String dutyType) {
		this.dutyType = dutyType;
	}
	
	
}
