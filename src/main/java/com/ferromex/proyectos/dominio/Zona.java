package com.ferromex.proyectos.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TPRY_ZONA_PROVEEDOR") 

public class Zona implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name = "ZPRO_ID")
    private Integer idZona;

	@Column(name = "ZPRO_ZONA")
	private String zona;

	public Integer getIdZona() {
		return idZona;
	}

	public void setIdZona(Integer idZona) {
		this.idZona = idZona;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	@Override
	public String toString() {
		return "Zona [idZona=" + idZona + ", zona=" + zona + "]";
	}
	
}
