package com.ferromex.proyectos.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

	@Entity
	@Table(name="TPRY_TIPO_DOCUMENTO") 

	public class TipoDocumento implements Serializable {

		private static final long serialVersionUID = 1L;
		
		@Id
	    @Column(name = "TDOC_ID")
		@GeneratedValue(strategy=GenerationType.AUTO, generator="tipodoc_seq_gen")
		@SequenceGenerator(name="tipodoc_seq_gen", sequenceName="TIPODOC_SEQ")
		private Integer idTipoDocumento;

		@Column(name = "TDOC_NOMBRE")
		private String nombreTipoDocumento;

		public Integer getIdTipoDocumento() {
			return idTipoDocumento;
		}

		public void setIdTipoDocumento(Integer idTipoDocumento) {
			this.idTipoDocumento = idTipoDocumento;
		}

		public String getNombreTipoDocumento() {
			return nombreTipoDocumento;
		}

		public void setNombreTipoDocumento(String nombreTipoDocumento) {
			this.nombreTipoDocumento = nombreTipoDocumento;
		}

		@Override
		public String toString() {
			return "TipoDocumento [idTipoDocumento=" + idTipoDocumento
					+ ", nombreTipoDocumento=" + nombreTipoDocumento + "]";
		}
		
		
	}

