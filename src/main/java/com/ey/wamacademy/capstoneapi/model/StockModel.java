package com.ey.wamacademy.capstoneapi.model;

import java.sql.Date;

public class StockModel {

	private Date stockPriceEffectiveDate;
	private float closePrice;
	private float openPrice;
	private float highPrice;
	private float lowPrice;
	private float dailyTradedVolume;
	private float dailyReturn;

	public Date getStockPriceEffectiveDate() {
		return stockPriceEffectiveDate;
	}

	public void setStockPriceEffectiveDate(Date stockPriceEffectiveDate) {
		this.stockPriceEffectiveDate = stockPriceEffectiveDate;
	}

	public float getClosePrice() {
		return closePrice;
	}

	public void setClosePrice(float closePrice) {
		this.closePrice = closePrice;
	}

	public float getOpenPrice() {
		return openPrice;
	}

	public void setOpenPrice(float openPrice) {
		this.openPrice = openPrice;
	}

	public float getHighPrice() {
		return highPrice;
	}

	public void setHighPrice(float highPrice) {
		this.highPrice = highPrice;
	}

	public float getLowPrice() {
		return lowPrice;
	}

	public void setLowPrice(float lowPrice) {
		this.lowPrice = lowPrice;
	}

	public float getDailyTradedVolume() {
		return dailyTradedVolume;
	}

	public void setDailyTradedVolume(float dailyTradedVolume) {
		this.dailyTradedVolume = dailyTradedVolume;
	}

	public float getDailyReturn() {
		return dailyReturn;
	}

	public void setDailyReturn(float dailyReturn) {
		this.dailyReturn = dailyReturn;
	}

}
