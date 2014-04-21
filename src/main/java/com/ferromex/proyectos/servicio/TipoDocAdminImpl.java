package com.ferromex.proyectos.servicio;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferromex.proyectos.dominio.TipoDocumento;
import com.ferromex.proyectos.repositorio.TipoDocumentoDAO;

@Service
public class TipoDocAdminImpl implements TipoDocAdmin{

	private static final Logger logger = LoggerFactory.getLogger(TipoDocAdminImpl.class);
	
    private static final long serialVersionUID = 1L;
    
    @Autowired
    private TipoDocumentoDAO tipoDocumentoDAO;

	@Override
	public List<TipoDocumento> obtenerTipoDocumento() {
		logger.info("- - - Obtener Tipos de Documento - - - ");
		return this.tipoDocumentoDAO.obtenerListaTipoDocumento();
	}

}
