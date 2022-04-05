package com.ey.wamacademy.capstoneapi.model;

public class Industry {

	private String industryDetails;
	private String industryName;

	public Industry(String industryDetails, String industryName) {

		this.industryDetails = industryDetails;
		this.industryName = industryName;
	}

	public String getIndustryDetails() {
		return industryDetails;
	}

	public void setIndustryDetails(String industryDetails) {
		this.industryDetails = industryDetails;
	}

	public String getIndustryName() {
		return industryName;
	}

	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}

}
