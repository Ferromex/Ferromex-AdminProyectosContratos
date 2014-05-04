package com.ferromex.proyectos.servicio;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferromex.proyectos.dominio.TipoObras;
import com.ferromex.proyectos.repositorio.TipoObraDAO;

@Service
public class TipoObraAdminImpl implements TipoObraAdmin{

	private static final long serialVersionUID = 1L;

	private static final Logger logger = LoggerFactory.getLogger(TipoObraAdminImpl.class);
	
    
    @Autowired
    private TipoObraDAO tipoObraDao;

    public void setTipoObraDao(TipoObraDAO tipoObraDao) {
        this.tipoObraDao = tipoObraDao;
    }

	@Override
	public List<TipoObras> obtenerTipoObraProveedor() {
		logger.info("- - - Obtener Tipo de Obras - - - ");
		return tipoObraDao.obtenerListaTipoObrasProveedores();
	}
	
	@Override
	public TipoObras obtenerTipoObraPorIdObra(Integer idObra) {
		logger.info("- - - Obtener Tipo de Obras - - - ");
		return tipoObraDao.obtenerTipoObraPorIdObra(idObra);
	}

}


