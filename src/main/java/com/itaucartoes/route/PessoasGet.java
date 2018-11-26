package com.itaucartoes.route;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;

import com.apicartoes.entity.ListaPessoas;

public class PessoasGet extends RouteBuilder{
	@Override
	public void configure() {
		
		restConfiguration()
			.component("servlet")
	        .bindingMode(RestBindingMode.json);
		
		
		
		
		rest().get("/pessoas")
			.description("Consultar Pessoas")
			.outType(ListaPessoas.class)
			.id("get_pessoas")
			.produces("application/json")
			.route().routeId("get_pessoas")
			.to("bean:pessoaService?method=consultarPessoa")
		.endRest();
	}

}
