package com.ticketnest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing 
public class TicketnestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketnestApplication.class, args);
	}

}
