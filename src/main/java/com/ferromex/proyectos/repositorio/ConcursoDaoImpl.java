package com.ferromex.proyectos.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ferromex.proyectos.dominio.Concurso;

@Repository(value = "concursoDAO")
public class ConcursoDaoImpl implements ConcursoDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(ConcursoDaoImpl.class);


    @PersistenceContext
    private EntityManager em;
    
    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
	public List<Concurso> obtenerListaConcursos() {
    	List <Concurso> concursoList= em.createQuery
    			("select p from " + Concurso.class.getName() +" p order by p.idProveedor").getResultList();
    	logger.info(" - - -  Array Concurso vacio - - - " +concursoList.isEmpty());
        return concursoList;
	}

    @Transactional(readOnly = false)
	public int guardarConcurso(Concurso concurso) {
    	logger.info(" - - -  Iniciando Save Concurso - - - ");
    	em.persist(concurso);
    	return concurso.getIdConcurso();
	}

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
	public List<Concurso> obtenerConcursoPorIdProy(Integer idProy) {
		logger.info(" - - - Buscar Concursos del proyecto: " + idProy + " - - - ");
		List <Concurso> concursoList= em.createQuery
    		("select p from " + Concurso.class.getName() +" p where p.idProyecto=:idProy")
    		.setParameter("idProy",idProy)
    		.getResultList();
			
		return concursoList;
	}

    @Transactional(readOnly = true)
    public Concurso obtenerConcursoPorId(Integer idConcurso) {
		logger.info(" - - - Buscar Concurso: " + idConcurso + " - - - ");
		Concurso concurso =  (Concurso) em.createQuery
    		("select p from " + Concurso.class.getName() +" p where p.idConcurso=:idConcurso")
    		.setParameter("idConcurso",idConcurso)
    		.getSingleResult();
			
		return concurso;
	}

    @Transactional(readOnly = false)
	public void actualizarConcurso(Concurso concurso) {
    	logger.info(" - - -  Iniciando Actualziar concurso - - - ");
    	em.merge(concurso);
	}

}






