package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.entidad.Autor;
import com.app.web.repositorio.AutorRepositorio;

@SpringBootApplication
public class BibliotecaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaApplication.class, args);
	}
	
	@Autowired
	private AutorRepositorio repositorio;
	
	@Override
	public void run(String... args) throws Exception {
		/*Autor autor1 = new Autor("mario", "vargasllosa", "mvargasllosa@gmail.com");
		repositorio.save(autor1);
		
		Autor autor2 = new Autor("ernest", "hemingway", "hhemingway@gmail.com");
		repositorio.save(autor2);*/
	}

}
