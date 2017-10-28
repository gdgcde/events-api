package org.gdgcde.joinevent.model;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "workshops")
@NamedQueries({
    @NamedQuery(name = "Workshop.findAll", query = "SELECT u FROM Workshop u")})
public class Workshop {
	
	private Integer id;
	private String tema;
	private String descripcion;
	private Expositor expositorId;
	private String imagenUrl;
	
	
	
	public Workshop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Expositor getExpositorId() {
		return expositorId;
	}
	public void setExpositorId(Expositor expositorId) {
		this.expositorId = expositorId;
	}
	public String getImagenUrl() {
		return imagenUrl;
	}
	public void setImagenUrl(String imagenUrl) {
		this.imagenUrl = imagenUrl;
	}

}
