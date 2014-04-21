package com.ferromex.proyectos.forma;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.annotation.DateTimeFormat;


public class DocumentoOficialForm {
	private static final Logger logger = LoggerFactory.getLogger(DocumentoOficialForm.class);

	private String empresa;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat (pattern="dd/MM/yyyy")
	private Date fechaElaboracion;
	
	private Integer tipoDocumento;
    private String dirigidoA;
    private Integer proveedor;
    private Integer elaboro;
    private String observaciones;
    private Integer proyecto;
    private String tipoObra;

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
		logger.info(" - - -  F e c h a   : " + fechaElaboracion + "  - - - ");
		this.fechaElaboracion = fechaElaboracion;
	}

	public Integer getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(Integer tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public Integer getProveedor() {
		return proveedor;
	}

	public void setProveedor(Integer proveedor) {
		this.proveedor = proveedor;
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

}

