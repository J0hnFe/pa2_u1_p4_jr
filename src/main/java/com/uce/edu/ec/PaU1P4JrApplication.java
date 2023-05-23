package com.uce.edu.ec;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaU1P4JrApplication implements CommandLineRunner{ 

	public static void main(String[] args) {
		SpringApplication.run(PaU1P4JrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Mi primer proyecto");
		/*
		 * Spring framework es un permite la construccion/desarrollo
		 * de aplicaciones basadas en Spring
		 */
	}

}
