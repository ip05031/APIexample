package com.itsdev.sicog.barrera.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.itsdev.sicog.barrera.models.RefId;

@Repository


public interface RefIdRepositorio extends JpaRepository<RefId, Long>{

}
