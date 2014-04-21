package com.ferromex.proyectos.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ferromex.proyectos.dominio.Zona;

@Repository(value = "zonaDao")
public class ZonaDaoImpl implements ZonaDAO {

	private static final Logger logger = LoggerFactory.getLogger(ZonaDaoImpl.class);
	
    @PersistenceContext
    private EntityManager em;

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
	public List<Zona> obtenerListaZonasProveedores() {
    	List <Zona> listZonas= em.createQuery
    			("select p from " + Zona.class.getName() +" p order by p.idZona").getResultList();
    	logger.info(" - - -  Array Zona vacio - - - " +listZonas.isEmpty());
        return listZonas;
	}
}

