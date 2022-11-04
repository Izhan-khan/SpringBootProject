package com.innovento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class InnoventoMvpApplication {

	public static void main(String[] args) {
		SpringApplication.run(InnoventoMvpApplication.class, args);
	}

}
