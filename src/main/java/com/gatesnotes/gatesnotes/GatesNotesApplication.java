package com.gatesnotes.gatesnotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)

public class GatesNotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatesNotesApplication.class, args);
	}

}
