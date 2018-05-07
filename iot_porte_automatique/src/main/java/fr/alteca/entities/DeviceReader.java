package fr.alteca.entities;

import java.io.Serializable;
import java.util.Collection;

/**
 * {@link DeviceReader} Correspond au lecteur NFC ou GSM placé sur la porte
 * @author arekla
 *
 */
public class DeviceReader implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long deviceReaderId;
	private String deviceReaderName;
	private Door door;
	private Collection<Device> devices;
	
	public DeviceReader() {
		super();
	}

	public DeviceReader(String deviceReaderName) {
		super();
		this.deviceReaderName = deviceReaderName;
	}

	public Long getDeviceReaderId() {
		return deviceReaderId;
	}

	public void setDeviceReaderId(Long deviceReaderId) {
		this.deviceReaderId = deviceReaderId;
	}

	public String getDeviceReaderName() {
		return deviceReaderName;
	}

	public void setDeviceReaderName(String deviceReaderName) {
		this.deviceReaderName = deviceReaderName;
	}

	public Door getDoor() {
		return door;
	}

	public void setDoor(Door door) {
		this.door = door;
	}

	public Collection<Device> getDevices() {
		return devices;
	}

	public void setDevices(Collection<Device> devices) {
		this.devices = devices;
	}

	
}
