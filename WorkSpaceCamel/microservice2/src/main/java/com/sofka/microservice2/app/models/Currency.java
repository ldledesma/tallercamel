package com.sofka.microservice2.app.models;

import java.math.BigDecimal;

public class Currency {

	private long id;
	private String from;
	private String to;
	private BigDecimal exchange;
	
	public Currency() {}

	public Currency(long id, String from, String to, BigDecimal exchange) {
		this.id = id;
		this.from = from;
		this.to = to;
		this.exchange = exchange;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getExchange() {
		return exchange;
	}

	public void setExchange(BigDecimal exchange) {
		this.exchange = exchange;
	}

	@Override
	public String toString() {
		return "Currency [id=" + id + ", from=" + from + ", to=" + to + ", exchange=" + exchange + "]";
	}

	
	
}
