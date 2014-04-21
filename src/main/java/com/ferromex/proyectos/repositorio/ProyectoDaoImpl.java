package com.ferromex.proyectos.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ferromex.proyectos.dominio.Proyecto;

@Repository(value = "proyectoDAO")
public class ProyectoDaoImpl implements ProyectoDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(ProyectoDaoImpl.class);

    @PersistenceContext
    private EntityManager em;
    
    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
	public List<Proyecto> obtenerListaProyectos() {
    	logger.info(" - - -  Obtener Lista de Proyectos - - - ");
    	List <Proyecto> proyectoList= em.createQuery
    			("select p from " + Proyecto.class.getName() +" p order by p.idProyecto")
    			.getResultList();
    	logger.info(" - - -  Array Proyectos vacio - - - " +proyectoList.isEmpty());
        return proyectoList;
	}

    @Transactional(readOnly = false)
	public int guardarProyecto(Proyecto proyecto) {
    	logger.info(" - - -  Iniciando Save Proyecto - - - ");
    	em.persist(proyecto);
    	logger.info(" - - -  Save Proyecto - - - " + proyecto.getIdCarpeta());
    	logger.info(" - - -  Save Proyecto - - - " + proyecto.getIdProyecto());
    	return proyecto.getIdProyecto();
		
	}

	@Override
	public Proyecto consultarProyectoPorIdProy(int idProy) {
		logger.info(" - - - Buscar Proyecto: " + idProy + " - - - ");
		Proyecto proyecto =  (Proyecto) em.createQuery
    		("select p from " + Proyecto.class.getName() +" p where p.idProyecto=:idProy")
    		.setParameter("idProy",idProy)
    		.getSingleResult();
			
		return proyecto;
	}

    @Transactional(readOnly = false)
	public void actualizarProyecto(Proyecto proyecto) {
    	logger.info(" - - -  Iniciando Actualziar proyecto " +proyecto.toString() + " - - - ");
    	em.merge(proyecto);
	}
}






