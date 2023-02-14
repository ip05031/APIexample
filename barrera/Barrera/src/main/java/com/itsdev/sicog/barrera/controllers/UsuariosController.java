package com.itsdev.sicog.barrera.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itsdev.sicog.barrera.models.Usuario;
import com.itsdev.sicog.barrera.services.UsuariosService;

@RestController
@RequestMapping("/usuario")
public class UsuariosController {

	@Autowired
	UsuariosService servicio;
	
	@GetMapping()
	public ArrayList<Usuario> obtenerUsuarios(){
		return servicio.getAllUsuarios();
	}
	
	@PostMapping()
	public Usuario guardarUsuario(@RequestBody Usuario user) {
		return servicio.guardarUsuario(user);
	}
	
	
}
