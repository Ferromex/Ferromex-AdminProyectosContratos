package com.ferromex.proyectos.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ferromex.proyectos.dominio.DocumentoOficial;

@Repository(value = "documentoOficialDAO")
public class DocumentoOficialDaoImpl implements DocumentoOficialDAO {

	private static final Logger logger = LoggerFactory.getLogger(DocumentoOficialDaoImpl.class);
	
    @PersistenceContext
    private EntityManager em;
    
    
    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
	public List<DocumentoOficial> obtenerListaDocsOficiales() {
    	List <DocumentoOficial> docOficialList= em.createQuery
    			("select p from " + DocumentoOficial.class.getName() +" p order by p.idDocumento").getResultList();
    	logger.info(" - - -  Array Docs Oficiales vacio - - - " +docOficialList.isEmpty());
        return docOficialList;
	}

    @Transactional(readOnly = false)
	public void guardarDocumentoOficial(DocumentoOficial docOficial) {
    	logger.info(" - - -  Iniciando Save Documento - - - ");
    	em.persist(docOficial);
		int year = docOficial.getFechaElaboracion().getYear() - 100;
		
		String folio = "";
		int serie = docOficial.getIdDocumento();
		logger.info(" - - -  serie - - - " + serie);
		
		if(docOficial.getTipoDocumento().getIdTipoDocumento() == 10)
			{
				folio = docOficial.getEmpresa().getIdEmpresa() + "-GIBP-" + serie  + "-" + docOficial.getTipoObra() + "-" + year;
				logger.info(" - - -  CONTRATO - - - ");
			}
		else
			{
				folio = docOficial.getEmpresa().getIdEmpresa() + "-GIBP-" + serie  + "-" + year;
				logger.info(" - - -  Otro Documento - - - ");
				docOficial.setTipoObra(null);
			}
		logger.info(" - - -  Folio - - - " + folio);
		docOficial.setFolio(folio);
		

		
    	
	}

}