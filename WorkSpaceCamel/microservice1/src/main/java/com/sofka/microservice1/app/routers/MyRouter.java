package com.sofka.microservice1.app.routers;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRouter extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		
		/* from("timer:firts-timer?period=10000")
		.log("${body}")
		.to("direct:remoteService");*/
		
//		 Para pasar archivo
		/*from("file:files/start_json")
		.log("start ${body}")
		.to("file:files/end_json");*/
		
		/* Para colas
		from("timer:active-mq-timer?period=10000")
		.transform().constant("My message for Active MQ")
		.to("activemq:my-activemq-queue");
		*/
		
		from("file:files/json")
		.log("start ${body}")
		.to("activemq:my-activemq-queue");

		
	}
	



}
