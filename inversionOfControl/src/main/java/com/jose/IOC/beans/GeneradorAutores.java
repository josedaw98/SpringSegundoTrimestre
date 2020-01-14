package com.jose.IOC.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.jose.IOC.beans.Autor.AutorBean;


@Configuration
public class GeneradorAutores {

	
	@Bean
	@Scope("prototype")
	public AutorBean juan() {
		AutorBean autor =  new AutorBean();
		autor.setNombre("juan");
		autor.setEdad(22);
		
		return autor;
	}
	
	@Bean
	public AutorBean maria() {
		AutorBean autor =  new AutorBean();
		autor.setNombre("maria");
		autor.setEdad(26);
		
		return autor;
	}
	
}
