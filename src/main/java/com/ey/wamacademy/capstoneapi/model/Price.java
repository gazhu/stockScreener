package com.ey.wamacademy.capstoneapi.model;

import java.sql.Date;

public class Price {

	private int stockId;
	private double openPrice;
	private double closePrice;
	private double highPrice;
	private double lowPrice;
	private int dailyTradeVolumes;
	private double companyMarketCapitalization;
	private float beta;
	private float revenue;
	private float earningsPerShare;
	private float pe;
	private Date date;

	public Price(int stockId, double openPrice, double closePrice, double highPrice, double lowPrice,
			int dailyTradeVolumes, double companyMarketCapitalization, float beta, float revenue,
			float earningsPerShare, float pe, Date date) {

		this.stockId = stockId;
		this.openPrice = openPrice;
		this.closePrice = closePrice;
		this.highPrice = highPrice;
		this.lowPrice = lowPrice;
		this.dailyTradeVolumes = dailyTradeVolumes;
		this.companyMarketCapitalization = companyMarketCapitalization;
		this.beta = beta;
		this.revenue = revenue;
		this.earningsPerShare = earningsPerShare;
		this.pe = pe;
		this.date = date;
	}

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public double getOpenPrice() {
		return openPrice;
	}

	public void setOpenPrice(double openPrice) {
		this.openPrice = openPrice;
	}

	public double getClosePrice() {
		return closePrice;
	}

	public void setClosePrice(double closePrice) {
		this.closePrice = closePrice;
	}

	public double getHighPrice() {
		return highPrice;
	}

	public void setHighPrice(double highPrice) {
		this.highPrice = highPrice;
	}

	public double getLowPrice() {
		return lowPrice;
	}

	public void setLowPrice(double lowPrice) {
		this.lowPrice = lowPrice;
	}

	public int getDailyTradeVolumes() {
		return dailyTradeVolumes;
	}

	public void setDailyTradeVolumes(int dailyTradeVolumes) {
		this.dailyTradeVolumes = dailyTradeVolumes;
	}

	public double getCompanyMarketCapitalization() {
		return companyMarketCapitalization;
	}

	public void setCompanyMarketCapitalization(double companyMarketCapitalization) {
		this.companyMarketCapitalization = companyMarketCapitalization;
	}

	public float getBeta() {
		return beta;
	}

	public void setBeta(float beta) {
		this.beta = beta;
	}

	public float getRevenue() {
		return revenue;
	}

	public void setRevenue(float revenue) {
		this.revenue = revenue;
	}

	public float getEarningsPerShare() {
		return earningsPerShare;
	}

	public void setEarningsPerShare(float earningsPerShare) {
		this.earningsPerShare = earningsPerShare;
	}

	public float getPe() {
		return pe;
	}

	public void setPe(float pe) {
		this.pe = pe;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
