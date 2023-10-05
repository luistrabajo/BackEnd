package com.ges.gestion_cotizaciones.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.ges.gestion_cotizaciones.entity.Cotizacion;

@Repository
public interface CotizacionRepository extends CrudRepository<Cotizacion, Long> {
	
	 @Query(value="select * from  cotizaciones u where u.numero_telefono = ?", nativeQuery=true)
	 List<Cotizacion> buscarTelefono(String numero_telefono);

}
