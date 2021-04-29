package com.insoftar.crud.controller;

import com.insoftar.crud.model.Mensaje;
import com.insoftar.crud.model.Usuario;
import com.insoftar.crud.repository.UsuarioRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@RequestMapping(path = "/insoftar")
public class UsuarioControlador {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @GetMapping(path = "/listAll")
    public @ResponseBody Iterable<Usuario> obtenerTodosUsuarios() {
        return usuarioRepositorio.findAll();
    }

    @PostMapping(path = "/getUser")
    public @ResponseBody Usuario obtenerUsuario(@RequestBody int id) {
        System.out.println(id);
        return usuarioRepositorio.findById(id).get();
    }

    @PostMapping(path = "/addUpdate")
    public @ResponseBody Mensaje agregarActualizarUsuario(@RequestBody Usuario usuario) {
            usuarioRepositorio.save(usuario);
            System.out.println("Usuario Actualizado");
            return new Mensaje("Información actualizada",20);
    }

    @PostMapping(path = "/delete")
    public @ResponseBody String eliminarUsuario(@RequestBody Usuario usuario) {
        usuarioRepositorio.delete(usuario);
        return "Usuario Eliminado";
    }
}
