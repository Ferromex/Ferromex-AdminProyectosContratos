package com.ferromex.proyectos.dominio;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TPRY_PROVEEDORES") 

public class Proveedor implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "PROV_ID")
	@GeneratedValue(strategy=GenerationType.AUTO, generator="prov_seq_gen")
	@SequenceGenerator(name="prov_seq_gen", sequenceName="PROVEEDOR_SEQ")
    private Integer idProveedor;

	@Column(name = "PROV_RAZON_SOCIAL")
	private String razonSocial;

	@Column(name = "PROV_DOM_FISCAL")
	private String domicilioFiscal;

	@Column(name = "PROV_DOM_CORRESP")
	private String domCorrespondencia;

	@Column(name = "PROV_REGISTRO_ABAST")
	private Integer registroAbast; 

	@Column(name = "PROV_REGISTRO_PROY")
	private Integer registroProyectos;

	@ManyToOne 
	@JoinColumn(name = "ZPRO_ID") 
	private Zona zonap; 

	@OneToMany(fetch = FetchType.EAGER, mappedBy="proveedor", cascade=CascadeType.ALL, orphanRemoval=true)
    private Set<Contacto> contactos;

	@ManyToMany(fetch=FetchType.EAGER) //name es la llave de la tabla a la que se hace referencia
	@JoinTable(name="TPRY_OBRAS_PROVEEDOR", joinColumns={@JoinColumn(name="PROV_ID", referencedColumnName="PROV_ID")},
			inverseJoinColumns = @JoinColumn(name = "TOBR_ID", referencedColumnName="TOBR_ID"))
	private Set<TipoObras> obras;

	public Integer getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(Integer idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	
	public String getDomicilioFiscal() {
		return domicilioFiscal;
	}
	public void setDomicilioFiscal(String domicilioFiscal) {
		this.domicilioFiscal = domicilioFiscal;
	}
	
	public String getDomCorrespondencia() {
		return domCorrespondencia;
	}
	public void setDomCorrespondencia(String domCorrespondencia) {
		this.domCorrespondencia = domCorrespondencia;
	}
	
	public Integer getRegistroAbast() {
		return registroAbast;
	}
	public void setRegistroAbast(Integer registroAbast) {
		this.registroAbast = registroAbast;
	}
	
	public Integer getRegistroProyectos() {
		return registroProyectos;
	}
	public void setRegistroProyectos(Integer registroProyectos) {
		this.registroProyectos = registroProyectos;
	}
	
	public Zona getZonap() {
		return zonap;
	}
	public void setZonap(Zona zonap) {
		this.zonap = zonap;
	}

	public Set<Contacto> getContactos() {
		return contactos;
	}
	public void setContactos(Set<Contacto> contactos) {
		this.contactos = contactos;
	}

	public Set<TipoObras> getObras() {
		return obras;
	}
	public void setObras(Set<TipoObras> obras) {
		this.obras = obras;
	}
	
}