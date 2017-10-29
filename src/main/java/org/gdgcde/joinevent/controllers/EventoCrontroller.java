
package org.gdgcde.joinevent.controllers;

import org.gdgcde.joinevent.repositories.EventoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/eventos")
public class EventoCrontroller {
	
	private EventoRepository repository;
    
    @Autowired
    public EventoCrontroller(EventoRepository repository) {
        this.repository = repository;
    }
    
}
