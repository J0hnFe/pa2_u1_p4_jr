package com.uce.edu.ec;

import java.time.LocalDateTime;

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
		Profesor profesor= new Profesor();
		profesor.setNombre("John");
		profesor.setCedula("1700");
		profesor.setFechaNacimiento(LocalDateTime.now());
		profesor.setApellido("Ramos");
		
		System.out.println(profesor);
	}

}
