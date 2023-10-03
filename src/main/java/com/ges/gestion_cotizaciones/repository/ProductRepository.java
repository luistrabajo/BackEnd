package com.ges.gestion_cotizaciones.repository;

import org.springframework.data.repository.CrudRepository;

import com.ges.gestion_cotizaciones.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
