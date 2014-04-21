package com.ferromex.proyectos.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TPRY_ESTATUS_PROYECTO") 

public class EstatusProyecto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "EPRY_ID")
    private Integer idEstatus;

	@Column(name = "EPRY_ESTATUS")
	private String estatus;

	public Integer getIdEstatus() {
		return idEstatus;
	}

	public void setIdEstatus(Integer idEstatus) {
		this.idEstatus = idEstatus;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	@Override
	public String toString() {
		return "EstatusProyecto [idEstatus=" + idEstatus + ", estatus="
				+ estatus + "]";
	}

}

