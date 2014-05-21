package com.ferromex.proyectos.dominio;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
	
	@Entity
	@Table(name="TPRY_PROYECTOS") 

	public class Proyecto implements Serializable {

		private static final long serialVersionUID = 1L;
		
		@Id
	    @Column(name = "PROY_ID")
		@GeneratedValue(strategy=GenerationType.AUTO, generator="proy_seq_gen")
		@SequenceGenerator(name="proy_seq_gen", sequenceName="PROYECTOS_SEQ")
		private Integer idProyecto;

		@Id 
		@Column(name = "PROY_CARPETA")
		@GeneratedValue(strategy=GenerationType.AUTO, generator="carpeta_seq_gen")
		@SequenceGenerator(name="carpeta_seq_gen", sequenceName="CARPETAS_SEQ")
		private Integer idCarpeta;
		
		@Column(name = "EMPR_ID")
		private String empresa;
		
		@Column(name = "PROY_NOMBRE")
		private String nombreProyecto;
	    
		@Column(name = "PROY_NOMBRE_CORTO")
		private String nombreCorto;
		
		@Column(name = "TOBR_ID")
		private Integer tipoObra;
	    
		@Column(name = "ORGP_ID")
		private Integer origenProyecto;
	    
		@Column(name = "DIVP_ID")
		private Integer division;
	    
		@Column(name = "PROY_FECHA_RECEP_INF")
		@Temporal(TemporalType.DATE)
		@DateTimeFormat (pattern="dd/mm/yy")
		private Date fechaRecepcion;

		@Column(name = "PROY_PRESUPUESTO")
		private Integer presupuesto;

		@Column(name = "PROY_ELEMENTO_PEP")
		private String elementoPEP;

		@Column(name = "PROY_CENTRO_COSTOS")
		private String centroCostos;

		@Column(name = "PROY_SOL_INVERSION")
		private String solicitudInversion;

		@Column(name = "PROY_FECH_ENTREGA_SAI")
		@Temporal(TemporalType.DATE)
		@DateTimeFormat (pattern="dd/mm/yy")
		private Date fechaEntregaSAI;

		@Column(name = "PROY_SOLICITUD_SAP")
		private Integer solicitudSAP;

		@Column(name = "PROY_FECH_INICIO_ESTIMADO")
		@Temporal(TemporalType.DATE)
		@DateTimeFormat (pattern="dd/mm/yy")
		private Date inicioEstimado;

		@Column(name = "PROY_FECH_FIN_ESTIMADO")
		@Temporal(TemporalType.DATE)
		@DateTimeFormat (pattern="dd/mm/yy")
		private Date finEstimado;
		
		@Column(name = "PROY_DURACION_PROY")
		private Integer duracionProy;
		

		@Column(name = "PROY_FECH_INICIO_REAL")
		@Temporal(TemporalType.DATE)
		@DateTimeFormat (pattern="dd/mm/yy")
		private Date inicioReal;

		@Column(name = "PROY_FECH_FIN_REAL")
		@Temporal(TemporalType.DATE)
		@DateTimeFormat (pattern="dd/mm/yy")
		private Date finReal;

		@Column(name = "EPRY_ID")
		private Integer estatusProyecto;
		
		@Column(name = "PROY_EST_INVITACION")
		@Temporal(TemporalType.DATE)
		@DateTimeFormat (pattern="dd/mm/yy")
		private Date fechEstInvitacion;
		
		@Column(name = "PROY_EST_VISITA_OBRA")
		@Temporal(TemporalType.DATE)
		@DateTimeFormat (pattern="dd/mm/yy")
		private Date fechEstVisitaObra;
		
		@Column(name = "PROY_EST_PREGUNTAS")
		@Temporal(TemporalType.DATE)
		@DateTimeFormat (pattern="dd/mm/yy")
		private Date fechEstPreguntas;
		
		@Column(name = "PROY_EST_RESPUESTAS")
		@Temporal(TemporalType.DATE)
		@DateTimeFormat (pattern="dd/mm/yy")
		private Date fechEstRespuestas;
		
		@Column(name = "PROY_EST_PROPUESTAS")
		@Temporal(TemporalType.DATE)
		@DateTimeFormat (pattern="dd/mm/yy")
		private Date fechEstPropuestas;
		
		@Column(name = "PROY_EST_REVISION_TEC")
		@Temporal(TemporalType.DATE)
		@DateTimeFormat (pattern="dd/mm/yy")
		private Date fechEstRevisionTecnica;
		
		@Column(name = "PROY_EST_CHECKLIST_TEC")
		@Temporal(TemporalType.DATE)
		@DateTimeFormat (pattern="dd/mm/yy")
		private Date fechEstChecklistTec;
		
		@Column(name = "PROY_EST_CARTA_INTENCION")
		@Temporal(TemporalType.DATE)
		@DateTimeFormat (pattern="dd/mm/yy")
		private Date fechEstCartaIntencion;
		
		@OneToMany(fetch = FetchType.EAGER, mappedBy="proyecto", cascade=CascadeType.ALL, orphanRemoval=true)
	    private Set<Concurso> concursos;

		public Integer getIdProyecto() {
			return idProyecto;
		}

		public void setIdProyecto(Integer idProyecto) {
			this.idProyecto = idProyecto;
		}

		public Integer getIdCarpeta() {
			return idCarpeta;
		}

		public void setIdCarpeta(Integer idCarpeta) {
			this.idCarpeta = idCarpeta;
		}

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

		public Integer getEstatusProyecto() {
			return estatusProyecto;
		}

		public void setEstatusProyecto(Integer estatusProyecto) {
			this.estatusProyecto = estatusProyecto;
		}

		public Date getFechEstInvitacion() {
			return fechEstInvitacion;
		}

		public void setFechEstInvitacion(Date fechEstInvitacion) {
			this.fechEstInvitacion = fechEstInvitacion;
		}

		public Date getFechEstVisitaObra() {
			return fechEstVisitaObra;
		}

		public void setFechEstVisitaObra(Date fechEstVisitaObra) {
			this.fechEstVisitaObra = fechEstVisitaObra;
		}

		public Date getFechEstPreguntas() {
			return fechEstPreguntas;
		}

		public void setFechEstPreguntas(Date fechEstPreguntas) {
			this.fechEstPreguntas = fechEstPreguntas;
		}

		public Date getFechEstRespuestas() {
			return fechEstRespuestas;
		}

		public void setFechEstRespuestas(Date fechEstRespuestas) {
			this.fechEstRespuestas = fechEstRespuestas;
		}

		public Date getFechEstPropuestas() {
			return fechEstPropuestas;
		}

		public void setFechEstPropuestas(Date fechEstPropuestas) {
			this.fechEstPropuestas = fechEstPropuestas;
		}

		public Date getFechEstRevisionTecnica() {
			return fechEstRevisionTecnica;
		}

		public void setFechEstRevisionTecnica(Date fechEstRevisionTecnica) {
			this.fechEstRevisionTecnica = fechEstRevisionTecnica;
		}

		public Date getFechEstChecklistTec() {
			return fechEstChecklistTec;
		}

		public void setFechEstChecklistTec(Date fechEstChecklistTec) {
			this.fechEstChecklistTec = fechEstChecklistTec;
		}

		public Date getFechEstCartaIntencion() {
			return fechEstCartaIntencion;
		}

		public void setFechEstCartaIntencion(Date fechEstCartaIntencion) {
			this.fechEstCartaIntencion = fechEstCartaIntencion;
		}

		public Set<Concurso> getConcursos() {
			return concursos;
		}

		public void setConcursos(Set<Concurso> concursos) {
			this.concursos = concursos;
		}

		@Override
		public String toString() {
			return "Proyecto [idProyecto=" + idProyecto + ", idCarpeta="
					+ idCarpeta + ", empresa=" + empresa + ", nombreProyecto="
					+ nombreProyecto + ", nombreCorto=" + nombreCorto
					+ ", tipoObra=" + tipoObra + ", origenProyecto="
					+ origenProyecto + ", division=" + division
					+ ", fechaRecepcion=" + fechaRecepcion + ", presupuesto="
					+ presupuesto + ", elementoPEP=" + elementoPEP
					+ ", centroCostos=" + centroCostos
					+ ", solicitudInversion=" + solicitudInversion
					+ ", fechaEntregaSAI=" + fechaEntregaSAI
					+ ", solicitudSAP=" + solicitudSAP + ", inicioEstimado="
					+ inicioEstimado + ", finEstimado=" + finEstimado
					+ ", duracionProy=" + duracionProy + ", inicioReal="
					+ inicioReal + ", finReal=" + finReal
					+ ", estatusProyecto=" + estatusProyecto
					+ ", fechEstInvitacion=" + fechEstInvitacion
					+ ", fechEstVisitaObra=" + fechEstVisitaObra
					+ ", fechEstPreguntas=" + fechEstPreguntas
					+ ", fechEstRespuestas=" + fechEstRespuestas
					+ ", fechEstPropuestas=" + fechEstPropuestas
					+ ", fechEstRevisionTecnica=" + fechEstRevisionTecnica
					+ ", fechEstChecklistTec=" + fechEstChecklistTec
					+ ", fechEstCartaIntencion=" + fechEstCartaIntencion + "]";
		}

	}
