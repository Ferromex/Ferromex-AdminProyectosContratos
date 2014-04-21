package com.ferromex.proyectos.repositorio;

import java.util.List;

import com.ferromex.proyectos.dominio.DocumentoOficial;

public interface DocumentoOficialDAO {

    public List<DocumentoOficial> obtenerListaDocsOficiales();
    
    public void guardarDocumentoOficial(DocumentoOficial docOficial);

}
