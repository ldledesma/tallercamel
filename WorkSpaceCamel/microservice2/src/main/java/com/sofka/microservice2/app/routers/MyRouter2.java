package com.sofka.microservice2.app.routers;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.sofka.microservice2.app.routers.Currency;


@Component
public class MyRouter2 extends RouteBuilder{


	@Autowired
	CurrencyExchangeTransformations currencyExchangeTransformations;
	
	@Override
	public void configure() throws Exception {
		
		// TODO Auto-generated method stub
				from("activemq:my-activemq-queue")
		 .log("datos que recibe: ${body}")
		.unmarshal().json(JsonLibrary.Jackson, Currency.class)
		 .bean(currencyExchangeTransformations)
		 .log("datos que recibe serializado: ${body}")
		   .to("log:received-message-from-active-mq");

		
	}

}
