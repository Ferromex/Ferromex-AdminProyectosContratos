package com.ferromex.proyectos.servicio;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferromex.proyectos.dominio.EstatusProyecto;
import com.ferromex.proyectos.repositorio.EstatusProyectoDAO;

@Service
public class EstatusProyectoAdminImpl implements EstatusProyectoAdmin{

	private static final long serialVersionUID = 1L;

	private static final Logger logger = LoggerFactory.getLogger(EstatusProyectoAdminImpl.class);
	
    
    @Autowired
    private EstatusProyectoDAO estatusProyectoDAO;

    public void setEstatusProyectoDao(EstatusProyectoDAO estatusProyectoDAO) {
        this.estatusProyectoDAO = estatusProyectoDAO;
    }

	@Override
	public List<EstatusProyecto> obtenerEstatusProyecto() {
				logger.info("- - - Obtener Estatus Proyectos - - - ");
		return estatusProyectoDAO.obtenerListaEstatusProyecto();
	}

}


