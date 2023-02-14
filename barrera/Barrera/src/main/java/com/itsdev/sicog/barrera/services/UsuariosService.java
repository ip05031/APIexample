package com.itsdev.sicog.barrera.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itsdev.sicog.barrera.models.Usuario;
import com.itsdev.sicog.barrera.repositories.UsuarioRepositorio;



@Service
public class UsuariosService {
	@Autowired
	UsuarioRepositorio userRepo;
	
	public ArrayList<Usuario> getAllUsuarios(){
		return (ArrayList<Usuario>)userRepo.findAll();
	}
	
	public Usuario guardarUsuario(Usuario user) {
		return userRepo.save(user);
	}
	
}
