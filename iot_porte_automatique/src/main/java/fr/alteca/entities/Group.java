package fr.alteca.entities;

import java.io.Serializable;
import java.util.Collection;

/**
 * {@link Group} Correspond à un groupe de personnes, mais ça peut contenir une seule personne
 * et c'est pour ce groupe là qu'on donne des habilitations
 * @author arekla
 *
 */
public class Group implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long groupId;
	private String groupName;
	private String groupRole;
	private Collection<Person> persons;
	private Collection<Door> doors;
	private Collection<Schedule> schedules;
	
	public Group() {
		super();
	}

	public Group(String groupName, String groupRole) {
		super();
		this.groupName = groupName;
		this.groupRole = groupRole;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupRole() {
		return groupRole;
	}

	public void setGroupRole(String groupRole) {
		this.groupRole = groupRole;
	}

	public Collection<Person> getPersons() {
		return persons;
	}

	public void setPersons(Collection<Person> persons) {
		this.persons = persons;
	}

	public Collection<Door> getDoors() {
		return doors;
	}

	public void setDoors(Collection<Door> doors) {
		this.doors = doors;
	}

	public Collection<Schedule> getSchedules() {
		return schedules;
	}

	public void setSchedules(Collection<Schedule> schedules) {
		this.schedules = schedules;
	}

	
}
