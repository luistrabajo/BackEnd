package com.ges.gestion_cotizaciones.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ges.gestion_cotizaciones.entity.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente,Long> {

}
