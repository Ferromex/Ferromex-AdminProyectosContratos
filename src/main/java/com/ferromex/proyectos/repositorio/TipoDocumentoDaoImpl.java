package com.ferromex.proyectos.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ferromex.proyectos.dominio.TipoDocumento;

@Repository(value = "tipoDocumento")
public class TipoDocumentoDaoImpl implements TipoDocumentoDAO {

	private static final Logger logger = LoggerFactory.getLogger(TipoDocumentoDaoImpl.class);
	
    @PersistenceContext
    private EntityManager em;

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    public List<TipoDocumento> obtenerListaTipoDocumento() {
    	List <TipoDocumento> listaTipoDoc= em.createQuery
    			("select p from " + TipoDocumento.class.getName() +" p order by p.idTipoDocumento").getResultList();
    	logger.info(" - - -  Array Tipo Documento vacio - - - " +listaTipoDoc.isEmpty());
        return listaTipoDoc;
	}

}
