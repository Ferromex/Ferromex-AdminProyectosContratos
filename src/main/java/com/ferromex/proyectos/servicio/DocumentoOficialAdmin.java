package com.ferromex.proyectos.servicio;

import java.io.Serializable;
import java.util.List;

import com.ferromex.proyectos.forma.DocumentoOficialForm;
import com.ferromex.proyectos.dominio.DocumentoOficial;

public interface DocumentoOficialAdmin extends Serializable {

	public void crearDocumentoOficial(DocumentoOficialForm documentoOficialForm);
    
    public List<DocumentoOficial> obtenerDocumentosOficiales();

    
}
