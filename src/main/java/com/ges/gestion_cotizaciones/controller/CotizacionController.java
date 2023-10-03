package com.ges.gestion_cotizaciones.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CotizacionController {
	
	@GetMapping("/hello")
	public String GetHello() {
		return "Hola Mundo";
	}

}
