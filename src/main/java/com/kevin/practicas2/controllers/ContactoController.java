package com.kevin.practicas2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kevin.practicas2.models.Contacto;
import com.kevin.practicas2.repositories.RepositoryContacto;

@RestController
@RequestMapping("/api/contacto")
public class ContactoController {

    @Autowired
    private RepositoryContacto repositoryContacto;

    @GetMapping
    public List<Contacto> obtenerContactos() {
        return repositoryContacto.findAll();
    }

    @PostMapping
    public Contacto crearContacto(@RequestBody Contacto contacto) {
        return repositoryContacto.save(contacto);
    }
    
}
