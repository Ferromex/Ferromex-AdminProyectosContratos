package com.ferromex.proyectos.servicio;

import java.io.Serializable;
import java.util.List;

import com.ferromex.proyectos.dominio.DocumentoOficial;

public interface DocumentoOficialAdmin extends Serializable {

	public void crearDocumentoOficial(DocumentoOficial documentoOficial);
    
    public List<DocumentoOficial> obtenerDocumentosOficiales();

    
}
