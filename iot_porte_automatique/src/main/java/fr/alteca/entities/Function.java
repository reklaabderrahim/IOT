package fr.alteca.entities;

import java.io.Serializable;
import java.util.Collection;

/**
 * {@link Function} Correspond à la fonction qui a été attribuée à un utilisateur
 * @author arekla
 *
 */
public class Function implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long functionId;
	private String functionName;
	private User utilisateur;
	private Collection<Responsability> responsabilities;
	
	public Function() {
		super();
	}

	public Function(String functionName) {
		super();
		this.functionName = functionName;
	}

	public Long getFunctionId() {
		return functionId;
	}

	public void setFunctionId(Long functionId) {
		this.functionId = functionId;
	}

	public String getFunctionName() {
		return functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public User getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(User utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Collection<Responsability> getResponsabilities() {
		return responsabilities;
	}

	public void setResponsabilities(Collection<Responsability> responsabilities) {
		this.responsabilities = responsabilities;
	}

	
	
}
