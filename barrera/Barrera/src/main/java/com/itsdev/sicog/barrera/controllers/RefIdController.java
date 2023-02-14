package com.itsdev.sicog.barrera.controllers;

import java.util.ArrayList;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.itsdev.sicog.barrera.models.RefId;
import com.itsdev.sicog.barrera.services.RefidService;

@RestController
@RequestMapping("/getRefid")
public class RefIdController {
	
	@Autowired
	RefidService servicio;
	
	@GetMapping()
	public ArrayList<RefId> obtenerRefId(){
		return servicio.getAll();
	}
	
	@GetMapping("/{id}/")
	public Optional<RefId> getRefIdById2(@PathParam("id") Long id) {
		return servicio.getById(id);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Optional<RefId> getFoosBySimplePath(@PathVariable("id") long id) {
	    return servicio.getById(id);
	}
}
