package fr.alteca.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * {@link Schedule} Correspond à la plage horaire durant laquelle une personne est autorisée à accéder aux locaux
 * @author arekla
 *
 */
public class Schedule implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long scheduleId;
	private Timestamp startTime;
	private Timestamp endTime;
	private Collection<Door> doors;
	private Collection<Group> groups;
	
	public Schedule() {
		super();
	}

	public Schedule(Timestamp startTime, Timestamp endTime) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public Long getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(Long scheduleId) {
		this.scheduleId = scheduleId;
	}

	public Timestamp getStartTime() {
		return startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Timestamp getEndTime() {
		return endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public Collection<Door> getDoors() {
		return doors;
	}

	public void setDoors(Collection<Door> doors) {
		this.doors = doors;
	}

	public Collection<Group> getGroups() {
		return groups;
	}

	public void setGroups(Collection<Group> groups) {
		this.groups = groups;
	}

	
}
