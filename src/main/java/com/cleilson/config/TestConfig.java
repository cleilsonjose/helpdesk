package com.cleilson.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.cleilson.services.DBservices;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private DBservices bservices;
	
	@Bean
	public void instanciaDB() {
		this.bservices.iniciaDB();
	}
}
