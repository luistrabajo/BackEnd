package com.ges.gestion_cotizaciones.entity;

import java.util.Date;
import java.util.Set;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
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
@Table(name = "cotizaciones")
public class Cotizacion {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 	private Long cotizacion_id; 
	private String  nombre_cliente;	
    private String  numero_telefono;
    private Date  fecha_creacion;
    private String  valor_total; 

    
    @OneToMany(fetch = FetchType.EAGER, targetEntity = Item.class, cascade = CascadeType.PERSIST)
    @JoinTable(name = "item_cotizaciones", joinColumns = @JoinColumn(name = "item_id"), inverseJoinColumns = @JoinColumn(name = "cotizacion_id"))
    private Set<Item>   descripcion;


	@Override
	public String toString() {
		return "Cotizacion [cotizacion_id=" + cotizacion_id + ", nombre_cliente=" + nombre_cliente
				+ ", numero_telefono=" + numero_telefono + ", fecha_creacion=" + fecha_creacion + ", valor_total="
				+ valor_total + ", descripcion=" + descripcion + "]";
	} 
	
    
    
	
}
