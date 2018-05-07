package fr.alteca.entities;

import java.io.Serializable;
/**
 * {@link Area} Correspond à une zone dans une agence
 * @author arekla
 *
 */
public class Area implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long areaId;
	private String areaName;
	private Agency agency;
	
	public Area() {
		super();
	}

	public Area(String areaName) {
		super();
		this.areaName = areaName;
	}

	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public Agency getAgency() {
		return agency;
	}

	public void setAgency(Agency agency) {
		this.agency = agency;
	}
	
	
}
