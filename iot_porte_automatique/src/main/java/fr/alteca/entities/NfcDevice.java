package fr.alteca.entities;

public class NfcDevice extends Device {
	private static final long serialVersionUID = 1L;
	
	private String macAdress;

	public NfcDevice() {
		super();
	}

	public NfcDevice(String macAdress) {
		super();
		this.macAdress = macAdress;
	}

	public String getMacAdress() {
		return macAdress;
	}

	public void setMacAdress(String macAdress) {
		this.macAdress = macAdress;
	}
	
	
}
