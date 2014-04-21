package com.ferromex.proyectos.forma;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.format.annotation.DateTimeFormat;


public class ConcursoForm {

	private static final Logger logger = LoggerFactory.getLogger(ConcursoForm.class);
	
	private Integer tipoConcurso;
	
	private Integer idProyecto;
	
	private Integer idConcurso;

	@Temporal(TemporalType.DATE)
	@DateTimeFormat (pattern="dd/MM/yyyy")
	private Date fechaRealInvitacion;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat (pattern="dd/MM/yyyy")
	private Date fechaRealVisitaObra;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat (pattern="dd/MM/yyyy")
	private Date fechaRealPreguntas;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat (pattern="dd/MM/yyyy")
	private Date fechaRealRespuestas;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat (pattern="dd/MM/yyyy")
	private Date fechaRealPropuestas;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat (pattern="dd/MM/yyyy")
	private Date fechaRealRevisionTecnica;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat (pattern="dd/MM/yyyy")
	private Date fechaRealChecklistTec;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat (pattern="dd/MM/yyyy")
	private Date fechaRealCartaIntencion;
	
	private String preciosCompetitivos;
	private String enPresupuesto;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat (pattern="dd/MM/yyyy")
	private Date fechaRevisionPrecios;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat (pattern="dd/MM/yyyy")
	private Date fechaRevisionCatalogo;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat (pattern="dd/MM/yyyy")
	private Date fechaNotifGanador;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat (pattern="dd/MM/yyyy")
	private Date fechaVoBoGanador;

	public Integer getTipoConcurso() {
		return tipoConcurso;
	}

	public void setTipoConcurso(Integer tipoConcurso) {
		logger.info(" - - -  tipoConcurso   : " + tipoConcurso + "  - - - ");
		this.tipoConcurso = tipoConcurso;
	}

	public Integer getIdProyecto() {
		return idProyecto;
	}

	public void setIdProyecto(Integer idProyecto) {
		logger.info(" - - -  idProyecto   : " + idProyecto + "  - - - ");
		this.idProyecto = idProyecto;
	}

	public Date getFechaRealInvitacion() {
		return fechaRealInvitacion;
	}

	public void setFechaRealInvitacion(Date fechaRealInvitacion) {
		logger.info(" - - -  fechaRealInvitacion   : " + fechaRealInvitacion + "  - - - ");
		this.fechaRealInvitacion = fechaRealInvitacion;
	}

	public Date getFechaRealVisitaObra() {
		return fechaRealVisitaObra;
	}

	public void setFechaRealVisitaObra(Date fechaRealVisitaObra) {
		logger.info(" - - -  fechaRealVisitaObra   : " + fechaRealVisitaObra + "  - - - ");
		this.fechaRealVisitaObra = fechaRealVisitaObra;
	}

	public Date getFechaRealPreguntas() {
		return fechaRealPreguntas;
	}

	public void setFechaRealPreguntas(Date fechaRealPreguntas) {
		this.fechaRealPreguntas = fechaRealPreguntas;
		logger.info(" - - -  fechaRealPreguntas   : " + fechaRealPreguntas + "  - - - ");
	}

	public Date getFechaRealRespuestas() {
		return fechaRealRespuestas;
	}

	public void setFechaRealRespuestas(Date fechaRealRespuestas) {
		logger.info(" - - -  fechaRealRespuestas   : " + fechaRealRespuestas + "  - - - ");
		this.fechaRealRespuestas = fechaRealRespuestas;
	}

	public Date getFechaRealPropuestas() {
		return fechaRealPropuestas;
	}

	public void setFechaRealPropuestas(Date fechaRealPropuestas) {
		logger.info(" - - -  fechaRealPropuestas   : " + fechaRealPropuestas + "  - - - ");
		this.fechaRealPropuestas = fechaRealPropuestas;
	}

	public Date getFechaRealRevisionTecnica() {
		return fechaRealRevisionTecnica;
	}

	public void setFechaRealRevisionTecnica(Date fechaRealRevisionTecnica) {
		logger.info(" - - -  fechaRealRevisionTecnica   : " + fechaRealRevisionTecnica + "  - - - ");
		this.fechaRealRevisionTecnica = fechaRealRevisionTecnica;
	}

	public Date getFechaRealChecklistTec() {
		return fechaRealChecklistTec;
	}

	public void setFechaRealChecklistTec(Date fechaRealChecklistTec) {
		logger.info(" - - -  fechaRealChecklistTec   : " + fechaRealChecklistTec + "  - - - ");
		this.fechaRealChecklistTec = fechaRealChecklistTec;
	}

	public Date getFechaRealCartaIntencion() {
		return fechaRealCartaIntencion;
	}

	public void setFechaRealCartaIntencion(Date fechaRealCartaIntencion) {
		logger.info(" - - -  fechaRealCartaIntencion   : " + fechaRealCartaIntencion + "  - - - ");
		this.fechaRealCartaIntencion = fechaRealCartaIntencion;
	}

	public String getPreciosCompetitivos() {
		return preciosCompetitivos;
	}

	public void setPreciosCompetitivos(String preciosCompetitivos) {
		logger.info(" - - -  preciosCompetitivos   : " + preciosCompetitivos + "  - - - ");
		this.preciosCompetitivos = preciosCompetitivos;
	}

	public String getEnPresupuesto() {
		return enPresupuesto;
	}

	public void setEnPresupuesto(String enPresupuesto) {
		logger.info(" - - -  enPresupuesto   : " + enPresupuesto + "  - - - ");
		this.enPresupuesto = enPresupuesto;
	}

	public Date getFechaRevisionPrecios() {
		return fechaRevisionPrecios;
	}

	public void setFechaRevisionPrecios(Date fechaRevisionPrecios) {
		logger.info(" - - -  fechaRevisionPrecios   : " + fechaRevisionPrecios + "  - - - ");
		this.fechaRevisionPrecios = fechaRevisionPrecios;
	}

	public Date getFechaRevisionCatalogo() {
		return fechaRevisionCatalogo;
	}

	public void setFechaRevisionCatalogo(Date fechaRevisionCatalogo) {
		logger.info(" - - -  fechaRevisionCatalogo   : " + fechaRevisionCatalogo + "  - - - ");
		this.fechaRevisionCatalogo = fechaRevisionCatalogo;
	}

	public Date getFechaNotifGanador() {
		return fechaNotifGanador;
	}

	public void setFechaNotifGanador(Date fechaNotifGanador) {
		logger.info(" - - -  fechaNotifGanador   : " + fechaNotifGanador + "  - - - ");
		this.fechaNotifGanador = fechaNotifGanador;
	}

	public Date getFechaVoBoGanador() {
		return fechaVoBoGanador;
	}

	public void setFechaVoBoGanador(Date fechaVoBoGanador) {
		logger.info(" - - -  fechaVoBoGanador   : " + fechaVoBoGanador + "  - - - ");
		this.fechaVoBoGanador = fechaVoBoGanador;
	}

	public Integer getIdConcurso() {
		return idConcurso;
	}

	public void setIdConcurso(Integer idConcurso) {
		logger.info(" - - -  idConcurso   : " + idConcurso + "  - - - ");
		this.idConcurso = idConcurso;
	}
	

}