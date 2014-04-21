package com.ferromex.proyectos.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TPRY_TIPO_OBRA") 

public class TipoObras implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "TOBR_ID")
    private Integer idObra;

	@Column(name = "TOBR_OBRA")
	private String obra;

	public Integer getIdObra() {
		return idObra;
	}

	public void setIdObra(Integer idObra) {
		this.idObra = idObra;
	}

	public String getObra() {
		return obra;
	}

	public void setObra(String obra) {
		this.obra = obra;
	}

	@Override
	public String toString() {
		return "TipoObras [idObra=" + idObra + ", obra=" + obra + "]";
	}
	
}

