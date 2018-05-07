package fr.alteca.entities;

import java.io.Serializable;
import java.util.Collection;
/**
 * {@link User} Correspond à une personne qui le droit de se connecter à l'application
 * @author arekla
 *
 */
public class User implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long userId;
	private String userLogin;
	private String userPassword;
	private Person person;
	private Function function;
	private Collection<Authorization> authorizations;
	
	public User() {
		super();
	}

	public User(String userLogin, String userPassword) {
		super();
		this.userLogin = userLogin;
		this.userPassword = userPassword;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Function getFunction() {
		return function;
	}

	public void setFunction(Function function) {
		this.function = function;
	}

	public Collection<Authorization> getAuthorizations() {
		return authorizations;
	}

	public void setAuthorizations(Collection<Authorization> authorizations) {
		this.authorizations = authorizations;
	}

	

}
