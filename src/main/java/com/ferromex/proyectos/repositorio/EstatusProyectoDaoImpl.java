package com.ferromex.proyectos.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ferromex.proyectos.dominio.EstatusProyecto;

@Repository(value = "estatusProyectoDao")
public class EstatusProyectoDaoImpl implements EstatusProyectoDAO {

	private static final Logger logger = LoggerFactory.getLogger(EstatusProyectoDaoImpl.class);
	
    @PersistenceContext
    private EntityManager em;

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
	public List<EstatusProyecto> obtenerListaEstatusProyecto() {
    	List <EstatusProyecto> listEstatusp= em.createQuery
    			("select p from " + EstatusProyecto.class.getName() +" p order by p.idEstatus").getResultList();
    	logger.info(" - - -  Array Tipo Obra vacio - - - " +listEstatusp.isEmpty());
        return listEstatusp;
	}
}

