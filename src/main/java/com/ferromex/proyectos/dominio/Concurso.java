package com.ferromex.proyectos.dominio;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
	
	@Entity
	@Table(name="TPRY_CONCURSOS") 

	public class Concurso implements Serializable {

		private static final long serialVersionUID = 1L;
		
		@Id
	    @Column(name = "CONC_ID")
		@GeneratedValue(strategy=GenerationType.AUTO, generator="concurso_seq_gen")
		@SequenceGenerator(name="concurso_seq_gen", sequenceName="CONCURSO_SEQ")
		private Integer idConcurso;

		@ManyToOne
		@JoinColumns({@JoinColumn(name = "PROY_ID"), @JoinColumn(name = "PROY_CARPETA")})
		private Proyecto proyecto;

		@ManyToOne 
		@JoinColumn(name = "TCON_ID") 
		private TipoConcurso tipoConcurso;

		@Column(name = "CONC_REAL_INVITACION")
		@Temporal(TemporalType.DATE)
		@DateTimeFormat (pattern="dd/mm/yy")
		private Date fechRealInvitacion;
		
		@Column(name = "CONC_REAL_VISITA_OBRA")
		@Temporal(TemporalType.DATE)
		@DateTimeFormat (pattern="dd/mm/yy")
		private Date fechRealVisitaObra;
		
		@Column(name = "CONC_REAL_PREGUNTAS")
		@Temporal(TemporalType.DATE)
		@DateTimeFormat (pattern="dd/mm/yy")
		private Date fechRealPreguntas;
		
		@Column(name = "CONC_REAL_RESPUESTAS")
		@Temporal(TemporalType.DATE)
		@DateTimeFormat (pattern="dd/mm/yy")
		private Date fechRealRespuestas;
		
		@Column(name = "CONC_REAL_PROPUESTAS")
		@Temporal(TemporalType.DATE)
		@DateTimeFormat (pattern="dd/mm/yy")
		private Date fechRealPropuestas;
		
		@Column(name = "CONC_REAL_REVISION_TEC")
		@Temporal(TemporalType.DATE)
		@DateTimeFormat (pattern="dd/mm/yy")
		private Date fechRealRevisionTecnica;
		
		@Column(name = "CONC_REAL_CHECKLIST_TEC")
		@Temporal(TemporalType.DATE)
		@DateTimeFormat (pattern="dd/mm/yy")
		private Date fechRealChecklistTec;
		
		@Column(name = "CONC_REAL_CARTA_INTENCION")
		@Temporal(TemporalType.DATE)
		@DateTimeFormat (pattern="dd/mm/yy")
		private Date fechRealCartaIntencion;
		
		@Column(name = "CONC_PRECIOS_COMPETITIVOS")
		private String preciosCompetitivos;
		
		@Column(name = "CONC_EN_PRESUPUESTO")
		private String enPresupuesto;
		
		@Column(name = "CONC_REVISION_PRECIOS")
		@Temporal(TemporalType.DATE)
		@DateTimeFormat (pattern="dd/mm/yy")
		private Date fechRevisionPrecios;
		
		@Column(name = "CONC_REVISION_CATALOGO")
		@Temporal(TemporalType.DATE)
		@DateTimeFormat (pattern="dd/mm/yy")
		private Date fechRevisionCatalogo;
		
		@Column(name = "CONC_NOTIF_GANADOR")
		@Temporal(TemporalType.DATE)
		@DateTimeFormat (pattern="dd/mm/yy")
		private Date fechNotifGanador;
		
		@Column(name = "CONC_VOBO_GANADOR")
		@Temporal(TemporalType.DATE)
		@DateTimeFormat (pattern="dd/mm/yy")
		private Date fechVoBoGanador;

		public Integer getIdConcurso() {
			return idConcurso;
		}

		public void setIdConcurso(Integer idConcurso) {
			this.idConcurso = idConcurso;
		}

		public TipoConcurso getTipoConcurso() {
			return tipoConcurso;
		}

		public void setTipoConcurso(TipoConcurso tipoConcurso) {
			this.tipoConcurso = tipoConcurso;
		}


		public Date getFechRealInvitacion() {
			return fechRealInvitacion;
		}

		public void setFechRealInvitacion(Date fechRealInvitacion) {
			this.fechRealInvitacion = fechRealInvitacion;
		}

		public Date getFechRealVisitaObra() {
			return fechRealVisitaObra;
		}

		public void setFechRealVisitaObra(Date fechRealVisitaObra) {
			this.fechRealVisitaObra = fechRealVisitaObra;
		}

		public Date getFechRealPreguntas() {
			return fechRealPreguntas;
		}

		public void setFechRealPreguntas(Date fechRealPreguntas) {
			this.fechRealPreguntas = fechRealPreguntas;
		}

		public Date getFechRealRespuestas() {
			return fechRealRespuestas;
		}

		public void setFechRealRespuestas(Date fechRealRespuestas) {
			this.fechRealRespuestas = fechRealRespuestas;
		}

		public Date getFechRealPropuestas() {
			return fechRealPropuestas;
		}

		public void setFechRealPropuestas(Date fechRealPropuestas) {
			this.fechRealPropuestas = fechRealPropuestas;
		}

		public Date getFechRealRevisionTecnica() {
			return fechRealRevisionTecnica;
		}

		public void setFechRealRevisionTecnica(Date fechRealRevisionTecnica) {
			this.fechRealRevisionTecnica = fechRealRevisionTecnica;
		}

		public Date getFechRealChecklistTec() {
			return fechRealChecklistTec;
		}

		public void setFechRealChecklistTec(Date fechRealChecklistTec) {
			this.fechRealChecklistTec = fechRealChecklistTec;
		}

		public Date getFechRealCartaIntencion() {
			return fechRealCartaIntencion;
		}

		public void setFechRealCartaIntencion(Date fechRealCartaIntencion) {
			this.fechRealCartaIntencion = fechRealCartaIntencion;
		}

		public String getPreciosCompetitivos() {
			return preciosCompetitivos;
		}

		public void setPreciosCompetitivos(String preciosCompetitivos) {
			this.preciosCompetitivos = preciosCompetitivos;
		}

		public String getEnPresupuesto() {
			return enPresupuesto;
		}

		public void setEnPresupuesto(String enPresupuesto) {
			this.enPresupuesto = enPresupuesto;
		}

		public Date getFechRevisionPrecios() {
			return fechRevisionPrecios;
		}

		public void setFechRevisionPrecios(Date fechRevisionPrecios) {
			this.fechRevisionPrecios = fechRevisionPrecios;
		}

		public Date getFechRevisionCatalogo() {
			return fechRevisionCatalogo;
		}

		public void setFechRevisionCatalogo(Date fechRevisionCatalogo) {
			this.fechRevisionCatalogo = fechRevisionCatalogo;
		}

		public Date getFechNotifGanador() {
			return fechNotifGanador;
		}

		public void setFechNotifGanador(Date fechNotifGanador) {
			this.fechNotifGanador = fechNotifGanador;
		}

		public Date getFechVoBoGanador() {
			return fechVoBoGanador;
		}

		public void setFechVoBoGanador(Date fechVoBoGanador) {
			this.fechVoBoGanador = fechVoBoGanador;
		}

		public Proyecto getProyecto() {
			return proyecto;
		}

		public void setProyecto(Proyecto proyecto) {
			this.proyecto = proyecto;
		}

		@Override
		public String toString() {
			return "Concurso [idConcurso=" + idConcurso 
					+ ", Proyecto=" + proyecto
					+ ", tipoConcurso=" + tipoConcurso
					+ ", fechRealInvitacion=" + fechRealInvitacion
					+ ", fechRealVisitaObra=" + fechRealVisitaObra
					+ ", fechRealPreguntas=" + fechRealPreguntas
					+ ", fechRealRespuestas=" + fechRealRespuestas
					+ ", fechRealPropuestas=" + fechRealPropuestas
					+ ", fechRealRevisionTecnica=" + fechRealRevisionTecnica
					+ ", fechRealChecklistTec=" + fechRealChecklistTec
					+ ", fechRealCartaIntencion=" + fechRealCartaIntencion
					+ ", preciosCompetitivos=" + preciosCompetitivos
					+ ", enPresupuesto=" + enPresupuesto
					+ ", fechRevisionPrecios=" + fechRevisionPrecios
					+ ", fechRevisionCatalogo=" + fechRevisionCatalogo
					+ ", fechNotifGanador=" + fechNotifGanador
					+ ", fechVoBoGanador=" + fechVoBoGanador + "]";
		}

}