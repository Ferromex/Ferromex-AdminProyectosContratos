package com.ferromex.proyectos.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ferromex.proyectos.dominio.Responsable;

@Repository(value = "responsableDao")
public class ResponsableDaoImpl implements ResponsableDAO {

	private static final Logger logger = LoggerFactory.getLogger(ResponsableDaoImpl.class);
	
    @PersistenceContext
    private EntityManager em;


    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    public List<Responsable> obtenerListaResponsables() {
    	
    	List <Responsable> listaResp= em.createQuery
    			("select p from " + Responsable.class.getName() +" p order by p.idResponsable").getResultList();
    	logger.info(" - - -  Array Responsables vacio - - - " +listaResp.isEmpty());
        return listaResp;
    }
}
