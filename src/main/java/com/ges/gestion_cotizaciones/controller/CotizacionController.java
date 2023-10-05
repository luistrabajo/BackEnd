package com.ges.gestion_cotizaciones.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ges.gestion_cotizaciones.entity.Cotizacion;
import com.ges.gestion_cotizaciones.entity.Product;
import com.ges.gestion_cotizaciones.repository.CotizacionRepository;
import com.ges.gestion_cotizaciones.repository.ProductRepository;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/")
public class CotizacionController {
	
	@Autowired
	private CotizacionRepository cotizacionRepository;
	@Autowired
	private ProductRepository productRepository;
	
	
	@GetMapping("/hello")
	public String GetHello() {
		return "Hola Mundo";
	}

	
	
	@PostMapping("/creac")
	public Cotizacion creaCotizacion(@RequestBody Cotizacion cotizacion) {
		 cotizacionRepository.save(cotizacion);
		
		 return cotizacion;
		
	}
	
	
	@GetMapping("/getc")
	public Iterable<Cotizacion> getCotizacion() {
		return cotizacionRepository.findAll();
		
	}
	
	
	@GetMapping("/getId/{id}")
	public Optional<Cotizacion> getCotizacion(@PathVariable Long id) {
		return cotizacionRepository.findById(id);
		
	}
		
	
	@GetMapping("/getT/{telefono}")
	public List<Cotizacion> findByNumeroTelefono(@PathVariable String telefono) {
		return cotizacionRepository.buscarTelefono(telefono);
		
	}
	
	@DeleteMapping("/deleteId/{id}")
	public ResponseEntity<?> deleteCotizacion(@PathVariable Long id) {
		cotizacionRepository.deleteById(id);
		return ResponseEntity.ok("Se elimino la cotizacion "+id);
				
		
	}
	
	@GetMapping("/getPro")
	public Iterable<Product> getPro(){		
		return productRepository.findAll();
		
	}
	
}
