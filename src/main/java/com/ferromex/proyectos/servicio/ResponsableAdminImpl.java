package com.ferromex.proyectos.servicio;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferromex.proyectos.dominio.Responsable;
import com.ferromex.proyectos.repositorio.ResponsableDAO;

@Service
public class ResponsableAdminImpl implements ResponsableAdmin{

	private static final Logger logger = LoggerFactory.getLogger(ResponsableAdminImpl.class);
	
    private static final long serialVersionUID = 1L;
    
    @Autowired
    private ResponsableDAO responsableDao;

    @Override
	public List<Responsable> obtenerResponsables() {
		logger.info("- - - Obtener Responsables - - - ");
		return this.responsableDao.obtenerListaResponsables();
	}

}
