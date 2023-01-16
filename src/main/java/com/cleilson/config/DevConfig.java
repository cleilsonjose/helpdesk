package com.cleilson.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.cleilson.services.DBservices;

@Configuration
@Profile("dev")
public class DevConfig {

	@Autowired
	private DBservices bservices;

	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String value;

	@Bean
	public boolean instanciaDB() {
		if (value.equals("create")) {
			this.bservices.instanciaDB();
		}
		return false;
	}
}
