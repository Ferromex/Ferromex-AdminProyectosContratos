package com.ferromex.proyectos.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TPRY_EMPRESA") 

public class Empresa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "EMPR_ID")
    private String idEmpresa;

	@Column(name = "EMPR_NOMBRE")
	private String nombreEmpresa;
    
	public String getIdEmpresa() {
		return idEmpresa;
	}
	public void setIdEmpresa(String idEmpresa) {
		this.idEmpresa = idEmpresa;
	}
	
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	@Override
	public String toString() {
		return "Empresa [idEmpresa=" + idEmpresa + ", nombreEmpresa="
				+ nombreEmpresa + "]";
	}
}