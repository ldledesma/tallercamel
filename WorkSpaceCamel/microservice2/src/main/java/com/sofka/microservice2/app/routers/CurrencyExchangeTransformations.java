package com.sofka.microservice2.app.routers;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class CurrencyExchangeTransformations {
	public Currency processMessage(Currency currency) {
		currency.setExchange(currency.getExchange().multiply(BigDecimal.TEN));
		return currency;
	}

}
