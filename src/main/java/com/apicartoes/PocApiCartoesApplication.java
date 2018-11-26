package com.apicartoes;

import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PocApiCartoesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocApiCartoesApplication.class, args);
	}
	
	@Bean
	public ServletRegistrationBean camelServletRegistrationBean() {
		ServletRegistrationBean registration = new ServletRegistrationBean(new CamelHttpTransportServlet());
		registration.setName("CamelServlet");
		return registration;
	}
}
