package com.ey.wamacademy.capstoneapi.model;

public class Instrument {

	private String instrumentId;
	private String instrumentTypes;

	public Instrument(String instrumentId, String instrumentTypes) {

		this.instrumentId = instrumentId;
		this.instrumentTypes = instrumentTypes;
	}

	public String getInstrumentId() {
		return instrumentId;
	}

	public void setInstrumentId(String instrumentId) {
		this.instrumentId = instrumentId;
	}

	public String getInstrumentTypes() {
		return instrumentTypes;
	}

	public void setInstrumentTypes(String instrumentTypes) {
		this.instrumentTypes = instrumentTypes;
	}

}
