package com.ferromex.proyectos.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ferromex.proyectos.dominio.OrigenProyecto;

@Repository(value = "origenProyectoDao")
public class OrigenProyectoDaoImpl implements OrigenProyectoDAO {

	private static final Logger logger = LoggerFactory.getLogger(OrigenProyectoDaoImpl.class);
	
    @PersistenceContext
    private EntityManager em;

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
	public List<OrigenProyecto> obtenerListaOrigenProyecto() {
    	List <OrigenProyecto> listaOrigenProyecto= em.createQuery
    			("select p from " + OrigenProyecto.class.getName() +" p order by p.origenProyectoId")
    			.getResultList();
    	logger.info(" - - -  Array OrigenProyecto vacio - - - " +listaOrigenProyecto.isEmpty());
        return listaOrigenProyecto;
	}
}

