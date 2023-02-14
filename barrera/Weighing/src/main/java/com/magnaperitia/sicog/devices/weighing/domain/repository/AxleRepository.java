package com.magnaperitia.sicog.devices.weighing.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.magnaperitia.sicog.devices.weighing.domain.model.Axle;

public interface AxleRepository extends JpaRepository<Axle, String> {

}