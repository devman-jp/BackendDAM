package com.idat.BackendDAM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.idat.BackendDAM.model.Entrega;

@Repository
public interface EntregaRepository extends JpaRepository<Entrega, Integer>{

	@Modifying
	@Query(value = "update AZ_PAQUETE p set p.estado = 'ENTREGADO' where p.id_paquete = (Select e.paquete from AZ_ENTREGA e where e.id_entrega = :id)", nativeQuery = true)
	int updateEstadoPaqueteByIdEntrega(Integer id);
	
}
