package fr.alteca.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * {@link Person} désigne toutes les personnes qui ont le droit d'accéder aux locaux
 * @author arekla
 *
 */
@Entity
public class Person implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long personId;
	private String personLastName;
	private String personFirstName;
	private Date personBirthDay;
	private String personEmailAdress;
	@OneToOne(mappedBy="person")
	private User utilisateur;
	/*private Collection<Group >groupes;
	private Collection<Device> devices;
	private Collection<Agency> agencies;*/
	
	public Person() {
		super();
	}

	/*public Person(String personLastName, String personFirstName, Date personBirthDay, String personEmailAdress) {
		super();
		this.personLastName = personLastName;
		this.personFirstName = personFirstName;
		this.personBirthDay = personBirthDay;
		this.personEmailAdress = personEmailAdress;
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public String getPersonLastName() {
		return personLastName;
	}

	public void setPersonLastName(String personLastName) {
		this.personLastName = personLastName;
	}

	public String getPersonFirstName() {
		return personFirstName;
	}

	public void setPersonFirstName(String personFirstName) {
		this.personFirstName = personFirstName;
	}

	public Date getPersonBirthDay() {
		return personBirthDay;
	}

	public void setPersonBirthDay(Date personBirthDay) {
		this.personBirthDay = personBirthDay;
	}

	public String getPersonEmailAdress() {
		return personEmailAdress;
	}

	public void setPersonEmailAdress(String personEmailAdress) {
		this.personEmailAdress = personEmailAdress;
	}

	public User getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(User utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Collection<Group> getGroupes() {
		return groupes;
	}

	public void setGroupes(Collection<Group> groupes) {
		this.groupes = groupes;
	}

	public Collection<Device> getDevices() {
		return devices;
	}

	public void setDevices(Collection<Device> devices) {
		this.devices = devices;
	}

	public Collection<Agency> getAgencies() {
		return agencies;
	}

	public void setAgencies(Collection<Agency> agencies) {
		this.agencies = agencies;
	}
	*/
	
}
