package fr.alteca.entities;

import java.io.Serializable;

/**
 * {@link Responsability} Correspond aux résponsabilités qui peut avoir une fonction donnée
 * @author arekla
 *
 */
public class Responsability implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long responsabilityId;
	private String responsabilityName;
	
	public Responsability() {
		super();
	}

	public Responsability(String responsabilityName) {
		super();
		this.responsabilityName = responsabilityName;
	}

	public Long getResponsabilityId() {
		return responsabilityId;
	}

	public void setResponsabilityId(Long responsabilityId) {
		this.responsabilityId = responsabilityId;
	}

	public String getResponsabilityName() {
		return responsabilityName;
	}

	public void setResponsabilityName(String responsabilityName) {
		this.responsabilityName = responsabilityName;
	}

	
}
