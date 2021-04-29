package com.insoftar.crud.repository;

import com.insoftar.crud.model.Usuario;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio  extends CrudRepository<Usuario,Integer>{
    
}
