package com.jose.IOC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Rutas {
	
	@GetMapping("/")
	@ResponseBody
	public String rutaInicial() {
		
		return "todo Ok";
	}

}
