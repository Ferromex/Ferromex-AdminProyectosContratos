package com.ferromex.proyectos.dominio;

	import java.io.Serializable;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;
	
	@Entity
	@Table(name="TPRY_RESPONSABLES") 

	public class Responsable implements Serializable {

		private static final long serialVersionUID = 1L;

	    @Id
	    @Column(name = "RESP_ID")
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer idResponsable;

		@Column(name = "RESP_NOMBRE")
	    private String nombreResponsable;

		@Column(name = "RESP_AP_PATERNO")
		private String ApPaternoResp;
	    
		@Column(name = "RESP_AP_MATERNO")
		private String ApMaternoResp;

	    public Integer getIdResponsable() {
			return idResponsable;
		}

		public void setIdResponsable(Integer idResponsable) {
			this.idResponsable = idResponsable;
		}

		public String getNombreResponsable() {
			return nombreResponsable;
		}

		public void setNombreResponsable(String nombreResponsable) {
			this.nombreResponsable = nombreResponsable;
		}

		public String getApPaternoResp() {
			return ApPaternoResp;
		}

		public void setApPaternoResp(String apPaternoResp) {
			ApPaternoResp = apPaternoResp;
		}

		public String getApMaternoResp() {
			return ApMaternoResp;
		}

		public void setApMaternoResp(String apMaternoResp) {
			ApMaternoResp = apMaternoResp;
		}

		@Override
		public String toString() {
			return "Responsable [idResponsable=" + idResponsable
					+ ", nombreResponsable=" + nombreResponsable
					+ ", ApPaternoResp=" + ApPaternoResp + ", ApMaternoResp="
					+ ApMaternoResp + "]";
		}
	}
