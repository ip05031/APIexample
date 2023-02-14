package com.magnaperitia.sicog.devices.weighing.api.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.magnaperitia.sicog.devices.weighing.domain.model.Vehicle;
import com.magnaperitia.sicog.devices.weighing.service.dtos.WeighingDto;
import com.magnaperitia.sicog.devices.weighing.service.services.VehicleService;

@RestController
@RequestMapping("/api/weighings")
public class VehicleController {
	
	private VehicleService vehicleService;
	
	public VehicleController(VehicleService vehicleService) {
		this.vehicleService = vehicleService;
	}
	
	@GetMapping
	private ResponseEntity<?> getAll(Pageable pageable) {
		Page<Vehicle> vehicles = vehicleService.getAll(pageable);
		System.out.println("All Vehicle records retrieved (paged)");
		return ResponseEntity.ok(vehicles);
	}
	
	@GetMapping("/{id}")
	private ResponseEntity<?> getOne(@PathVariable String id) throws Exception {
		Vehicle vehicle = vehicleService.getOne(id);
		System.out.println("Vehicle retrieved by id="+id);
		return ResponseEntity.ok(vehicle);
	}
	
	@PostMapping
	private ResponseEntity<?> create(@RequestBody WeighingDto weighingDto) {
		Vehicle vehicle = vehicleService.create(weighingDto.getVeh());
		System.out.println("Vehicle record created = "+vehicle.toString());
		return new ResponseEntity<Vehicle>(vehicle, HttpStatus.CREATED);
	}

}
