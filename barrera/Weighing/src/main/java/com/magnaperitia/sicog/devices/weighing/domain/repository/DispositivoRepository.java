package com.magnaperitia.sicog.devices.weighing.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.magnaperitia.sicog.devices.weighing.domain.model.Dispositivo;
import com.magnaperitia.sicog.devices.weighing.domain.model.Vehicle;

public interface DispositivoRepository extends JpaRepository<Dispositivo, String> {

	@Query("SELECT e FROM Dispositivo e where e.codigo = :codigo")
	Optional<Dispositivo> findByCodigo(@Param("codigo")  String codigo);

}