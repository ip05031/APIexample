package com.itsdev.sicog.barrera.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.itsdev.sicog.barrera.models.RefId;
import com.itsdev.sicog.barrera.repositories.RefIdRepositorio;

@Service
public class RefidService {
	@Autowired
	RefIdRepositorio refidRepo;
	
	public ArrayList<RefId> getAll(){
		return (ArrayList<RefId>)refidRepo.findAll();
	}

	public Optional<RefId> getById(Long id){
		return refidRepo.findById(id);
	}
}
