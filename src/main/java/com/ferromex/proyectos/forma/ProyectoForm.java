package com.ferromex.proyectos.forma;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import org.springframework.format.annotation.DateTimeFormat;


public class ProyectoForm {
	
	private static final Logger logger = LoggerFactory.getLogger(ConcursoForm.class);
	

	private Integer idProyecto;
	private String empresa;
	private String nombreProyecto;
	private String nombreCorto;
	private Integer tipoObra;
	private Integer origenProyecto;
	private Integer division;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat (pattern="dd/MM/yyyy")
	private Date fechaRecepcion;
	
	private Integer presupuesto;
	private String elementoPEP;
	private String centroCostos;
	private String solicitudInversion;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat (pattern="dd/MM/yyyy")
	private Date fechaEstInvitacion;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat (pattern="dd/MM/yyyy")
	private Date fechaEstVisitaObra;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat (pattern="dd/MM/yyyy")
	private Date fechaEstPreguntas;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat (pattern="dd/MM/yyyy")
	private Date fechaEstRespuestas;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat (pattern="dd/MM/yyyy")
	private Date fechaEstPropuestas;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat (pattern="dd/MM/yyyy")
	private Date fechaEstRevisionTecnica;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat (pattern="dd/MM/yyyy")
	private Date fechaEstChecklistTec;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat (pattern="dd/MM/yyyy")
	private Date fechaEstCartaIntencion;
	
	public Date getFechaEstInvitacion() {
		return fechaEstInvitacion;
	}

	public void setFechaEstInvitacion(Date fechaEstInvitacion) {
		logger.info(" - - -  fechaEstInvitacion   : " + fechaEstInvitacion + "  - - - ");
		this.fechaEstInvitacion = fechaEstInvitacion;
	}

	public Date getFechaEstVisitaObra() {
		return fechaEstVisitaObra;
	}

	public void setFechaEstVisitaObra(Date fechaEstVisitaObra) {
		logger.info(" - - -  fechaEstVisitaObra   : " + fechaEstVisitaObra + "  - - - ");
		this.fechaEstVisitaObra = fechaEstVisitaObra;
	}

	public Date getFechaEstPreguntas() {
		return fechaEstPreguntas;
	}

	public void setFechaEstPreguntas(Date fechaEstPreguntas) {
		logger.info(" - - -  fechaEstPreguntas   : " + fechaEstPreguntas + "  - - - ");
		this.fechaEstPreguntas = fechaEstPreguntas;
	}

	public Date getFechaEstRespuestas() {
		return fechaEstRespuestas;
	}

	public void setFechaEstRespuestas(Date fechaEstRespuestas) {
		logger.info(" - - -  fechaEstRespuestas   : " + fechaEstRespuestas + "  - - - ");
		this.fechaEstRespuestas = fechaEstRespuestas;
	}

	public Date getFechaEstPropuestas() {
		return fechaEstPropuestas;
	}

	public void setFechaEstPropuestas(Date fechaEstPropuestas) {
		logger.info(" - - -  fechaEstPropuestas   : " + fechaEstPropuestas + "  - - - ");
		this.fechaEstPropuestas = fechaEstPropuestas;
	}

	public Date getFechaEstRevisionTecnica() {
		return fechaEstRevisionTecnica;
	}

	public void setFechaEstRevisionTecnica(Date fechaEstRevisionTecnica) {
		logger.info(" - - -  fechaEstRevisionTecnica   : " + fechaEstRevisionTecnica + "  - - - ");
		this.fechaEstRevisionTecnica = fechaEstRevisionTecnica;
	}

	public Date getFechaEstChecklistTec() {
		return fechaEstChecklistTec;
	}

	public void setFechaEstChecklistTec(Date fechaEstChecklistTec) {
		logger.info(" - - -  fechaEstChecklistTec   : " + fechaEstChecklistTec + "  - - - ");
		this.fechaEstChecklistTec = fechaEstChecklistTec;
	}

