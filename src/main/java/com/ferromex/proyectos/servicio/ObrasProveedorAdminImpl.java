package com.ferromex.proyectos.servicio;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferromex.proyectos.dominio.ObrasProveedor;
import com.ferromex.proyectos.repositorio.ObrasProveedorDAO;

@Service
public class ObrasProveedorAdminImpl implements ObrasProveedorAdmin{

	private static final long serialVersionUID = 1L;

	private static final Logger logger = LoggerFactory.getLogger(ObrasProveedorAdminImpl.class);
	
    
    @Autowired
    private ObrasProveedorDAO obrasProveedorDao;

    public void setObrasProveedorDao(ObrasProveedorDAO obrasProveedorDao) {
        this.obrasProveedorDao = obrasProveedorDao;
    }
    
	@Override
	public void crearRelObrasProveedor(ObrasProveedor obrasProveedor) {
		logger.info(" - - -  Metodo Crear obrasProveedor  " + obrasProveedor.toString()+ "- - - ");
		obrasProveedorDao.guardarObrasProveedor(obrasProveedor);
	}

	@Override
	public List<ObrasProveedor> consultarObrasPorIdProveedor(int idProveedor) {
		logger.info("- - - Obtener Obras Proveedor - - - ");
		return obrasProveedorDao.obtenerObrasPorIdProveedor(idProveedor);
	}

	@Override
	public void eliminarObrasProveedor(int idProveedor) {
		logger.info("- - - Eliminar Obras Proveedor " + idProveedor +" - - - ");
		obrasProveedorDao.eliminarRelacionesProveedor(idProveedor);
		
	}

}

