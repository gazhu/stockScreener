package com.ey.wamacademy.capstoneapi.model;

import java.sql.Date;

public class Return {

	private int stockId;
	private Date date;
	private double returns;
	private String returnType;

	public Return(int stockId, Date date, double returns, String returnType) {

		this.stockId = stockId;
		this.date = date;
		this.returns = returns;
		this.returnType = returnType;
	}

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getReturns() {
		return returns;
	}

	public void setReturns(double returns) {
		this.returns = returns;
	}

	public String getReturnType() {
		return returnType;
	}

	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}

}
