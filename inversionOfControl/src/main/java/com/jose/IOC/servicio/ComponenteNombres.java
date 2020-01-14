package com.jose.IOC.servicio;

import org.springframework.stereotype.Service;

@Service
public class ComponenteNombres {

	public String[] getNombres(){
		
		String[] nombres = {"Paco","Juan" , "Maria"};
		
		
		return nombres;
		
	}
	
} 
