package com.ferromex.proyectos.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ferromex.proyectos.dominio.Division;

@Repository(value = "divisionDao")
public class DivisionDaoImpl implements DivisionDAO {

	private static final Logger logger = LoggerFactory.getLogger(DivisionDaoImpl.class);
	
    @PersistenceContext
    private EntityManager em;

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
	public List<Division> obtenerListaDivisiones() {
    	List <Division> listaDivisiones= em.createQuery
    			("select p from " + Division.class.getName() +" p order by p.idDivision")
    			.getResultList();
    	logger.info(" - - -  Array Divisiones vacio - - - " +listaDivisiones.isEmpty());
        return listaDivisiones;
	}
}
