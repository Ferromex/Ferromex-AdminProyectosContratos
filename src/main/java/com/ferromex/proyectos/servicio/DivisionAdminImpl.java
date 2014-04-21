package com.ferromex.proyectos.servicio;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferromex.proyectos.dominio.Division;
import com.ferromex.proyectos.repositorio.DivisionDAO;

@Service
public class DivisionAdminImpl implements DivisionAdmin{

	private static final Logger logger = LoggerFactory.getLogger(DivisionAdminImpl.class);
	
    private static final long serialVersionUID = 1L;
    
    @Autowired
    private DivisionDAO divisionDao;

	@Override
	public List<Division> obtenerDivisiones() {
		logger.info("- - - Obtener Divisiones - - - ");
		return this.divisionDao.obtenerListaDivisiones();
	}

}
