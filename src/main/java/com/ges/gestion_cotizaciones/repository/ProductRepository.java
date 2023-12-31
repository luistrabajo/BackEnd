package com.ges.gestion_cotizaciones.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ges.gestion_cotizaciones.entity.Product;


@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

}
