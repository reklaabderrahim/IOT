package fr.alteca.entities;

import java.io.Serializable;
import java.util.Collection;

/**
 * {@link Door} Correspond à un Bureau ou un espace quelconque avec une porte pour y accéder
 * @author arekla
 *
 */
public class Door implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long doorId;
	private String doorName;
	private Area area;
	private DeviceReader deviceReader;
	private Collection<Group> groups;
	private Collection<Schedule> schedules;
	
	public Door() {
		super();
	}

	public Door(String doorName) {
		super();
		this.doorName = doorName;
	}

	public Long getDoorId() {
		return doorId;
	}

	public void setDoorId(Long doorId) {
		this.doorId = doorId;
	}

	public String getDoorName() {
		return doorName;
	}

	public void setDoorName(String doorName) {
		this.doorName = doorName;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public DeviceReader getDeviceReader() {
		return deviceReader;
	}

	public void setDeviceReader(DeviceReader deviceReader) {
		this.deviceReader = deviceReader;
	}

	public Collection<Group> getGroups() {
		return groups;
	}

	public void setGroups(Collection<Group> groups) {
		this.groups = groups;
	}

	public Collection<Schedule> getSchedules() {
		return schedules;
	}

	public void setSchedules(Collection<Schedule> schedules) {
		this.schedules = schedules;
	}
}
