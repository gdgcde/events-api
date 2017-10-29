
package org.gdgcde.joinevent.controllers;

import org.gdgcde.joinevent.repositories.ExpositorTagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/eventos")
public class ExpositorTagCrontroller {
	
	private ExpositorTagRepository repository;
    
    @Autowired
    public ExpositorTagCrontroller(ExpositorTagRepository repository) {
        this.repository = repository;
    }
    
}
