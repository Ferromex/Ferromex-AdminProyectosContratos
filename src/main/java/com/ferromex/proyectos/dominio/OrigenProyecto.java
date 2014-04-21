package com.ferromex.proyectos.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TPRY_ORIGEN_PROYECTO") 

public class OrigenProyecto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "OPRY_ID")
    private String origenProyectoId;

	@Column(name = "OPRY_NOMBRE")
	private String origenProyectoNombre;
    
	public String getOrigenProyectoId() {
		return origenProyectoId;
	}

	public void setOrigenProyectoId(String origenProyectoId) {
		this.origenProyectoId = origenProyectoId;
	}

	public String getOrigenProyectoNombre() {
		return origenProyectoNombre;
	}

	public void setOrigenProyectoNombre(String origenProyectoNombre) {
		this.origenProyectoNombre = origenProyectoNombre;
	}

	@Override
	public String toString() {
		return "OrigenProyecto [origenProyectoId=" + origenProyectoId
				+ ", origenProyectoNombre=" + origenProyectoNombre + "]";
	}

	
}