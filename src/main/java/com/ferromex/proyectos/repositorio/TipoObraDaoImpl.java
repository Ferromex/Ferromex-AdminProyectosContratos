package com.ferromex.proyectos.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ferromex.proyectos.dominio.TipoObras;

@Repository(value = "tipoObraDao")
public class TipoObraDaoImpl implements TipoObraDAO {

	private static final Logger logger = LoggerFactory.getLogger(TipoObraDaoImpl.class);
	
    @PersistenceContext
    private EntityManager em;

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
	public List<TipoObras> obtenerListaTipoObrasProveedores() {
    	List <TipoObras> listObras= em.createQuery
    			("select p from " + TipoObras.class.getName() +" p order by p.idObra").getResultList();
    	logger.info(" - - -  Array Tipo Obra vacio - - - " +listObras.isEmpty());
        return listObras;
	}
    
    
    @Transactional(readOnly = true)
	public TipoObras obtenerTipoObraPorIdObra(Integer idObra) {
    	TipoObras listObras = (TipoObras)em.createQuery("select p from " + TipoObras.class.getName() +" p where p.idObra = "+ idObra +"").getSingleResult();
        return listObras;
	}
    
}

