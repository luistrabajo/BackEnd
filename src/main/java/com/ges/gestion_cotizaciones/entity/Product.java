package com.ges.gestion_cotizaciones.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "products")
public class Product {
	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 	private Long product_id; 
	 	private String  product_code; 
	 	private String product_name; 
	 	private Integer product_price; 
	 	private String product_image; 
	 	private Integer product_active; 
	 	private Integer product_delete; 
	 	private Integer product_created_by; 
	 	private Date product_created_at; 
	 	private Integer product_modified_by; 
	 	private Date product_modified_at;
	 	
}
