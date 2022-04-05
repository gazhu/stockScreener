package com.ey.wamacademy.capstoneapi.model;

public class Sector {

	private String sectorId;
	private String sectorName;

	public Sector(String sectorId, String sectorName) {

		this.sectorId = sectorId;
		this.sectorName = sectorName;
	}

	public String getSectorId() {
		return sectorId;
	}

	public void setSectorId(String sectorId) {
		this.sectorId = sectorId;
	}

	public String getSectorName() {
		return sectorName;
	}

	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}

}
