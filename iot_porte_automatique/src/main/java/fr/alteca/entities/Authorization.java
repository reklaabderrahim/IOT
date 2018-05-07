package fr.alteca.entities;

import java.io.Serializable;
/**
 * {@link Authorization} Correspond aux portes, zones, agences dans lesquelles un utilisateur à le droit d'y accéder
 * @author arekla
 *
 */
public class Authorization implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long authorizationId;
	private Long authorizedDoorId;
	private Duty duty;
	
	public Authorization() {
		super();
	}

	public Authorization(Long authorizedDoorId) {
		super();
		this.authorizedDoorId = authorizedDoorId;
	}

	public Long getAuthorizationId() {
		return authorizationId;
	}

	public void setAuthorizationId(Long authorizationId) {
		this.authorizationId = authorizationId;
	}

	public Long getAuthorizedDoorId() {
		return authorizedDoorId;
	}

	public void setAuthorizedDoorId(Long authorizedDoorId) {
		this.authorizedDoorId = authorizedDoorId;
	}

	public Duty getDuty() {
		return duty;
	}

	public void setDuty(Duty duty) {
		this.duty = duty;
	}
	
	
}
