package com.ferromex.proyectos.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TPRY_TIPO_CONCURSO") 

public class TipoConcurso implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "TCON_ID")
    private Integer idConcurso;

	@Column(name = "TCON_NOMBRE")
	private String concurso;

	public Integer getIdConcurso() {
		return idConcurso;
	}

	public void setIdConcurso(Integer idConcurso) {
		this.idConcurso = idConcurso;
	}

	public String getConcurso() {
		return concurso;
	}

	public void setConcurso(String concurso) {
		this.concurso = concurso;
	}

	@Override
	public String toString() {
		return "TipoConcurso [idConcurso=" + idConcurso + ", concurso="
				+ concurso + "]";
	}

}

