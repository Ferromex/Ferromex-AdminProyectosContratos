package com.ferromex.proyectos.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TPRY_DIVISION") 

public class Division implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "DIVS_ID")
    private String idDivision;

	@Column(name = "DIVS_NOMBRE")
	private String nombreDivision;

	public String getIdDivision() {
		return idDivision;
	}

	public void setIdDivision(String idDivision) {
		this.idDivision = idDivision;
	}

	public String getNombreDivision() {
		return nombreDivision;
	}

	public void setNombreDivision(String nombreDivision) {
		this.nombreDivision = nombreDivision;
	}

	@Override
	public String toString() {
		return "Division [idDivision=" + idDivision + ", nombreDivision="
				+ nombreDivision + "]";
	}
 
	
}