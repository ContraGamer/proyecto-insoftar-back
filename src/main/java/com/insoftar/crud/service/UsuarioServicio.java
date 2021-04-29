package com.insoftar.crud.service;

import com.insoftar.crud.repository.UsuarioRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio {

    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    public String correoExistente(String correo){
        

        return null;
    }
    
}
