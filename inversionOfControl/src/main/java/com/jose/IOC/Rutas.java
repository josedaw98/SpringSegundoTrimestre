package com.jose.IOC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jose.IOC.beans.Autor.AutorBean;
import com.jose.IOC.servicio.ComponenteNombres;

@Controller
public class Rutas {
	
	
	
	
	@Autowired
	AutorBean juan;
	
	@Autowired
	AutorBean maria;
	
	@Autowired
	@Qualifier("juan")
	AutorBean marcos;
	
	@Autowired
	ComponenteNombres componenteNombres;
	
	
	@GetMapping("/")
	@ResponseBody
	public String rutaInicial() {
		
		String salida = " ";
		for(String str: componenteNombres.getNombres()) {
			salida += str + "<br>";
		}
		
			
		
		return salida;
	}

}
