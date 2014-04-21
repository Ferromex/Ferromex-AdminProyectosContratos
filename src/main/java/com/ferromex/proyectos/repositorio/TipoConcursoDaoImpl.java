package com.ferromex.proyectos.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ferromex.proyectos.dominio.TipoConcurso;

@Repository(value = "tipoConcursoDao")
public class TipoConcursoDaoImpl implements TipoConcursoDAO {

	private static final Logger logger = LoggerFactory.getLogger(TipoConcursoDaoImpl.class);
	
    @PersistenceContext
    private EntityManager em;

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
	public List<TipoConcurso> obtenerListaTipoConcurso() {
    	List <TipoConcurso> listTipoC= em.createQuery
    			("select p from " + TipoConcurso.class.getName() +" p order by p.idConcurso").getResultList();
    	logger.info(" - - -  Array Tipo Concurso vacio - - - " +listTipoC.isEmpty());
        return listTipoC;
	}
}

