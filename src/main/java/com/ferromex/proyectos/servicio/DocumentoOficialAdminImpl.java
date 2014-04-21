package com.ferromex.proyectos.servicio;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferromex.proyectos.dominio.DocumentoOficial;
import com.ferromex.proyectos.repositorio.DocumentoOficialDAO;

@Service
public class DocumentoOficialAdminImpl implements DocumentoOficialAdmin {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private static final Logger logger = LoggerFactory.getLogger(DocumentoOficialAdminImpl.class);
	
    
    @Autowired
    private DocumentoOficialDAO documentoOficialDao;

    public void setDocumentoOficialDao(DocumentoOficialDAO documentoOficialDao) {
        this.documentoOficialDao = documentoOficialDao;
    }
    
	@Override
	public void crearDocumentoOficial(DocumentoOficial documentoOficial) {
		
		logger.info(" - - -  Metodo Crear Documento Oficial  " + documentoOficial.toString()+ "- - - ");
		
		documentoOficialDao.guardarDocumentoOficial(documentoOficial);

	}

	@Override
	public List<DocumentoOficial> obtenerDocumentosOficiales() {
		return documentoOficialDao.obtenerListaDocsOficiales();
	}

}