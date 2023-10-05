package com.ges.gestion_cotizaciones.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ges.gestion_cotizaciones.entity.Cotizacion;
import com.ges.gestion_cotizaciones.entity.Item;
import com.ges.gestion_cotizaciones.entity.Product;


@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {

}
