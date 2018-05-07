package fr.alteca.entities;

import java.io.Serializable;
import java.util.Collection;

/**
 * {@link Agency} Correspond à l'agence dans laquelle travaille la personne
 * @author arekla
 *
 */
public class Agency implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long agencyId;
	private String agancyName;
	private Collection<Person> persons;
	
	public Agency() {
		super();
	}

	public Agency(String agancyName) {
		super();
		this.agancyName = agancyName;
	}

	public Long getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(Long agencyId) {
		this.agencyId = agencyId;
	}

	public String getAgancyName() {
		return agancyName;
	}

	public void setAgancyName(String agancyName) {
		this.agancyName = agancyName;
	}

	public Collection<Person> getPersons() {
		return persons;
	}

	public void setPersons(Collection<Person> persons) {
		this.persons = persons;
	}
	
	
}
