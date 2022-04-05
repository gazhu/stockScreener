package com.ey.wamacademy.capstoneapi.model;

public class Exchange {

	private String exchange;
	private String exchangeName;

	public Exchange(String exchange, String exchangeName) {

		this.exchange = exchange;
		this.exchangeName = exchangeName;
	}

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public String getExchangeName() {
		return exchangeName;
	}

	public void setExchangeName(String exchangeName) {
		this.exchangeName = exchangeName;
	}

}
