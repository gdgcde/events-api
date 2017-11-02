package org.gdgcde.joinevent.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "expositor")
@NamedQueries({ @NamedQuery(name = "Expositor.findAll", query = "SELECT u FROM Expositor u") })
public class Expositor {

	@Id
	@Basic(optional = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Size(max = 150)
	@Column(name = "nombre")
	@NotNull
	private String nombre;

	@Size(max = 150)
	@Column(name = "apellido")
	@NotNull
	private String apellido;

	@Id
	@OneToMany
	@JoinColumn(name = "tagtec_id")
	private TagTecnologia tagTecId;

	public Expositor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public TagTecnologia getTagTecId() {
		return tagTecId;
	}

	public void setTagTecId(TagTecnologia tagTecId) {
		this.tagTecId = tagTecId;
	}

}
