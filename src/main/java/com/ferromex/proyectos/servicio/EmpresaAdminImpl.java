package com.ferromex.proyectos.servicio;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferromex.proyectos.dominio.Empresa;
import com.ferromex.proyectos.repositorio.EmpresaDAO;

@Service
public class EmpresaAdminImpl implements EmpresaAdmin{

	private static final Logger logger = LoggerFactory.getLogger(EmpresaAdminImpl.class);
	
    private static final long serialVersionUID = 1L;
    
    @Autowired
    private EmpresaDAO empresaDao;

	@Override
	public List<Empresa> obtenerEmpresas() {
		logger.info("- - - Obtener Empresas - - - ");
		return this.empresaDao.obtenerListaEmpresas();
	}

}
