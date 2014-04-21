package com.ferromex.proyectos.servicio;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferromex.proyectos.dominio.OrigenProyecto;
import com.ferromex.proyectos.repositorio.OrigenProyectoDAO;

@Service
public class OrigenProyectoAdminImpl implements OrigenProyectoAdmin{

	private static final Logger logger = LoggerFactory.getLogger(OrigenProyectoAdminImpl.class);
	
    private static final long serialVersionUID = 1L;
    
    @Autowired
    private OrigenProyectoDAO origenProyectoDao;

	@Override
	public List<OrigenProyecto> obtenerOrigenProyecto() {
		logger.info("- - - Obtener OrigenProyecto - - - ");
		return this.origenProyectoDao.obtenerListaOrigenProyecto();
	}

}
