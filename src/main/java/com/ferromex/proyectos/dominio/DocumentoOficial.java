package com.ferromex.proyectos.dominio;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
	
	@Entity
	@Table(name="TPRY_DOCS_OFICIALES") 

	public class DocumentoOficial implements Serializable {

	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		@Id
	    @Column(name = "DOCS_ID")
		@GeneratedValue(strategy=GenerationType.AUTO, generator="docsofic_seq_gen")
		@SequenceGenerator(name="docsofic_seq_gen", sequenceName="DOCSOF_SEQ")
		private Integer idDocumento;

		@Column(name = "DOCS_FOLIO")
		private String folio;
		
		@Column(name = "EMPR_ID")
		private String empresa;
		
		@Column(name = "DOCS_FECHA_ELABORACION")
		@Temporal(TemporalType.DATE)
		@DateTimeFormat (pattern="dd/mm/yy")
		private Date fechaElaboracion;
	    
		@Column(name = "TDOC_ID")
		private Integer tipoDocumento;
	    
		@Column(name = "PROV_ID")
		private Integer idProveedor;
		
		@Column(name = "DOCS_DIRIGIDOA")
		private String dirigidoA;
	    
		@Column(name = "PROY_ID")
		private Integer proyecto;
	    
		@Column(name = "RESP_ID")
		private Integer elaboro;
	    
		@Column(name = "DOCS_OBSERVACIONES")
		private String observaciones;

		@Column(name = "DOCS_TIPO_OBRA")
		private String tipoObra;

		public Integer getIdDocumento() {
			return idDocumento;
		}
		public void setIdDocumento(Integer idDocumento) {
			this.idDocumento = idDocumento;
		}
		
		public String getFolio() {
			return folio;
		}
		public void setFolio(String folio) {
			this.folio = folio;
		}
		
		public String getEmpresa() {
			return empresa;
		}
		public void setEmpresa(String empresa) {
			this.empresa = empresa;
		}
		
		public Date getFechaElaboracion() {
			return fechaElaboracion;
		}
		public void setFechaElaboracion(Date fechaElaboracion) {
			this.fechaElaboracion = fechaElaboracion;
		}
		
		public Integer getTipoDocumento() {
			return tipoDocumento;
		}
		public void setTipoDocumento(Integer tipoDocumento) {
			this.tipoDocumento = tipoDocumento;
		}
		
		public Integer getIdProveedor() {
			return idProveedor;
		}
		public void setIdProveedor(Integer idProveedor) {
			this.idProveedor = idProveedor;
		}
		
		public String getDirigidoA() {
			return dirigidoA;
		}
		public void setDirigidoA(String dirigidoA) {
			this.dirigidoA = dirigidoA;
		}
		
		public Integer getProyecto() {
			return proyecto;
		}
		public void setProyecto(Integer proyecto) {
			this.proyecto = proyecto;
		}
		
		public Integer getElaboro() {
			return elaboro;
		}
		public void setElaboro(Integer elaboro) {
			this.elaboro = elaboro;
		}
		
		public String getObservaciones() {
			return observaciones;
		}
		public void setObservaciones(String observaciones) {
			this.observaciones = observaciones;
		}
		public String getTipoObra() {
			return tipoObra;
		}
		public void setTipoObra(String tipoObra) {
			this.tipoObra = tipoObra;
		}
		@Override
		public String toString() {
			return "DocumentoOficial [idDocumento=" + idDocumento + ", folio="
					+ folio + ", empresa=" + empresa + ", fechaElaboracion="
					+ fechaElaboracion + ", tipoDocumento=" + tipoDocumento
					+ ", idProveedor=" + idProveedor + ", dirigidoA="
					+ dirigidoA + ", proyecto=" + proyecto + ", elaboro="
					+ elaboro + ", observaciones=" + observaciones
					+ ", tipoObra=" + tipoObra + "]";
		}

	}
