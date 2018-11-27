package com.apicartoes.config;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

@Component
public class RestConfigRoute extends RouteBuilder{
	
	@Override
	public void configure() throws Exception{
		restConfiguration()
			.bindingMode(RestBindingMode.off)
			.component("servlet");
			
	}
	

}
