package com.sofka.microservice2.app.adapters;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sofka.microservice2.app.models.Currency;
import com.sofka.microservice2.app.routers.CurrencyExchangeTransformations;

@Component
@Qualifier("ALE")
public class CurrencyExchangeTransformationsALE implements CurrencyExchangeTransformations{
	public Currency processMessage(Currency currency) {
		currency.setExchange(currency.getExchange().multiply(BigDecimal.TEN));
		return currency;
	}

}
