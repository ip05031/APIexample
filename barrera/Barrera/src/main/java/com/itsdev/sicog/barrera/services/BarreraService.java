package com.itsdev.sicog.barrera.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.itsdev.sicog.barrera.models.Barrera;
import com.itsdev.sicog.barrera.repositories.BarreraRepositorio;

@Service
public class BarreraService {
	@Autowired
	BarreraRepositorio barreraRepo;
	
	public ArrayList<Barrera> getAll(){
		return (ArrayList<Barrera>)barreraRepo.findAll();
	}
	
	public Barrera guardar(Barrera barrera) {
		return barreraRepo.save(barrera);
	}
	
}