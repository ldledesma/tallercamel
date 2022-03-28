package com.sofka.microservice2.app.routers;

import com.sofka.microservice2.app.models.Currency;

public interface CurrencyExchangeTransformations {

	Currency processMessage(Currency currency);
	
}
