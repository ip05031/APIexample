package com.itsdev.sicog.barrera.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.itsdev.sicog.barrera.models.Usuario;

@Repository
public interface UsuarioRepositorio extends CrudRepository<Usuario, Long> {

}
