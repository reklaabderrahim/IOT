package fr.alteca.entities;

public class GsmDevice extends Device {
	private static final long serialVersionUID = 1L;
	
	private String phoneNumber;

	public GsmDevice() {
		super();
	}

	public GsmDevice(String phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
