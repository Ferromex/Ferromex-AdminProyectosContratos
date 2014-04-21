package com.ferromex.proyectos.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
	
	@Entity
	@Table(name="TPRY_CONTACTO_PROVEEDOR") 

	public class Contacto implements Serializable {

		private static final long serialVersionUID = 1L;
		
		@Id
	    @Column(name = "CTOP_ID")
		@GeneratedValue(strategy=GenerationType.AUTO, generator="contacto_seq_gen")
		@SequenceGenerator(name="contacto_seq_gen", sequenceName="CONTACTOPROV_SEQ")
		private Integer idContacto;

		@Column(name = "CTOP_NOMBRE")
		private String nombreContacto;
		
		@Column(name = "CTOP_APPATERNO")
		private String apPaterno;
		
		@Column(name = "CTOP_APMATERNO")
		private String apMaterno;
		
		@Column(name = "CTOP_EMAIL")
		private String email;
		
		@Column(name = "CTOP_TELOFICINA")
		private String telOficina;
		
		@Column(name = "CTOP_MOVIL1")
		private String movil1;
		
		@Column(name = "CTOP_MOVIL2")
		private String movil2;
		
		@Column(name = "CTOP_PRINCIPAL")
		private String principal;

		@Column(name = "CTOP_EMAIL2")
		private String email2;

		@Column(name = "CTOP_EMAIL3")
		private String email3;

		@Column(name = "CTOP_EMAIL4")
		private String email4;

		@ManyToOne
		@JoinColumn(name = "PROV_ID")
		private Proveedor proveedor;

		public Integer getIdContacto() {
			return idContacto;
		}
		public void setIdContacto(Integer idContacto) {
			this.idContacto = idContacto;
		}
		
		public String getNombreContacto() {
			return nombreContacto;
		}
		public void setNombreContacto(String nombreContacto) {
			this.nombreContacto = nombreContacto;
		}
		
		public String getApPaterno() {
			return apPaterno;
		}
		public void setApPaterno(String apPaterno) {
			this.apPaterno = apPaterno;
		}
		
		public String getApMaterno() {
			return apMaterno;
		}
		public void setApMaterno(String apMaterno) {
			this.apMaterno = apMaterno;
		}
		
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		public String getTelOficina() {
			return telOficina;
		}
		public void setTelOficina(String telOficina) {
			this.telOficina = telOficina;
		}
		
		public String getMovil1() {
			return movil1;
		}
		public void setMovil1(String movil1) {
			this.movil1 = movil1;
		}
		
		public String getMovil2() {
			return movil2;
		}
		public void setMovil2(String movil2) {
			this.movil2 = movil2;
		}
		
		public String getPrincipal() {
			return principal;
		}
		public void setPrincipal(String principal) {
			this.principal = principal;
		}
		public String getEmail2() {
			return email2;
		}
		public void setEmail2(String email2) {
			this.email2 = email2;
		}
		public String getEmail3() {
			return email3;
		}
		public void setEmail3(String email3) {
			this.email3 = email3;
		}
		public String getEmail4() {
			return email4;
		}
		public void setEmail4(String email4) {
			this.email4 = email4;
		}
		
		public Proveedor getProveedor() {
			return proveedor;
		}
		public void setProveedor(Proveedor proveedor) {
			this.proveedor = proveedor;
		}
		@Override
		public String toString() {
			return "Contacto [idContacto=" + idContacto + ", nombreContacto="
					+ nombreContacto + ", apPaterno=" + apPaterno
					+ ", apMaterno=" + apMaterno + ", email=" + email
					+ ", telOficina=" + telOficina + ", movil1=" + movil1
					+ ", movil2=" + movil2 + ", principal=" + principal
					+ ", email2=" + email2 + ", email3=" + email3 + ", email4="
					+ email4 + ", proveedor=" + proveedor + "]";
		}
		
		
	}