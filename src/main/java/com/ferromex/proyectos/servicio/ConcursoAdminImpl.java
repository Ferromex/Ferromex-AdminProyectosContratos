package com.ferromex.proyectos.servicio;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferromex.proyectos.dominio.Concurso;
import com.ferromex.proyectos.dominio.Proyecto;
import com.ferromex.proyectos.dominio.TipoConcurso;
import com.ferromex.proyectos.forma.ConcursoForm;
import com.ferromex.proyectos.repositorio.ConcursoDAO;
import com.ferromex.proyectos.repositorio.ProyectoDAO;
import com.ferromex.proyectos.repositorio.TipoConcursoDAO;

@Service
public class ConcursoAdminImpl implements ConcursoAdmin{

	private static final long serialVersionUID = 1L;

	private static final Logger logger = LoggerFactory.getLogger(ConcursoAdminImpl.class);
	
    
    @Autowired
    private ConcursoDAO concursoDAO;
    
    @Autowired
    private ProyectoDAO proyectoDAO;

    @Autowired
    private TipoConcursoDAO tipoConcursoDAO;


    public void setConcursoDao(ConcursoDAO concursoDAO) {
        this.concursoDAO = concursoDAO;
    }
    
	@Override
	public int crearConcurso(Concurso concurso) {
		logger.info(" - - -  Metodo Crear Concurso  " + concurso.toString()+ "- - - ");
		return concursoDAO.guardarConcurso(concurso);
	}

	@Override
	public List<Concurso> obtenerConcursos() {
		logger.info("- - - Obtener Concursos - - - ");
		return concursoDAO.obtenerListaConcursos();
	}

	@Override
	public void actualizarConcurso(ConcursoForm concursoForm) {
		
		Proyecto proyecto = proyectoDAO.consultarProyectoPorIdProy(concursoForm.getIdProyecto());

		logger.info("- - -  proyecto " + proyecto.toString()+ " - - - ");
		
		Concurso concurso = new Concurso();
		
    	List<TipoConcurso> catConcursos = tipoConcursoDAO.obtenerListaTipoConcurso();
    	
		Iterator<TipoConcurso> iterator = catConcursos.iterator();
		
		while (iterator.hasNext()) {
			TipoConcurso tipoConcurso = iterator.next();

		    if (tipoConcurso.getIdConcurso() == concursoForm.getTipoConcurso()) {
		    	concurso.setTipoConcurso(tipoConcurso);
		    }
		}

		concurso.setFechRealInvitacion(concursoForm.getFechaRealInvitacion());
		concurso.setFechRealVisitaObra(concursoForm.getFechaRealVisitaObra());
		concurso.setFechRealPreguntas(concursoForm.getFechaRealPreguntas());
		concurso.setFechRealRespuestas(concursoForm.getFechaRealRespuestas());
		concurso.setFechRealPropuestas(concursoForm.getFechaRealPropuestas());
		concurso.setFechRealRevisionTecnica(concursoForm.getFechaRealRevisionTecnica());
		concurso.setFechRealChecklistTec(concursoForm.getFechaRealChecklistTec());
		concurso.setFechRealCartaIntencion(concursoForm.getFechaRealCartaIntencion());
		concurso.setPreciosCompetitivos(concursoForm.getPreciosCompetitivos());
		concurso.setEnPresupuesto(concursoForm.getEnPresupuesto());
		concurso.setFechRevisionPrecios(concursoForm.getFechaRevisionPrecios());
		concurso.setFechRevisionCatalogo(concursoForm.getFechaRevisionCatalogo());
		concurso.setFechNotifGanador(concursoForm.getFechaNotifGanador());
		concurso.setFechVoBoGanador(concursoForm.getFechaVoBoGanador());
		concurso.setProyecto(proyecto);
		
		
		
		Set<Concurso> concursos = proyecto.getConcursos();
		
		concursos.add(concurso);
		
		proyecto.setConcursos(concursos);
		
		proyectoDAO.actualizarProyecto(proyecto);

	}

	@Override
	public Concurso consultarConcursoPorId(int idConcurso) {
		logger.info("- - - Obtener Concurso - - - ");
		return concursoDAO.obtenerConcursoPorId(idConcurso);
	}
}

