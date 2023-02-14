package com.itsdev.sicog.barrera.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.itsdev.sicog.barrera.models.Barrera;

@Repository
public interface BarreraRepositorio extends CrudRepository<Barrera, Long> {

}