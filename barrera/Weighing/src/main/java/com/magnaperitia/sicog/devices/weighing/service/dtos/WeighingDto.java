package com.magnaperitia.sicog.devices.weighing.service.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.magnaperitia.sicog.devices.weighing.domain.model.Vehicle;

@JsonInclude(value=Include.NON_EMPTY, content=Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeighingDto {
	
	private VehicleDto veh;

	public VehicleDto getVeh() {
		return veh;
	}

	public void setVeh(VehicleDto veh) {
		this.veh = veh;
	}
	
}
