package com.ferromex.proyectos.servicio;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferromex.proyectos.repositorio.ZonaDAO;
import com.ferromex.proyectos.dominio.Zona;

@Service
public class ZonAdminImpl implements ZonaAdmin{

	private static final long serialVersionUID = 1L;

	private static final Logger logger = LoggerFactory.getLogger(ZonAdminImpl.class);
	
    
    @Autowired
    private ZonaDAO zonaDao;

    public void setZonaDao(ZonaDAO zonaDao) {
        this.zonaDao = zonaDao;
    }

    @Override
	public List<Zona> obtenerZonasProveedor() {
		logger.info("- - - Obtener Zonas - - - ");
		return zonaDao.obtenerListaZonasProveedores();
	}

}

