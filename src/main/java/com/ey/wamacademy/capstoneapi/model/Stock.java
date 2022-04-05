package com.ey.wamacademy.capstoneapi.model;

public class Stock {

	private String ric;
	private String countryId;
	private String currency;
	private String industryId;
	private String instrumentId;
	private String sectorId;
	private String exchangeName;
	private String sedol;
	private String tickerSymbol;
	private String isin;
	private String instrumentName;

	public Stock(String ric, String countryId, String currency, String industryId, String instrumentId, String sectorId,
			String exchangeName, String sedol, String tickerSymbol, String isin, String instrumentName) {
		
		this.ric = ric;
		this.countryId = countryId;
		this.currency = currency;
		this.industryId = industryId;
		this.instrumentId = instrumentId;
		this.sectorId = sectorId;
		this.exchangeName = exchangeName;
		this.sedol = sedol;
		this.tickerSymbol = tickerSymbol;
		this.isin = isin;
		this.instrumentName = instrumentName;
	}

	public String getRic() {
		return ric;
	}

	public void setRic(String ric) {
		this.ric = ric;
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getIndustryId() {
		return industryId;
	}

	public void setIndustryId(String industryId) {
		this.industryId = industryId;
	}

	public String getInstrumentId() {
		return instrumentId;
	}

	public void setInstrumentId(String instrumentId) {
		this.instrumentId = instrumentId;
	}

	public String getSectorId() {
		return sectorId;
	}

	public void setSectorId(String sectorId) {
		this.sectorId = sectorId;
	}

	public String getExchangeName() {
		return exchangeName;
	}

	public void setExchangeName(String exchangeName) {
		this.exchangeName = exchangeName;
	}

	public String getSedol() {
		return sedol;
	}

	public void setSedol(String sedol) {
		this.sedol = sedol;
	}

	public String getTickerSymbol() {
		return tickerSymbol;
	}

	public void setTickerSymbol(String tickerSymbol) {
		this.tickerSymbol = tickerSymbol;
	}

	public String getIsin() {
		return isin;
	}

	public void setIsin(String isin) {
		this.isin = isin;
	}

	public String getInstrumentName() {
		return instrumentName;
	}

	public void setInstrumentName(String instrumentName) {
		this.instrumentName = instrumentName;
	}

}
