package com.ferromex.proyectos.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

	
	@Entity
	@Table(name="TPRY_OBRAS_PROVEEDOR") 

	public class ObrasProveedor implements Serializable {

		private static final long serialVersionUID = 1L;
		
		@Id
		@Column(name = "PROV_ID")
		private Integer idProveedor;
		
		@Id
		@Column(name = "TOBR_ID")
		private Integer tipoObra;

		public Integer getIdProveedor() {
			return idProveedor;
		}

		public void setIdProveedor(Integer idProveedor) {
			this.idProveedor = idProveedor;
		}

		public Integer getTipoObra() {
			return tipoObra;
		}

		public void setTipoObra(Integer tipoObra) {
			this.tipoObra = tipoObra;
		}
		
	}