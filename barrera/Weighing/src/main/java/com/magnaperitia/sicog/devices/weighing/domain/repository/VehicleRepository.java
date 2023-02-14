package com.magnaperitia.sicog.devices.weighing.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.magnaperitia.sicog.devices.weighing.domain.model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, String> {

	@Query("SELECT e FROM Vehicle e where e.id = :id")
	Optional<Vehicle> findByIdProp(@Param("id")  String id);

}