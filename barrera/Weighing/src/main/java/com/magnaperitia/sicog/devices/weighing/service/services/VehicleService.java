package com.magnaperitia.sicog.devices.weighing.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.magnaperitia.sicog.devices.weighing.domain.model.Vehicle;
import com.magnaperitia.sicog.devices.weighing.domain.repository.VehicleRepository;
import com.magnaperitia.sicog.devices.weighing.service.dtos.VehicleDto;

@Service
@Transactional(readOnly=true)
public class VehicleService {

	VehicleRepository vehicleRepository;
	
	@Autowired
	public VehicleService(VehicleRepository vehicleRepository) {
		this.vehicleRepository = vehicleRepository;
	}
	
	@PreAuthorize("hasAuthority('ROL_USUARIO_BASCULA')")
	public Page<Vehicle> getAll(Pageable pageable) {
		return vehicleRepository.findAll(pageable);
	}
	
	@PreAuthorize("hasAuthority('ROL_USUARIO_BASCULA')")
	public Vehicle getOne(String id) throws Exception {
		return vehicleRepository.findByIdProp(id).orElseThrow(() -> new Exception("There is no vehicle record with Id="+id));
	}
	
	@PreAuthorize("hasAuthority('ROL_USUARIO_BASCULA')")
	@Transactional
	public Vehicle create(VehicleDto vehicleDto) {
		Vehicle vehicle = new Vehicle(vehicleDto);
		return vehicleRepository.save(vehicle);
	}
	
}
