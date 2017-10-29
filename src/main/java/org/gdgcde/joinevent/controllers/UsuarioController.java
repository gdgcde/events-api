/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gdgcde.joinevent.controllers;

import org.gdgcde.joinevent.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuarioController {
	
	private UsuarioRepository repository;
    
    @Autowired
    public UsuarioController(UsuarioRepository repository) {
        this.repository = repository;
    }
    
}
