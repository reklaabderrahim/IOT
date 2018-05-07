package fr.alteca.entities;

import java.io.Serializable;

/**
 * {@link Device} Correspond à un appareil (mobile ou badge) qui peut être lu par un lecteur NFC ou GSM
 * @author arekla
 *
 */
public abstract class Device implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long deviceId;
	private Person person;
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Long getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}

	
}
