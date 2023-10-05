package com.ges.gestion_cotizaciones.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "items")
public class Item {
	
	
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 	private Long item_id; 
	private String codigo;
	private String nombre;
	private Double precio;
	private Integer cantidad;
	private Double valor_pro_uni;

}
