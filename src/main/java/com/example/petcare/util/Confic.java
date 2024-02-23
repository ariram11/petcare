package com.example.petcare.util;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;


@Configuration
public class Confic implements WebMvcConfigurer{
	
	@Bean
	public OpenAPI swaggerDocOpenApi() {
		
		
		Server devServer=new Server();
		devServer.setUrl("localhost:8080");
		devServer.setDescription("Development server");
		
		Server testServer=new Server();
		testServer.setUrl("localhost:8080");
		testServer.setDescription("Testing Server");
		
	Contact contact =new Contact();
	contact.setEmail("ariram.ramachandran@gmail.com");
	contact.setName("ARIRAM R");
	contact.setUrl("../https://github.com");
	
	
	License ls=new License();
	ls.setName("License");
	ls.setUrl("License Provider");
	
	
	Info info=new Info();
	info.setContact(contact);
	info.setLicense(ls);
	info.setDescription("https://www.google.com/search?q=terms+and+conditions&rlz=1C1CHBD_enIN982IN982&oq=terms+&gs_lcrp=EgZjaHJvbWUqCggCEAAYsQMYgAQyBwgAEAAYjwIyBwgBEC4YgAQyCggCEAAYsQMYgAQyBwgDEAAYgAQyBwgEEAAYgAQyBwgFEC4YgAQyCggGEAAYsQMYgAQyBwgHEAAYgAQyDQgIEAAYgwEYsQMYgAQyBwgJEAAYjwLSAQgzNzQ2ajBqN6gCALACAA&sourceid=chrome&ie=UTF-8");
	
	
	info.setTermsOfService("https://www.google.com/search?q=terms+and+conditions&rlz=1C1CHBD_enIN982IN982&oq=terms+&gs_lcrp=EgZjaHJvbWUqCggCEAAYsQMYgAQyBwgAEAAYjwIyBwgBEC4YgAQyCggCEAAYsQMYgAQyBwgDEAAYgAQyBwgEEAAYgAQyBwgFEC4YgAQyCggGEAAYsQMYgAQyBwgHEAAYgAQyDQgIEAAYgwEYsQMYgAQyBwgJEAAYjwLSAQgzNzQ2ajBqN6gCALACAA&sourceid=chrome&ie=UTF-8");
	info.setTitle("Pet care center");
	info.setVersion("1.0");
	
	
	OpenAPI op=new OpenAPI();
		op.info(info);
		op.servers(Arrays.asList(devServer,testServer));
		
		return op;
	}
	
	
}