	public Date getFechaEstCartaIntencion() {
		return fechaEstCartaIntencion;
	}

	public void setFechaEstCartaIntencion(Date fechaEstCartaIntencion) {
		logger.info(" - - -  fechaEstCartaIntencion   : " + fechaEstCartaIntencion + "  - - - ");
		this.fechaEstCartaIntencion = fechaEstCartaIntencion;
	}


	@Temporal(TemporalType.DATE)
	@DateTimeFormat (pattern="dd/MM/yyyy")
	private Date fechaEntregaSAI;

	private Integer solicitudSAP;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat (pattern="dd/MM/yyyy")
	private Date inicioEstimado;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat (pattern="dd/MM/yyyy")
	private Date finEstimado;

	private Integer duracionProy;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat (pattern="dd/MM/yyyy")
	private Date inicioReal;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat (pattern="dd/MM/yyyy")
	private Date finReal;

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getNombreProyecto() {
		return nombreProyecto;
	}

	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}

	public String getNombreCorto() {
		return nombreCorto;
	}

	public void setNombreCorto(String nombreCorto) {
		this.nombreCorto = nombreCorto;
	}

	public Integer getTipoObra() {
		return tipoObra;
	}

	public void setTipoObra(Integer tipoObra) {
		this.tipoObra = tipoObra;
	}

	public Integer getOrigenProyecto() {
		return origenProyecto;
	}

	public void setOrigenProyecto(Integer origenProyecto) {
		this.origenProyecto = origenProyecto;
	}

	public Integer getDivision() {
		return division;
	}

	public void setDivision(Integer division) {
		this.division = division;
	}

	public Date getFechaRecepcion() {
		return fechaRecepcion;
	}

	public void setFechaRecepcion(Date fechaRecepcion) {
		this.fechaRecepcion = fechaRecepcion;
	}

	public Integer getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Integer presupuesto) {
		this.presupuesto = presupuesto;
	}

	public String getElementoPEP() {
		return elementoPEP;
	}

	public void setElementoPEP(String elementoPEP) {
		this.elementoPEP = elementoPEP;
	}

	public String getCentroCostos() {
		return centroCostos;
	}

	public void setCentroCostos(String centroCostos) {
		this.centroCostos = centroCostos;
	}

	public String getSolicitudInversion() {
		return solicitudInversion;
	}

	public void setSolicitudInversion(String solicitudInversion) {
		this.solicitudInversion = solicitudInversion;
	}

	public Date getFechaEntregaSAI() {
		return fechaEntregaSAI;
	}

	public void setFechaEntregaSAI(Date fechaEntregaSAI) {
		this.fechaEntregaSAI = fechaEntregaSAI;
	}

	public Integer getSolicitudSAP() {
		return solicitudSAP;
	}

	public void setSolicitudSAP(Integer solicitudSAP) {
		this.solicitudSAP = solicitudSAP;
	}

	public Date getInicioEstimado() {
		return inicioEstimado;
	}

	public void setInicioEstimado(Date inicioEstimado) {
		logger.info(" - - -  INICIO ESTIMADA   : " + inicioEstimado + "  - - - ");
		this.inicioEstimado = inicioEstimado;
	}

	public Date getFinEstimado() {
		return finEstimado;
	}

	public void setFinEstimado(Date finEstimado) {
		this.finEstimado = finEstimado;
	}

	public Integer getDuracionProy() {
		return duracionProy;
	}

	public void setDuracionProy(Integer duracionProy) {
		this.duracionProy = duracionProy;
	}

	public Date getInicioReal() {
		return inicioReal;
	}

	public void setInicioReal(Date inicioReal) {
		this.inicioReal = inicioReal;
	}

	public Date getFinReal() {
		return finReal;
	}

	public void setFinReal(Date finReal) {
		this.finReal = finReal;
	}

	public Integer getIdProyecto() {
		return idProyecto;
	}

	public void setIdProyecto(Integer idProyecto) {
		this.idProyecto = idProyecto;
	}

}
